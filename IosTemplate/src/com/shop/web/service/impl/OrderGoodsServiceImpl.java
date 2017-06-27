package com.shop.web.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shop.web.dao.OrderGoodsDAO;
import com.shop.web.entity.OrderGoods;
import com.shop.web.service.OrderGoodsService;


public class OrderGoodsServiceImpl implements OrderGoodsService {

    private OrderGoodsDAO orderGoodsDAO;
	@Override
	public int insertOrderGoods(OrderGoods orderGoods) {
		// TODO Auto-generated method stub
		int ret=0;

		try{
			ret=orderGoodsDAO.insert(orderGoods);
		}catch(Exception e){
			e.printStackTrace();
		}
		return ret;
	}

}
