package com.shop.web.dao;

import com.shop.web.entity.OrderGoods;
import com.shop.web.entity.OrderGoodsExample;
import java.util.List;

public interface OrderGoodsDAO {
    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table order_goods
     *
     * @abatorgenerated Thu Dec 29 12:26:31 CST 2011
     */
	int insert(OrderGoods record);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table order_goods
     *
     * @abatorgenerated Thu Dec 29 12:26:31 CST 2011
     */
    int updateByPrimaryKey(OrderGoods record);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table order_goods
     *
     * @abatorgenerated Thu Dec 29 12:26:31 CST 2011
     */
    int updateByPrimaryKeySelective(OrderGoods record);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table order_goods
     *
     * @abatorgenerated Thu Dec 29 12:26:31 CST 2011
     */
    List selectByExample(OrderGoodsExample example, String orderByClause);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table order_goods
     *
     * @abatorgenerated Thu Dec 29 12:26:31 CST 2011
     */
    List selectByExample(OrderGoodsExample example);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table order_goods
     *
     * @abatorgenerated Thu Dec 29 12:26:31 CST 2011
     */
    OrderGoods selectByPrimaryKey(Integer id);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table order_goods
     *
     * @abatorgenerated Thu Dec 29 12:26:31 CST 2011
     */
    int deleteByExample(OrderGoodsExample example);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table order_goods
     *
     * @abatorgenerated Thu Dec 29 12:26:31 CST 2011
     */
    int deleteByPrimaryKey(Integer id);
}