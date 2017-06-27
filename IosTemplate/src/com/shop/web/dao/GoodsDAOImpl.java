package com.shop.web.dao;

import com.shop.web.entity.Goods;
import com.shop.web.entity.GoodsExample;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

public class GoodsDAOImpl extends SqlMapClientDaoSupport implements GoodsDAO {

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table goods
     *
     * @abatorgenerated Sat Dec 17 22:21:47 CST 2011
     */
    public GoodsDAOImpl() {
        super();
    }

    
    @SuppressWarnings("unchecked")
	public List<Goods> getGoodsList(int catid){
    	  Map parms =new HashMap();
    	  parms.put("id", catid);
    	  List<Goods> list = (List<Goods>)getSqlMapClientTemplate().queryForList("goods.my_selectGoodsUnion", parms);
          return list;
    }
    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table goods
     *
     * @abatorgenerated Sat Dec 17 22:21:47 CST 2011
     */
    public int insert(Goods record) {
        
		return ((Integer) getSqlMapClientTemplate().insert("goods.abatorgenerated_insert", record)).intValue(); 
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table goods
     *
     * @abatorgenerated Sat Dec 17 22:21:47 CST 2011
     */
    public int updateByPrimaryKey(Goods record) {
        int rows = getSqlMapClientTemplate().update("goods.abatorgenerated_updateByPrimaryKey", record);
        return rows;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table goods
     *
     * @abatorgenerated Sat Dec 17 22:21:47 CST 2011
     */
    public int updateByPrimaryKeySelective(Goods record) {
        int rows = getSqlMapClientTemplate().update("goods.abatorgenerated_updateByPrimaryKeySelective", record);
        return rows;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table goods
     *
     * @abatorgenerated Sat Dec 17 22:21:47 CST 2011
     */
    public List selectByExample(GoodsExample example, String orderByClause) {
        Map parms = getExampleParms(example);
        if (orderByClause != null) {
            parms.put("ABATOR_ORDER_BY_CLAUSE", orderByClause);
        }
        List list = getSqlMapClientTemplate().queryForList("goods.abatorgenerated_selectByExample", parms);
        return list;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table goods
     *
     * @abatorgenerated Sat Dec 17 22:21:47 CST 2011
     */
    public List selectByExample(GoodsExample example) {
        return selectByExample(example, null);
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table goods
     *
     * @abatorgenerated Sat Dec 17 22:21:47 CST 2011
     */
    public Goods selectByPrimaryKey(Integer id) {
        Goods key = new Goods();
        key.setId(id);
        Goods record = (Goods) getSqlMapClientTemplate().queryForObject("goods.abatorgenerated_selectByPrimaryKey", key);
        return record;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table goods
     *
     * @abatorgenerated Sat Dec 17 22:21:47 CST 2011
     */
    public int deleteByExample(GoodsExample example) {
        int rows = getSqlMapClientTemplate().delete("goods.abatorgenerated_deleteByExample", getExampleParms(example));
        return rows;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table goods
     *
     * @abatorgenerated Sat Dec 17 22:21:47 CST 2011
     */
    public int deleteByPrimaryKey(Integer id) {
        Goods key = new Goods();
        key.setId(id);
        int rows = getSqlMapClientTemplate().delete("goods.abatorgenerated_deleteByPrimaryKey", key);
        return rows;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table goods
     *
     * @abatorgenerated Sat Dec 17 22:21:47 CST 2011
     */
    private Map getIdExampleParms(GoodsExample example) {
        Map parms = new HashMap();
        switch (example.getId_Indicator()) {
        case GoodsExample.EXAMPLE_NULL:
            if (example.isCombineTypeOr()) {
                parms.put("OR_Id_NULL", "Y");
            } else {
                parms.put("AND_Id_NULL", "Y");
            }
            break;
        case GoodsExample.EXAMPLE_NOT_NULL:
            if (example.isCombineTypeOr()) {
                parms.put("OR_Id_NOT_NULL", "Y");
            } else {
                parms.put("AND_Id_NOT_NULL", "Y");
            }
            break;
        case GoodsExample.EXAMPLE_EQUALS:
            if (example.isCombineTypeOr()) {
                parms.put("OR_Id_EQUALS", "Y");
            } else {
                parms.put("AND_Id_EQUALS", "Y");
            }
            parms.put("id", example.getId());
            break;
        case GoodsExample.EXAMPLE_NOT_EQUALS:
            if (example.isCombineTypeOr()) {
                parms.put("OR_Id_NOT_EQUALS", "Y");
            } else {
                parms.put("AND_Id_NOT_EQUALS", "Y");
            }
            parms.put("id", example.getId());
            break;
        case GoodsExample.EXAMPLE_GREATER_THAN:
            if (example.isCombineTypeOr()) {
                parms.put("OR_Id_GT", "Y");
            } else {
                parms.put("AND_Id_GT", "Y");
            }
            parms.put("id", example.getId());
            break;
        case GoodsExample.EXAMPLE_GREATER_THAN_OR_EQUAL:
            if (example.isCombineTypeOr()) {
                parms.put("OR_Id_GE", "Y");
            } else {
                parms.put("AND_Id_GE", "Y");
            }
            parms.put("id", example.getId());
            break;
        case GoodsExample.EXAMPLE_LESS_THAN:
            if (example.isCombineTypeOr()) {
                parms.put("OR_Id_LT", "Y");
            } else {
                parms.put("AND_Id_LT", "Y");
            }
            parms.put("id", example.getId());
            break;
        case GoodsExample.EXAMPLE_LESS_THAN_OR_EQUAL:
            if (example.isCombineTypeOr()) {
                parms.put("OR_Id_LE", "Y");
            } else {
                parms.put("AND_Id_LE", "Y");
            }
            parms.put("id", example.getId());
            break;
        }
        return parms;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table goods
     *
     * @abatorgenerated Sat Dec 17 22:21:47 CST 2011
     */
    private Map getcategroy_idExampleParms(GoodsExample example) {
        Map parms = new HashMap();
        switch (example.getCategroyId_Indicator()) {
        case GoodsExample.EXAMPLE_NULL:
            if (example.isCombineTypeOr()) {
                parms.put("OR_categroy_id_NULL", "Y");
            } else {
                parms.put("AND_categroy_id_NULL", "Y");
            }
            break;
        case GoodsExample.EXAMPLE_NOT_NULL:
            if (example.isCombineTypeOr()) {
                parms.put("OR_categroy_id_NOT_NULL", "Y");
            } else {
                parms.put("AND_categroy_id_NOT_NULL", "Y");
            }
            break;
        case GoodsExample.EXAMPLE_EQUALS:
            if (example.isCombineTypeOr()) {
                parms.put("OR_categroy_id_EQUALS", "Y");
            } else {
                parms.put("AND_categroy_id_EQUALS", "Y");
            }
            parms.put("categroyId", example.getCategroyId());
            break;
        case GoodsExample.EXAMPLE_NOT_EQUALS:
            if (example.isCombineTypeOr()) {
                parms.put("OR_categroy_id_NOT_EQUALS", "Y");
            } else {
                parms.put("AND_categroy_id_NOT_EQUALS", "Y");
            }
            parms.put("categroyId", example.getCategroyId());
            break;
        case GoodsExample.EXAMPLE_GREATER_THAN:
            if (example.isCombineTypeOr()) {
                parms.put("OR_categroy_id_GT", "Y");
            } else {
                parms.put("AND_categroy_id_GT", "Y");
            }
            parms.put("categroyId", example.getCategroyId());
            break;
        case GoodsExample.EXAMPLE_GREATER_THAN_OR_EQUAL:
            if (example.isCombineTypeOr()) {
                parms.put("OR_categroy_id_GE", "Y");
            } else {
                parms.put("AND_categroy_id_GE", "Y");
            }
            parms.put("categroyId", example.getCategroyId());
            break;
        case GoodsExample.EXAMPLE_LESS_THAN:
            if (example.isCombineTypeOr()) {
                parms.put("OR_categroy_id_LT", "Y");
            } else {
                parms.put("AND_categroy_id_LT", "Y");
            }
            parms.put("categroyId", example.getCategroyId());
            break;
        case GoodsExample.EXAMPLE_LESS_THAN_OR_EQUAL:
            if (example.isCombineTypeOr()) {
                parms.put("OR_categroy_id_LE", "Y");
            } else {
                parms.put("AND_categroy_id_LE", "Y");
            }
            parms.put("categroyId", example.getCategroyId());
            break;
        }
        return parms;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table goods
     *
     * @abatorgenerated Sat Dec 17 22:21:47 CST 2011
     */
    private Map getgoods_nameExampleParms(GoodsExample example) {
        Map parms = new HashMap();
        switch (example.getGoodsName_Indicator()) {
        case GoodsExample.EXAMPLE_NULL:
            if (example.isCombineTypeOr()) {
                parms.put("OR_goods_name_NULL", "Y");
            } else {
                parms.put("AND_goods_name_NULL", "Y");
            }
            break;
        case GoodsExample.EXAMPLE_NOT_NULL:
            if (example.isCombineTypeOr()) {
                parms.put("OR_goods_name_NOT_NULL", "Y");
            } else {
                parms.put("AND_goods_name_NOT_NULL", "Y");
            }
            break;
        case GoodsExample.EXAMPLE_EQUALS:
            if (example.isCombineTypeOr()) {
                parms.put("OR_goods_name_EQUALS", "Y");
            } else {
                parms.put("AND_goods_name_EQUALS", "Y");
            }
            parms.put("goodsName", example.getGoodsName());
            break;
        case GoodsExample.EXAMPLE_NOT_EQUALS:
            if (example.isCombineTypeOr()) {
                parms.put("OR_goods_name_NOT_EQUALS", "Y");
            } else {
                parms.put("AND_goods_name_NOT_EQUALS", "Y");
            }
            parms.put("goodsName", example.getGoodsName());
            break;
        case GoodsExample.EXAMPLE_GREATER_THAN:
            if (example.isCombineTypeOr()) {
                parms.put("OR_goods_name_GT", "Y");
            } else {
                parms.put("AND_goods_name_GT", "Y");
            }
            parms.put("goodsName", example.getGoodsName());
            break;
        case GoodsExample.EXAMPLE_GREATER_THAN_OR_EQUAL:
            if (example.isCombineTypeOr()) {
                parms.put("OR_goods_name_GE", "Y");
            } else {
                parms.put("AND_goods_name_GE", "Y");
            }
            parms.put("goodsName", example.getGoodsName());
            break;
        case GoodsExample.EXAMPLE_LESS_THAN:
            if (example.isCombineTypeOr()) {
                parms.put("OR_goods_name_LT", "Y");
            } else {
                parms.put("AND_goods_name_LT", "Y");
            }
            parms.put("goodsName", example.getGoodsName());
            break;
        case GoodsExample.EXAMPLE_LESS_THAN_OR_EQUAL:
            if (example.isCombineTypeOr()) {
                parms.put("OR_goods_name_LE", "Y");
            } else {
                parms.put("AND_goods_name_LE", "Y");
            }
            parms.put("goodsName", example.getGoodsName());
            break;
        case GoodsExample.EXAMPLE_LIKE:
            if (example.isCombineTypeOr()) {
                parms.put("OR_goods_name_LIKE", "Y");
            } else {
                parms.put("AND_goods_name_LIKE", "Y");
            }
            parms.put("goodsName", example.getGoodsName());
            break;
        }
        return parms;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table goods
     *
     * @abatorgenerated Sat Dec 17 22:21:47 CST 2011
     */
    private Map getgoods_numberExampleParms(GoodsExample example) {
        Map parms = new HashMap();
        switch (example.getGoodsNumber_Indicator()) {
        case GoodsExample.EXAMPLE_NULL:
            if (example.isCombineTypeOr()) {
                parms.put("OR_goods_number_NULL", "Y");
            } else {
                parms.put("AND_goods_number_NULL", "Y");
            }
            break;
        case GoodsExample.EXAMPLE_NOT_NULL:
            if (example.isCombineTypeOr()) {
                parms.put("OR_goods_number_NOT_NULL", "Y");
            } else {
                parms.put("AND_goods_number_NOT_NULL", "Y");
            }
            break;
        case GoodsExample.EXAMPLE_EQUALS:
            if (example.isCombineTypeOr()) {
                parms.put("OR_goods_number_EQUALS", "Y");
            } else {
                parms.put("AND_goods_number_EQUALS", "Y");
            }
            parms.put("goodsNumber", example.getGoodsNumber());
            break;
        case GoodsExample.EXAMPLE_NOT_EQUALS:
            if (example.isCombineTypeOr()) {
                parms.put("OR_goods_number_NOT_EQUALS", "Y");
            } else {
                parms.put("AND_goods_number_NOT_EQUALS", "Y");
            }
            parms.put("goodsNumber", example.getGoodsNumber());
            break;
        case GoodsExample.EXAMPLE_GREATER_THAN:
            if (example.isCombineTypeOr()) {
                parms.put("OR_goods_number_GT", "Y");
            } else {
                parms.put("AND_goods_number_GT", "Y");
            }
            parms.put("goodsNumber", example.getGoodsNumber());
            break;
        case GoodsExample.EXAMPLE_GREATER_THAN_OR_EQUAL:
            if (example.isCombineTypeOr()) {
                parms.put("OR_goods_number_GE", "Y");
            } else {
                parms.put("AND_goods_number_GE", "Y");
            }
            parms.put("goodsNumber", example.getGoodsNumber());
            break;
        case GoodsExample.EXAMPLE_LESS_THAN:
            if (example.isCombineTypeOr()) {
                parms.put("OR_goods_number_LT", "Y");
            } else {
                parms.put("AND_goods_number_LT", "Y");
            }
            parms.put("goodsNumber", example.getGoodsNumber());
            break;
        case GoodsExample.EXAMPLE_LESS_THAN_OR_EQUAL:
            if (example.isCombineTypeOr()) {
                parms.put("OR_goods_number_LE", "Y");
            } else {
                parms.put("AND_goods_number_LE", "Y");
            }
            parms.put("goodsNumber", example.getGoodsNumber());
            break;
        case GoodsExample.EXAMPLE_LIKE:
            if (example.isCombineTypeOr()) {
                parms.put("OR_goods_number_LIKE", "Y");
            } else {
                parms.put("AND_goods_number_LIKE", "Y");
            }
            parms.put("goodsNumber", example.getGoodsNumber());
            break;
        }
        return parms;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table goods
     *
     * @abatorgenerated Sat Dec 17 22:21:47 CST 2011
     */
    private Map getgoods_descExampleParms(GoodsExample example) {
        Map parms = new HashMap();
        switch (example.getGoodsDesc_Indicator()) {
        case GoodsExample.EXAMPLE_NULL:
            if (example.isCombineTypeOr()) {
                parms.put("OR_goods_desc_NULL", "Y");
            } else {
                parms.put("AND_goods_desc_NULL", "Y");
            }
            break;
        case GoodsExample.EXAMPLE_NOT_NULL:
            if (example.isCombineTypeOr()) {
                parms.put("OR_goods_desc_NOT_NULL", "Y");
            } else {
                parms.put("AND_goods_desc_NOT_NULL", "Y");
            }
            break;
        case GoodsExample.EXAMPLE_EQUALS:
            if (example.isCombineTypeOr()) {
                parms.put("OR_goods_desc_EQUALS", "Y");
            } else {
                parms.put("AND_goods_desc_EQUALS", "Y");
            }
            parms.put("goodsDesc", example.getGoodsDesc());
            break;
        case GoodsExample.EXAMPLE_NOT_EQUALS:
            if (example.isCombineTypeOr()) {
                parms.put("OR_goods_desc_NOT_EQUALS", "Y");
            } else {
                parms.put("AND_goods_desc_NOT_EQUALS", "Y");
            }
            parms.put("goodsDesc", example.getGoodsDesc());
            break;
        case GoodsExample.EXAMPLE_GREATER_THAN:
            if (example.isCombineTypeOr()) {
                parms.put("OR_goods_desc_GT", "Y");
            } else {
                parms.put("AND_goods_desc_GT", "Y");
            }
            parms.put("goodsDesc", example.getGoodsDesc());
            break;
        case GoodsExample.EXAMPLE_GREATER_THAN_OR_EQUAL:
            if (example.isCombineTypeOr()) {
                parms.put("OR_goods_desc_GE", "Y");
            } else {
                parms.put("AND_goods_desc_GE", "Y");
            }
            parms.put("goodsDesc", example.getGoodsDesc());
            break;
        case GoodsExample.EXAMPLE_LESS_THAN:
            if (example.isCombineTypeOr()) {
                parms.put("OR_goods_desc_LT", "Y");
            } else {
                parms.put("AND_goods_desc_LT", "Y");
            }
            parms.put("goodsDesc", example.getGoodsDesc());
            break;
        case GoodsExample.EXAMPLE_LESS_THAN_OR_EQUAL:
            if (example.isCombineTypeOr()) {
                parms.put("OR_goods_desc_LE", "Y");
            } else {
                parms.put("AND_goods_desc_LE", "Y");
            }
            parms.put("goodsDesc", example.getGoodsDesc());
            break;
        case GoodsExample.EXAMPLE_LIKE:
            if (example.isCombineTypeOr()) {
                parms.put("OR_goods_desc_LIKE", "Y");
            } else {
                parms.put("AND_goods_desc_LIKE", "Y");
            }
            parms.put("goodsDesc", example.getGoodsDesc());
            break;
        }
        return parms;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table goods
     *
     * @abatorgenerated Sat Dec 17 22:21:47 CST 2011
     */
    private Map getgoods_priceExampleParms(GoodsExample example) {
        Map parms = new HashMap();
        switch (example.getGoodsPrice_Indicator()) {
        case GoodsExample.EXAMPLE_NULL:
            if (example.isCombineTypeOr()) {
                parms.put("OR_goods_price_NULL", "Y");
            } else {
                parms.put("AND_goods_price_NULL", "Y");
            }
            break;
        case GoodsExample.EXAMPLE_NOT_NULL:
            if (example.isCombineTypeOr()) {
                parms.put("OR_goods_price_NOT_NULL", "Y");
            } else {
                parms.put("AND_goods_price_NOT_NULL", "Y");
            }
            break;
        case GoodsExample.EXAMPLE_EQUALS:
            if (example.isCombineTypeOr()) {
                parms.put("OR_goods_price_EQUALS", "Y");
            } else {
                parms.put("AND_goods_price_EQUALS", "Y");
            }
            parms.put("goodsPrice", example.getGoodsPrice());
            break;
        case GoodsExample.EXAMPLE_NOT_EQUALS:
            if (example.isCombineTypeOr()) {
                parms.put("OR_goods_price_NOT_EQUALS", "Y");
            } else {
                parms.put("AND_goods_price_NOT_EQUALS", "Y");
            }
            parms.put("goodsPrice", example.getGoodsPrice());
            break;
        case GoodsExample.EXAMPLE_GREATER_THAN:
            if (example.isCombineTypeOr()) {
                parms.put("OR_goods_price_GT", "Y");
            } else {
                parms.put("AND_goods_price_GT", "Y");
            }
            parms.put("goodsPrice", example.getGoodsPrice());
            break;
        case GoodsExample.EXAMPLE_GREATER_THAN_OR_EQUAL:
            if (example.isCombineTypeOr()) {
                parms.put("OR_goods_price_GE", "Y");
            } else {
                parms.put("AND_goods_price_GE", "Y");
            }
            parms.put("goodsPrice", example.getGoodsPrice());
            break;
        case GoodsExample.EXAMPLE_LESS_THAN:
            if (example.isCombineTypeOr()) {
                parms.put("OR_goods_price_LT", "Y");
            } else {
                parms.put("AND_goods_price_LT", "Y");
            }
            parms.put("goodsPrice", example.getGoodsPrice());
            break;
        case GoodsExample.EXAMPLE_LESS_THAN_OR_EQUAL:
            if (example.isCombineTypeOr()) {
                parms.put("OR_goods_price_LE", "Y");
            } else {
                parms.put("AND_goods_price_LE", "Y");
            }
            parms.put("goodsPrice", example.getGoodsPrice());
            break;
        }
        return parms;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table goods
     *
     * @abatorgenerated Sat Dec 17 22:21:47 CST 2011
     */
    private Map getpromote_priceExampleParms(GoodsExample example) {
        Map parms = new HashMap();
        switch (example.getPromotePrice_Indicator()) {
        case GoodsExample.EXAMPLE_NULL:
            if (example.isCombineTypeOr()) {
                parms.put("OR_promote_price_NULL", "Y");
            } else {
                parms.put("AND_promote_price_NULL", "Y");
            }
            break;
        case GoodsExample.EXAMPLE_NOT_NULL:
            if (example.isCombineTypeOr()) {
                parms.put("OR_promote_price_NOT_NULL", "Y");
            } else {
                parms.put("AND_promote_price_NOT_NULL", "Y");
            }
            break;
        case GoodsExample.EXAMPLE_EQUALS:
            if (example.isCombineTypeOr()) {
                parms.put("OR_promote_price_EQUALS", "Y");
            } else {
                parms.put("AND_promote_price_EQUALS", "Y");
            }
            parms.put("promotePrice", example.getPromotePrice());
            break;
        case GoodsExample.EXAMPLE_NOT_EQUALS:
            if (example.isCombineTypeOr()) {
                parms.put("OR_promote_price_NOT_EQUALS", "Y");
            } else {
                parms.put("AND_promote_price_NOT_EQUALS", "Y");
            }
            parms.put("promotePrice", example.getPromotePrice());
            break;
        case GoodsExample.EXAMPLE_GREATER_THAN:
            if (example.isCombineTypeOr()) {
                parms.put("OR_promote_price_GT", "Y");
            } else {
                parms.put("AND_promote_price_GT", "Y");
            }
            parms.put("promotePrice", example.getPromotePrice());
            break;
        case GoodsExample.EXAMPLE_GREATER_THAN_OR_EQUAL:
            if (example.isCombineTypeOr()) {
                parms.put("OR_promote_price_GE", "Y");
            } else {
                parms.put("AND_promote_price_GE", "Y");
            }
            parms.put("promotePrice", example.getPromotePrice());
            break;
        case GoodsExample.EXAMPLE_LESS_THAN:
            if (example.isCombineTypeOr()) {
                parms.put("OR_promote_price_LT", "Y");
            } else {
                parms.put("AND_promote_price_LT", "Y");
            }
            parms.put("promotePrice", example.getPromotePrice());
            break;
        case GoodsExample.EXAMPLE_LESS_THAN_OR_EQUAL:
            if (example.isCombineTypeOr()) {
                parms.put("OR_promote_price_LE", "Y");
            } else {
                parms.put("AND_promote_price_LE", "Y");
            }
            parms.put("promotePrice", example.getPromotePrice());
            break;
        case GoodsExample.EXAMPLE_LIKE:
            if (example.isCombineTypeOr()) {
                parms.put("OR_promote_price_LIKE", "Y");
            } else {
                parms.put("AND_promote_price_LIKE", "Y");
            }
            parms.put("promotePrice", example.getPromotePrice());
            break;
        }
        return parms;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table goods
     *
     * @abatorgenerated Sat Dec 17 22:21:47 CST 2011
     */
    private Map getcreate_timeExampleParms(GoodsExample example) {
        Map parms = new HashMap();
        switch (example.getCreateTime_Indicator()) {
        case GoodsExample.EXAMPLE_NULL:
            if (example.isCombineTypeOr()) {
                parms.put("OR_create_time_NULL", "Y");
            } else {
                parms.put("AND_create_time_NULL", "Y");
            }
            break;
        case GoodsExample.EXAMPLE_NOT_NULL:
            if (example.isCombineTypeOr()) {
                parms.put("OR_create_time_NOT_NULL", "Y");
            } else {
                parms.put("AND_create_time_NOT_NULL", "Y");
            }
            break;
        case GoodsExample.EXAMPLE_EQUALS:
            if (example.isCombineTypeOr()) {
                parms.put("OR_create_time_EQUALS", "Y");
            } else {
                parms.put("AND_create_time_EQUALS", "Y");
            }
            parms.put("createTime", example.getCreateTime());
            break;
        case GoodsExample.EXAMPLE_NOT_EQUALS:
            if (example.isCombineTypeOr()) {
                parms.put("OR_create_time_NOT_EQUALS", "Y");
            } else {
                parms.put("AND_create_time_NOT_EQUALS", "Y");
            }
            parms.put("createTime", example.getCreateTime());
            break;
        case GoodsExample.EXAMPLE_GREATER_THAN:
            if (example.isCombineTypeOr()) {
                parms.put("OR_create_time_GT", "Y");
            } else {
                parms.put("AND_create_time_GT", "Y");
            }
            parms.put("createTime", example.getCreateTime());
            break;
        case GoodsExample.EXAMPLE_GREATER_THAN_OR_EQUAL:
            if (example.isCombineTypeOr()) {
                parms.put("OR_create_time_GE", "Y");
            } else {
                parms.put("AND_create_time_GE", "Y");
            }
            parms.put("createTime", example.getCreateTime());
            break;
        case GoodsExample.EXAMPLE_LESS_THAN:
            if (example.isCombineTypeOr()) {
                parms.put("OR_create_time_LT", "Y");
            } else {
                parms.put("AND_create_time_LT", "Y");
            }
            parms.put("createTime", example.getCreateTime());
            break;
        case GoodsExample.EXAMPLE_LESS_THAN_OR_EQUAL:
            if (example.isCombineTypeOr()) {
                parms.put("OR_create_time_LE", "Y");
            } else {
                parms.put("AND_create_time_LE", "Y");
            }
            parms.put("createTime", example.getCreateTime());
            break;
        }
        return parms;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table goods
     *
     * @abatorgenerated Sat Dec 17 22:21:47 CST 2011
     */
    private Map getsysflagExampleParms(GoodsExample example) {
        Map parms = new HashMap();
        switch (example.getSysflag_Indicator()) {
        case GoodsExample.EXAMPLE_NULL:
            if (example.isCombineTypeOr()) {
                parms.put("OR_sysflag_NULL", "Y");
            } else {
                parms.put("AND_sysflag_NULL", "Y");
            }
            break;
        case GoodsExample.EXAMPLE_NOT_NULL:
            if (example.isCombineTypeOr()) {
                parms.put("OR_sysflag_NOT_NULL", "Y");
            } else {
                parms.put("AND_sysflag_NOT_NULL", "Y");
            }
            break;
        case GoodsExample.EXAMPLE_EQUALS:
            if (example.isCombineTypeOr()) {
                parms.put("OR_sysflag_EQUALS", "Y");
            } else {
                parms.put("AND_sysflag_EQUALS", "Y");
            }
            parms.put("sysflag", example.getSysflag());
            break;
        case GoodsExample.EXAMPLE_NOT_EQUALS:
            if (example.isCombineTypeOr()) {
                parms.put("OR_sysflag_NOT_EQUALS", "Y");
            } else {
                parms.put("AND_sysflag_NOT_EQUALS", "Y");
            }
            parms.put("sysflag", example.getSysflag());
            break;
        case GoodsExample.EXAMPLE_GREATER_THAN:
            if (example.isCombineTypeOr()) {
                parms.put("OR_sysflag_GT", "Y");
            } else {
                parms.put("AND_sysflag_GT", "Y");
            }
            parms.put("sysflag", example.getSysflag());
            break;
        case GoodsExample.EXAMPLE_GREATER_THAN_OR_EQUAL:
            if (example.isCombineTypeOr()) {
                parms.put("OR_sysflag_GE", "Y");
            } else {
                parms.put("AND_sysflag_GE", "Y");
            }
            parms.put("sysflag", example.getSysflag());
            break;
        case GoodsExample.EXAMPLE_LESS_THAN:
            if (example.isCombineTypeOr()) {
                parms.put("OR_sysflag_LT", "Y");
            } else {
                parms.put("AND_sysflag_LT", "Y");
            }
            parms.put("sysflag", example.getSysflag());
            break;
        case GoodsExample.EXAMPLE_LESS_THAN_OR_EQUAL:
            if (example.isCombineTypeOr()) {
                parms.put("OR_sysflag_LE", "Y");
            } else {
                parms.put("AND_sysflag_LE", "Y");
            }
            parms.put("sysflag", example.getSysflag());
            break;
        }
        return parms;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table goods
     *
     * @abatorgenerated Sat Dec 17 22:21:47 CST 2011
     */
    private Map getisvalidExampleParms(GoodsExample example) {
        Map parms = new HashMap();
        switch (example.getIsvalid_Indicator()) {
        case GoodsExample.EXAMPLE_NULL:
            if (example.isCombineTypeOr()) {
                parms.put("OR_isvalid_NULL", "Y");
            } else {
                parms.put("AND_isvalid_NULL", "Y");
            }
            break;
        case GoodsExample.EXAMPLE_NOT_NULL:
            if (example.isCombineTypeOr()) {
                parms.put("OR_isvalid_NOT_NULL", "Y");
            } else {
                parms.put("AND_isvalid_NOT_NULL", "Y");
            }
            break;
        case GoodsExample.EXAMPLE_EQUALS:
            if (example.isCombineTypeOr()) {
                parms.put("OR_isvalid_EQUALS", "Y");
            } else {
                parms.put("AND_isvalid_EQUALS", "Y");
            }
            parms.put("isvalid", example.getIsvalid());
            break;
        case GoodsExample.EXAMPLE_NOT_EQUALS:
            if (example.isCombineTypeOr()) {
                parms.put("OR_isvalid_NOT_EQUALS", "Y");
            } else {
                parms.put("AND_isvalid_NOT_EQUALS", "Y");
            }
            parms.put("isvalid", example.getIsvalid());
            break;
        case GoodsExample.EXAMPLE_GREATER_THAN:
            if (example.isCombineTypeOr()) {
                parms.put("OR_isvalid_GT", "Y");
            } else {
                parms.put("AND_isvalid_GT", "Y");
            }
            parms.put("isvalid", example.getIsvalid());
            break;
        case GoodsExample.EXAMPLE_GREATER_THAN_OR_EQUAL:
            if (example.isCombineTypeOr()) {
                parms.put("OR_isvalid_GE", "Y");
            } else {
                parms.put("AND_isvalid_GE", "Y");
            }
            parms.put("isvalid", example.getIsvalid());
            break;
        case GoodsExample.EXAMPLE_LESS_THAN:
            if (example.isCombineTypeOr()) {
                parms.put("OR_isvalid_LT", "Y");
            } else {
                parms.put("AND_isvalid_LT", "Y");
            }
            parms.put("isvalid", example.getIsvalid());
            break;
        case GoodsExample.EXAMPLE_LESS_THAN_OR_EQUAL:
            if (example.isCombineTypeOr()) {
                parms.put("OR_isvalid_LE", "Y");
            } else {
                parms.put("AND_isvalid_LE", "Y");
            }
            parms.put("isvalid", example.getIsvalid());
            break;
        }
        return parms;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table goods
     *
     * @abatorgenerated Sat Dec 17 22:21:47 CST 2011
     */
    private Map getExampleParms(GoodsExample example) {
        Map parms = new HashMap();
        parms.putAll(getIdExampleParms(example));
        parms.putAll(getcategroy_idExampleParms(example));
        parms.putAll(getgoods_nameExampleParms(example));
        parms.putAll(getgoods_numberExampleParms(example));
        parms.putAll(getgoods_descExampleParms(example));
        parms.putAll(getgoods_priceExampleParms(example));
        parms.putAll(getpromote_priceExampleParms(example));
        parms.putAll(getcreate_timeExampleParms(example));
        parms.putAll(getsysflagExampleParms(example));
        parms.putAll(getisvalidExampleParms(example));
        return parms;
    }


	@Override
	public int findCountByExample(GoodsExample inparam) {
		// TODO Auto-generated method stub
		Map parms = getExampleParms(inparam);
		Integer count = (Integer)  getSqlMapClientTemplate().queryForObject("goods.getCountByDynamic", parms);
        return count;
	}


	@Override
	public List<?> findListByExample(HashMap<String, Object> param) {
		// TODO Auto-generated method stub
		Map parms = getExampleParms((GoodsExample)param.get("object"));
		parms.put("page_begin", param.get("page_begin"));
		parms.put("page_end", param.get("page_end"));
		List<Goods> list = getSqlMapClientTemplate().queryForList("goods.getListByDynamic", parms);
        return list;
	}
}