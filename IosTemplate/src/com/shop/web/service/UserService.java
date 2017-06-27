package com.shop.web.service;



import java.util.List;

import com.shop.web.entity.User;
import com.shop.web.entity.UserExample;

public interface UserService {
	/**
	 * 用户登录接口
	 * @return
	 */
	public User login(String userName,String password);

	/**
	 * 用户查询
	 * @param userExample
	 * @return
	 */
	public List<User> getUserList(UserExample userExample);
	
}
