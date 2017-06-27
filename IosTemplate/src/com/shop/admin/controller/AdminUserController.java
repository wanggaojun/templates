package com.shop.admin.controller;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;

import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ddmap.framework.common.PageList;

import com.shop.web.entity.Cart;
import com.shop.web.entity.ComponentsList;
import com.shop.web.entity.Components;
import com.shop.web.util.MyHelp;
import com.shop.web.util.Page;

@Controller
public class AdminUserController {

	@RequestMapping(value = "/admin/main", method = RequestMethod.GET)
	public String index(HttpServletRequest request)
			throws UnsupportedEncodingException {

			
	

		return "admin/index";
	}
	@ResponseBody
	@RequestMapping(value = "/admin/post", method = RequestMethod.POST)
	public void buildTemplate(HttpServletRequest request,HttpServletResponse response, Model model,
			String className, ComponentsList componentsList,Cart cart)
			throws UnsupportedEncodingException {

	    if(componentsList.getComponents()!=null){
	    	
			String path = request.getSession().getServletContext().getRealPath("/");
			Properties p = new Properties();
			p.setProperty(Velocity.FILE_RESOURCE_LOADER_PATH, "");
			p.setProperty(Velocity.ENCODING_DEFAULT, "UTF-8");
			p.setProperty(Velocity.INPUT_ENCODING, "UTF-8");
			p.setProperty(Velocity.OUTPUT_ENCODING, "UTF-8");
			try {
				Velocity.init(p);
				Template templateh = Velocity
						.getTemplate(path + "velocity/buy.vm");
				Template templatem = Velocity.getTemplate(path
						+ "velocity/default.vm");
				VelocityContext context = new VelocityContext();
				VelocityContext contextm = new VelocityContext();
			    context.put("className", className);  

			    
			
			    
			    context.put("list", componentsList.getComponents());
				if(className!=null){
					
				    List components= componentsList.getComponents();
				    for(int i=0;i<components.size();i++){//UITable 同时生产UITableCell文件
				    	Components com= (Components) components.get(i);
				    	if(com.getLabelType().equals("3")){
				    		Template templatecellh = Velocity
									.getTemplate(path + "velocity/cellh.vm");
				    		Template templatecellm = Velocity.getTemplate(path
									+ "velocity/cellm.vm");
				    		FileOutputStream foscell = new FileOutputStream("/Users/mac/Desktop/output/" + className + "ViewCell.h");
							BufferedWriter writercellh = new BufferedWriter(new OutputStreamWriter(
									foscell, "UTF-8"));// 设置写入的文件编码,解决中文问题
							
					 		FileOutputStream foscellm = new FileOutputStream("/Users/mac/Desktop/output/" + className + "ViewCell.m");
							BufferedWriter writercellm = new BufferedWriter(new OutputStreamWriter(
									foscellm, "UTF-8"));// 设置写入的文件编码,解决中文问题
						   context.put("labelName", com.getLabelName());
							
							templatecellh.merge(context, writercellh);
							templatecellm.merge(context, writercellm);
							writercellh.close();
							writercellm.close();
				    	}
				    	
				    }
					
					FileOutputStream fos = new FileOutputStream("/Users/mac/Desktop/output/" + className + "ViewController.h");
					BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(
							fos, "UTF-8"));// 设置写入的文件编码,解决中文问题
					
					
					FileOutputStream fosm = new FileOutputStream("/Users/mac/Desktop/output/"+ className + "ViewController.m");
					BufferedWriter writerm = new BufferedWriter(new OutputStreamWriter(
							fosm, "UTF-8"));// 设置写入的文件编码,解决中文问题
					templateh.merge(context, writer);
					templatem.merge(context, writerm);
					writer.close();
					writerm.close();
				}
				//声明一个Hash对象并添加数据
				Map params =  new HashMap();

				params.put("flag", true);
				params.put("msg", "success");
				//声明JSONArray对象并输入JSON字符串
				//JSONArray array = JSONArray.fromObject(params);
				PrintWriter out = null;
				try {
				    out = response.getWriter();
				    out.write("{\"msg\":\"success\"}");
				} catch (IOException e) {
				    e.printStackTrace();
				    out.write("{\"msg\":\"failed\"}");
				} finally {
				    if (out != null) {
				        out.close();
				    }
				}
			    System.out.println("{\"msg\":\"success\"}");
		
			} catch (Exception e) {
				e.printStackTrace();
			}

	    	
	    }
	     
	}
	
}
