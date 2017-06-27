package com.shop.web.service;

import java.util.List;

import com.shop.web.entity.Orders;
import com.shop.web.entity.OrdersExample;

public interface OrdersService {
	public int insertOrder(Orders order);
	public List<Orders> getOrderList(OrdersExample ordersExample);
	public int deleteOrders(Orders orders);
	public int updateOrders(Orders orders);


}
