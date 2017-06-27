package com.shop.web.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shop.web.dao.CategoryDAO;
import com.shop.web.entity.Category;
import com.shop.web.entity.CategoryExample;
import com.shop.web.service.CategoryService;



public class CategoryServiceImpl  implements CategoryService{
	
	private CategoryDAO categoryDAO;
	@SuppressWarnings("unchecked")
	public List<Category> getCategoryByParentId(CategoryExample categoryExample,String orderByClause){
		List<Category> categoryList=null;
	
		
		categoryList=categoryDAO.selectByExample(categoryExample, orderByClause);
		
		
		return categoryList;
		
	}
	@Override
	public void insert(Category record) {
		// TODO Auto-generated method stub	
		categoryDAO.insert(record);	
	}
	@Override
	public List<Category> getCateList(CategoryExample record) {
		
		List<Category> catList=null;
		catList=categoryDAO.selectByExample(record);
		// TODO Auto-generated method stub
		return catList;
	}
	
	/***
	 * ��ɾ�����
	 */
	@Override
	public void deletCateList(List<Integer> idList) {
		// TODO Auto-generated method stub
		for(Integer id:idList){
			categoryDAO.deleteByPrimaryKey(id);
		}
		
	}
	/***
	 * ���·���
	 */
	@Override
	public int updateCate(Category record) {
		int ret=0;
		try{
			ret=categoryDAO.updateByPrimaryKeySelective(record);
		}catch(Exception e){
			e.printStackTrace();
		}
		return ret;
	}
	@Override
	public int deleteCateAllByPid(int pid) {
		// TODO Auto-generated method stub
		int ret=0;
		try{
			ret=categoryDAO.deletAllByPid(pid);
		}catch(Exception e){
			e.printStackTrace();
		}
		return ret;
	}
	@Override
	public int deleteCate(Category record) {
	int ret=categoryDAO.deleteByPrimaryKey(record.getId());
		
		return ret;
	}

}
