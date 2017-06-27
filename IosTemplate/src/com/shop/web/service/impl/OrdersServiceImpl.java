package com.shop.web.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


import com.shop.web.dao.GoodsDAO;
import com.shop.web.dao.OrderGoodsDAO;
import com.shop.web.dao.OrdersDAO;
import com.shop.web.entity.Goods;
import com.shop.web.entity.OrderGoods;
import com.shop.web.entity.Orders;
import com.shop.web.entity.OrdersExample;

import com.shop.web.service.OrdersService;
import com.shop.web.util.SequenceFactoryBean;

public class OrdersServiceImpl implements OrdersService {

	private OrdersDAO ordersDAO;

	private GoodsDAO goodsDAO;

	private OrderGoodsDAO orderGoodsDAO;

	@Override
	public int insertOrder(Orders order) {
		// TODO Auto-generated method stub
		int ret=0;
		if(order!=null){
			try{
			ordersDAO.insert(order);
			
			ret=1;
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		
		return ret;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Orders> getOrderList(OrdersExample ordersExample) {
		// TODO Auto-generated method stub
		return ordersDAO.selectByExample(ordersExample);
	}

	@Override
	public int deleteOrders(Orders orders) {
		int ret=ordersDAO.deleteByPrimaryKey(orders.getId());
		
		return ret;
	}

	@Override
	public int updateOrders(Orders orders) {
		int row=0;
		try{
			row=ordersDAO.updateByPrimaryKeySelective(orders);
		}catch(Exception e){
			e.printStackTrace();
		}
		return row;
	}

}
