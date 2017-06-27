package com.shop.web.entity;

import java.util.List;

public class ListGroups {
	private List<Goods> goodsList;
	private List<Orders> ordersList;
	private List<Category> catList;
	
	

	


	public List<Category> getCatList() {
		return catList;
	}

	public void setCatList(List<Category> catList) {
		this.catList = catList;
	}

	public List<Orders> getOrdersList() {
		return ordersList;
	}

	public void setOrdersList(List<Orders> ordersList) {
		this.ordersList = ordersList;
	}

	public void setGoodsList(List<Goods> goodsList) {
		this.goodsList = goodsList;
	}

	public List<Goods> getGoodsList() {
		return goodsList;
	}
}
