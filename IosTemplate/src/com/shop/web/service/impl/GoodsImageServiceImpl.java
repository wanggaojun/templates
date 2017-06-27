package com.shop.web.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shop.web.dao.GoodsImageDAO;
import com.shop.web.entity.GoodsImage;
import com.shop.web.service.GoodsImageService;


public class GoodsImageServiceImpl implements GoodsImageService {

	private GoodsImageDAO goodsImageDAO;
	@Override
	public int insertGoodsImage(GoodsImage goodsImage) {
		// TODO Auto-generated method stub
		int ret;
		try{
			ret=goodsImageDAO.insert(goodsImage);
		}catch(Exception e){
			e.printStackTrace();
			return 0;
		}
		return ret;
	}
	@Override
	public int updateGoodsImageList(List<GoodsImage> goodsImageList) {
		// TODO Auto-generated method stub
		for(GoodsImage goodsImage:goodsImageList){
			goodsImageDAO.updateByPrimaryKeySelective(goodsImage);
		}
		return 0;
	}
	@Override
	public int deleteGoodsImageList(List<GoodsImage> goodsImageList) {
		// TODO Auto-generated method stub
		for(GoodsImage goodsImage:goodsImageList){
			goodsImageDAO.deleteByPrimaryKey(goodsImage.getId());
		}
		return 0;
	}

}
