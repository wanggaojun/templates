package com.shop.web.service;

import java.util.List;

import com.shop.web.entity.Goods;
import com.shop.web.entity.GoodsExample;
import com.shop.web.util.Page;

public interface GoodsService {
	public List<Goods> getAllGoods(GoodsExample goodsExample);
	public int insertGoods(Goods goods);
	public int updateGoods(Goods goods);
	public int deleteGoods(Goods goods);
	public Goods getGoodsById(int id);
	public Page findListByExample(GoodsExample inparam, int page, int num) throws Exception;

}
