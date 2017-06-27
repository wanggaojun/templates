package com.shop.web.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


import com.shop.web.dao.GoodsDAO;
import com.shop.web.entity.Goods;
import com.shop.web.entity.GoodsDetail;
import com.shop.web.entity.GoodsExample;
import com.shop.web.entity.GoodsImage;
import com.shop.web.service.GoodsDetailService;
import com.shop.web.service.GoodsImageService;
import com.shop.web.service.GoodsService;
import com.shop.web.util.Page;



public class GoodsServiceImpl implements GoodsService{

	private GoodsDAO goodsDAO;
	@SuppressWarnings("unchecked")
	
	

	private GoodsDetailService goodsDetailService;
	
	private GoodsImageService goodsImageService;
	//private Logger logger=Logger.getLogger(this.getClass());
	
	
	
	
	
	
	
	public Page findListByExample(GoodsExample inparam, int page, int num) throws Exception{
		Page result=new Page();
		
		try {
			/**
			 * 获取总记录条数
			 */
			int rowcount = goodsDAO.findCountByExample(inparam); 
			/**
			 * 当没有符合查询条件的结果集时
			 */
			if (rowcount <= 0) {
				result.setCurPageNum(1);
				result.setPageCount(1);
				result.setResult(new ArrayList());
				result.setRowCount(0); 
				result.setRowCountPerPage(num);
				return result;
			}
			/**
			 * 总页数
			 */
			long pagecount = 0;
			if (rowcount % num == 0) {
				pagecount = rowcount / num;
			} else {
				pagecount = rowcount / num + 1;
			}
			/**
			 * 根据总页数调整当前页码位置
			 */
			if (page <= 1) {
				page = 1;
			} else if (page > pagecount) {
				page = (int) pagecount;
			}
			
			Integer start=(page-1)*num+1;
			Integer end=page*num;
			
			/**
			 * 获取结果集
			 */
			HashMap<String,Object> param=new HashMap<String, Object>();
			param.put("object", inparam);
			param.put("page", "page");
			param.put("page_begin", start);
			param.put("page_end", end);
			List<?> list = goodsDAO.findListByExample(param);

			result.setCurPageNum(page);
			result.setPageCount(pagecount);
			result.setResult((ArrayList<?>) list);
			result.setRowCount(rowcount);
			result.setRowCountPerPage(num);
		
	}catch (Exception e) {
		//logger.error(e);
		throw e;
	}

	return result;
}
	
	
	
	@SuppressWarnings("unchecked")
	@Transactional(rollbackFor=Exception.class,propagation=Propagation.REQUIRED)
	public List<Goods> getAllGoods(GoodsExample goodsExample){
		List<Goods> goodsList=null;
		
		goodsList=goodsDAO.selectByExample(goodsExample);
		return goodsList;	
	}
	@Override
	@Transactional(rollbackFor=Exception.class,propagation=Propagation.REQUIRED)
	public int insertGoods(Goods goods) {
		// TODO Auto-generated method stub
		int ret;
		try{
			ret=goodsDAO.insert(goods);
			if(ret!=0){
				for(GoodsDetail goodsDetail:goods.getGoodsDetail()){
					goodsDetail.setGoodsId(ret);
					int retDet=goodsDetailService.insertGoodsDetail(goodsDetail);
					if(retDet!=0){
						for(GoodsImage goodsImage:goodsDetail.getGoodsImage()){
							goodsImage.setGoodsDetailId((long)retDet);
							goodsImage.setIsmain((byte)0);
							goodsImage.setIsvalid((byte)0);
							goodsImage.setSysflag((byte)0);
							goodsImageService.insertGoodsImage(goodsImage);
						}
					}
				}
			}
		}catch(Exception e){
			e.printStackTrace();
			return 0;
		}
		return ret;
	}
	@Override
	public int updateGoods(Goods goods) {
		// TODO Auto-generated method stub
		int row=0;
		try{
			row=goodsDAO.updateByPrimaryKeySelective(goods);
		}catch(Exception e){
			e.printStackTrace();
		}
		return row;
	}
	@Override
	public int deleteGoods(Goods goods) {
		// TODO Auto-generated method stub
		int ret=goodsDAO.deleteByPrimaryKey(goods.getId());
		return ret;
	}
	@Override
	public Goods getGoodsById(int id) {
		return goodsDAO.selectByPrimaryKey(id);
		// TODO Auto-generated method stub
		
	}
	
}
