package com.shop.web.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shop.web.dao.GoodsDetailDAO;
import com.shop.web.entity.GoodsDetail;
import com.shop.web.service.GoodsDetailService;
import com.shop.web.vo.GoodsVo;


public class GoodsDetailServiceImpl implements GoodsDetailService {

	private GoodsDetailDAO goodsDetailDAO;
	@Override
	public int insertGoodsDetail(GoodsDetail goodsDetail) {
		// TODO Auto-generated method stub
		int ret;
		try{
		ret=goodsDetailDAO.insert(goodsDetail);
		}catch(Exception e){
			e.printStackTrace();
			return 0;
		}
		
		return ret;
	}
	@Override
	public int updateGoodsDetail(List<GoodsDetail> goodsDetailList) {
		// TODO Auto-generated method stub
		for(GoodsDetail goodsDetail:goodsDetailList){
			goodsDetailDAO.updateByPrimaryKeySelective(goodsDetail);
		}
		return 0;
	}
	@Override
	public int deleteGoodsDetail(List<GoodsDetail> goodsDetailList) {
		// TODO Auto-generated method stub
		for(GoodsDetail goodsDetail:goodsDetailList){
			goodsDetailDAO.deleteByPrimaryKey(goodsDetail.getId());
		}
		return 0;
	}
	@Override
	public GoodsVo getGoodsVoByDetailId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
