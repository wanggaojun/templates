package com.shop.web.service;

import java.util.List;

import com.shop.web.entity.GoodsImage;

public interface GoodsImageService {
	public int insertGoodsImage(GoodsImage goodsImage);
	public int updateGoodsImageList(List<GoodsImage> goodsImageList);
	public int deleteGoodsImageList(List<GoodsImage> goodsImageList);
}
