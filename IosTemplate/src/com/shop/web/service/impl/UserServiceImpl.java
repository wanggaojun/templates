package com.shop.web.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.shop.web.dao.UserDAO;
import com.shop.web.entity.User;
import com.shop.web.entity.UserExample;
import com.shop.web.service.UserService;


public class UserServiceImpl implements UserService {

	private UserDAO userDAO;

	public User login(String userName,String password){
		UserExample userExample=new UserExample();
		userExample.setUserName(userName);
		userExample.setPassword(password);
		userExample.setPassword_Indicator(UserExample.EXAMPLE_EQUALS);
		userExample.setUserName_Indicator(UserExample.EXAMPLE_EQUALS);
		
		User user=userDAO.selectByPrimaryKey(1);
		
		return user;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<User> getUserList(UserExample userExample) {
		// TODO Auto-generated method stub
		
		List<User> userList=userDAO.selectByExample(userExample);
		return userList;
	}
	
	


}
