package com.shop.web.service;

import java.util.List;

import com.shop.web.entity.GoodsDetail;
import com.shop.web.vo.GoodsVo;


public interface GoodsDetailService {
	 int insertGoodsDetail(GoodsDetail goodsDetail);
	 int updateGoodsDetail(List<GoodsDetail> goodsDetailList) ;
	 int deleteGoodsDetail(List<GoodsDetail> goodsDetailList) ;
	 GoodsVo getGoodsVoByDetailId(int id);
}
