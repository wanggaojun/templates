package com.shop.web.vo;

import com.shop.web.entity.Goods;
import com.shop.web.entity.GoodsDetail;

public class GoodsVo {
		private Goods goods;
		private GoodsDetail goodsDetail;
		public void setGoods(Goods goods) {
			this.goods = goods;
		}
		public Goods getGoods() {
			return goods;
		}
		public void setGoodsDetail(GoodsDetail goodsDetail) {
			this.goodsDetail = goodsDetail;
		}
		public GoodsDetail getGoodsDetail() {
			return goodsDetail;
		}

}
