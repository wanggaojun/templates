package com.shop.web.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ddmap.framework.web.controller.BaseController;
import com.shop.web.entity.User;



/**
 * Created by IntelliJ IDEA.
 * User: wanggaojun
 * Date: 2011-12-7
 * Time: 13:43:19
 * To change this template use File | Settings | File Templates.
 */

 
@Controller
public class UserController extends BaseController {
	private  User user;


	 @RequestMapping(value="/json/getuser",method=RequestMethod.GET) 
	 public String getuser (User user,HttpServletRequest requset, Model model) { 
		 
		 	//User user=userService.login();
	        model.addAttribute("json", user);   
	        return "user";  
	    }

	public void setUser(User user) {
		this.user = user;
	}

	public User getUser() {
		return user;
	}


    
}
