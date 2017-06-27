package com.shop.web.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shop.web.dao.CartDAO;
import com.shop.web.entity.Cart;
import com.shop.web.entity.CartExample;
import com.shop.web.service.CartService;

public class CartServiceImpl implements CartService{

	private CartDAO cartDAO;
	@Override
	public int addToCat(Cart cart) {
		// TODO Auto-generated method stub
		int ret=0;
		try{
		cartDAO.insert(cart);
		ret=1;
		}catch(Exception e){		
			e.printStackTrace();
		}
		return ret;
	}
	
	@SuppressWarnings("unchecked")
	public List<Cart> getCartList(CartExample cartExample){
		List<Cart> cartList=null;
		cartList=cartDAO.selectByExample(cartExample);
		return cartList;
	}
	


	@Override
	public int deleteCart(CartExample cartExample) {
		// TODO Auto-generated method stub
		
		return cartDAO.deleteByExample(cartExample);
		
	}

	@Override
	public Cart getCartById(int id) {
		// TODO Auto-generated method stub
		return cartDAO.selectByPrimaryKey(id);
	}

}
