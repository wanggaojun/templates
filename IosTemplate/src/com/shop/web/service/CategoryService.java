package com.shop.web.service;

import java.util.List;

import com.shop.web.entity.Category;
import com.shop.web.entity.CategoryExample;

public interface CategoryService {
	public List<Category> getCategoryByParentId(CategoryExample categoryExample,String orderByClause);
	
	public void insert(Category record);

	public List<Category> getCateList(CategoryExample record);
	
	public void deletCateList(List<Integer> idList);
	
	public int updateCate(Category record);
	public int deleteCateAllByPid(int pid);

	public int deleteCate(Category record);
}
