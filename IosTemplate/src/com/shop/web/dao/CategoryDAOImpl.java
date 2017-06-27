package com.shop.web.dao;

import com.shop.web.entity.Category;
import com.shop.web.entity.CategoryExample;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

public class CategoryDAOImpl extends SqlMapClientDaoSupport implements CategoryDAO {

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table category
     *
     * @abatorgenerated Sat Dec 17 22:21:47 CST 2011
     */
    public CategoryDAOImpl() {
        super();
    }
	@Override
	public int deletAllByPid(int id) {
		// TODO Auto-generated method stub
		 Category key = new Category();
	     key.setId(id);
	     int rows = getSqlMapClientTemplate().delete("category.deleteAllnodeByPid", key);
	     return rows;

	}
    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table category
     *
     * @abatorgenerated Sat Dec 17 22:21:47 CST 2011
     */
    public void insert(Category record) {
        getSqlMapClientTemplate().insert("category.abatorgenerated_insert", record);
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table category
     *
     * @abatorgenerated Sat Dec 17 22:21:47 CST 2011
     */
    public int updateByPrimaryKey(Category record) {
        int rows = getSqlMapClientTemplate().update("category.abatorgenerated_updateByPrimaryKey", record);
        return rows;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table category
     *
     * @abatorgenerated Sat Dec 17 22:21:47 CST 2011
     */
    public int updateByPrimaryKeySelective(Category record) {
        int rows = getSqlMapClientTemplate().update("category.abatorgenerated_updateByPrimaryKeySelective", record);
        return rows;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table category
     *
     * @abatorgenerated Sat Dec 17 22:21:47 CST 2011
     */
    public List selectByExample(CategoryExample example, String orderByClause) {
        Map parms = getExampleParms(example);
        if (orderByClause != null) {
            parms.put("ABATOR_ORDER_BY_CLAUSE", orderByClause);
        }
        List list = getSqlMapClientTemplate().queryForList("category.abatorgenerated_selectByExample", parms);
        return list;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table category
     *
     * @abatorgenerated Sat Dec 17 22:21:47 CST 2011
     */
    public List selectByExample(CategoryExample example) {
        return selectByExample(example, null);
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table category
     *
     * @abatorgenerated Sat Dec 17 22:21:47 CST 2011
     */
    public Category selectByPrimaryKey(Integer id) {
        Category key = new Category();
        key.setId(id);
        Category record = (Category) getSqlMapClientTemplate().queryForObject("category.abatorgenerated_selectByPrimaryKey", key);
        return record;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table category
     *
     * @abatorgenerated Sat Dec 17 22:21:47 CST 2011
     */
    public int deleteByExample(CategoryExample example) {
        int rows = getSqlMapClientTemplate().delete("category.abatorgenerated_deleteByExample", getExampleParms(example));
        return rows;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table category
     *
     * @abatorgenerated Sat Dec 17 22:21:47 CST 2011
     */
    public int deleteByPrimaryKey(Integer id) {
        Category key = new Category();
        key.setId(id);
        int rows = getSqlMapClientTemplate().delete("category.abatorgenerated_deleteByPrimaryKey", key);
        return rows;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table category
     *
     * @abatorgenerated Sat Dec 17 22:21:47 CST 2011
     */
    private Map getIdExampleParms(CategoryExample example) {
        Map parms = new HashMap();
        switch (example.getId_Indicator()) {
        case CategoryExample.EXAMPLE_NULL:
            if (example.isCombineTypeOr()) {
                parms.put("OR_Id_NULL", "Y");
            } else {
                parms.put("AND_Id_NULL", "Y");
            }
            break;
        case CategoryExample.EXAMPLE_NOT_NULL:
            if (example.isCombineTypeOr()) {
                parms.put("OR_Id_NOT_NULL", "Y");
            } else {
                parms.put("AND_Id_NOT_NULL", "Y");
            }
            break;
        case CategoryExample.EXAMPLE_EQUALS:
            if (example.isCombineTypeOr()) {
                parms.put("OR_Id_EQUALS", "Y");
            } else {
                parms.put("AND_Id_EQUALS", "Y");
            }
            parms.put("id", example.getId());
            break;
        case CategoryExample.EXAMPLE_NOT_EQUALS:
            if (example.isCombineTypeOr()) {
                parms.put("OR_Id_NOT_EQUALS", "Y");
            } else {
                parms.put("AND_Id_NOT_EQUALS", "Y");
            }
            parms.put("id", example.getId());
            break;
        case CategoryExample.EXAMPLE_GREATER_THAN:
            if (example.isCombineTypeOr()) {
                parms.put("OR_Id_GT", "Y");
            } else {
                parms.put("AND_Id_GT", "Y");
            }
            parms.put("id", example.getId());
            break;
        case CategoryExample.EXAMPLE_GREATER_THAN_OR_EQUAL:
            if (example.isCombineTypeOr()) {
                parms.put("OR_Id_GE", "Y");
            } else {
                parms.put("AND_Id_GE", "Y");
            }
            parms.put("id", example.getId());
            break;
        case CategoryExample.EXAMPLE_LESS_THAN:
            if (example.isCombineTypeOr()) {
                parms.put("OR_Id_LT", "Y");
            } else {
                parms.put("AND_Id_LT", "Y");
            }
            parms.put("id", example.getId());
            break;
        case CategoryExample.EXAMPLE_LESS_THAN_OR_EQUAL:
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
     * This method corresponds to the database table category
     *
     * @abatorgenerated Sat Dec 17 22:21:47 CST 2011
     */
    private Map getnameExampleParms(CategoryExample example) {
        Map parms = new HashMap();
        switch (example.getName_Indicator()) {
        case CategoryExample.EXAMPLE_NULL:
            if (example.isCombineTypeOr()) {
                parms.put("OR_name_NULL", "Y");
            } else {
                parms.put("AND_name_NULL", "Y");
            }
            break;
        case CategoryExample.EXAMPLE_NOT_NULL:
            if (example.isCombineTypeOr()) {
                parms.put("OR_name_NOT_NULL", "Y");
            } else {
                parms.put("AND_name_NOT_NULL", "Y");
            }
            break;
        case CategoryExample.EXAMPLE_EQUALS:
            if (example.isCombineTypeOr()) {
                parms.put("OR_name_EQUALS", "Y");
            } else {
                parms.put("AND_name_EQUALS", "Y");
            }
            parms.put("name", example.getName());
            break;
        case CategoryExample.EXAMPLE_NOT_EQUALS:
            if (example.isCombineTypeOr()) {
                parms.put("OR_name_NOT_EQUALS", "Y");
            } else {
                parms.put("AND_name_NOT_EQUALS", "Y");
            }
            parms.put("name", example.getName());
            break;
        case CategoryExample.EXAMPLE_GREATER_THAN:
            if (example.isCombineTypeOr()) {
                parms.put("OR_name_GT", "Y");
            } else {
                parms.put("AND_name_GT", "Y");
            }
            parms.put("name", example.getName());
            break;
        case CategoryExample.EXAMPLE_GREATER_THAN_OR_EQUAL:
            if (example.isCombineTypeOr()) {
                parms.put("OR_name_GE", "Y");
            } else {
                parms.put("AND_name_GE", "Y");
            }
            parms.put("name", example.getName());
            break;
        case CategoryExample.EXAMPLE_LESS_THAN:
            if (example.isCombineTypeOr()) {
                parms.put("OR_name_LT", "Y");
            } else {
                parms.put("AND_name_LT", "Y");
            }
            parms.put("name", example.getName());
            break;
        case CategoryExample.EXAMPLE_LESS_THAN_OR_EQUAL:
            if (example.isCombineTypeOr()) {
                parms.put("OR_name_LE", "Y");
            } else {
                parms.put("AND_name_LE", "Y");
            }
            parms.put("name", example.getName());
            break;
        case CategoryExample.EXAMPLE_LIKE:
            if (example.isCombineTypeOr()) {
                parms.put("OR_name_LIKE", "Y");
            } else {
                parms.put("AND_name_LIKE", "Y");
            }
            parms.put("name", example.getName());
            break;
        }
        return parms;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table category
     *
     * @abatorgenerated Sat Dec 17 22:21:47 CST 2011
     */
    private Map getdescriptionExampleParms(CategoryExample example) {
        Map parms = new HashMap();
        switch (example.getDescription_Indicator()) {
        case CategoryExample.EXAMPLE_NULL:
            if (example.isCombineTypeOr()) {
                parms.put("OR_description_NULL", "Y");
            } else {
                parms.put("AND_description_NULL", "Y");
            }
            break;
        case CategoryExample.EXAMPLE_NOT_NULL:
            if (example.isCombineTypeOr()) {
                parms.put("OR_description_NOT_NULL", "Y");
            } else {
                parms.put("AND_description_NOT_NULL", "Y");
            }
            break;
        case CategoryExample.EXAMPLE_EQUALS:
            if (example.isCombineTypeOr()) {
                parms.put("OR_description_EQUALS", "Y");
            } else {
                parms.put("AND_description_EQUALS", "Y");
            }
            parms.put("description", example.getDescription());
            break;
        case CategoryExample.EXAMPLE_NOT_EQUALS:
            if (example.isCombineTypeOr()) {
                parms.put("OR_description_NOT_EQUALS", "Y");
            } else {
                parms.put("AND_description_NOT_EQUALS", "Y");
            }
            parms.put("description", example.getDescription());
            break;
        case CategoryExample.EXAMPLE_GREATER_THAN:
            if (example.isCombineTypeOr()) {
                parms.put("OR_description_GT", "Y");
            } else {
                parms.put("AND_description_GT", "Y");
            }
            parms.put("description", example.getDescription());
            break;
        case CategoryExample.EXAMPLE_GREATER_THAN_OR_EQUAL:
            if (example.isCombineTypeOr()) {
                parms.put("OR_description_GE", "Y");
            } else {
                parms.put("AND_description_GE", "Y");
            }
            parms.put("description", example.getDescription());
            break;
        case CategoryExample.EXAMPLE_LESS_THAN:
            if (example.isCombineTypeOr()) {
                parms.put("OR_description_LT", "Y");
            } else {
                parms.put("AND_description_LT", "Y");
            }
            parms.put("description", example.getDescription());
            break;
        case CategoryExample.EXAMPLE_LESS_THAN_OR_EQUAL:
            if (example.isCombineTypeOr()) {
                parms.put("OR_description_LE", "Y");
            } else {
                parms.put("AND_description_LE", "Y");
            }
            parms.put("description", example.getDescription());
            break;
        case CategoryExample.EXAMPLE_LIKE:
            if (example.isCombineTypeOr()) {
                parms.put("OR_description_LIKE", "Y");
            } else {
                parms.put("AND_description_LIKE", "Y");
            }
            parms.put("description", example.getDescription());
            break;
        }
        return parms;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table category
     *
     * @abatorgenerated Sat Dec 17 22:21:47 CST 2011
     */
    private Map getparent_idExampleParms(CategoryExample example) {
        Map parms = new HashMap();
        switch (example.getParentId_Indicator()) {
        case CategoryExample.EXAMPLE_NULL:
            if (example.isCombineTypeOr()) {
                parms.put("OR_parent_id_NULL", "Y");
            } else {
                parms.put("AND_parent_id_NULL", "Y");
            }
            break;
        case CategoryExample.EXAMPLE_NOT_NULL:
            if (example.isCombineTypeOr()) {
                parms.put("OR_parent_id_NOT_NULL", "Y");
            } else {
                parms.put("AND_parent_id_NOT_NULL", "Y");
            }
            break;
        case CategoryExample.EXAMPLE_EQUALS:
            if (example.isCombineTypeOr()) {
                parms.put("OR_parent_id_EQUALS", "Y");
            } else {
                parms.put("AND_parent_id_EQUALS", "Y");
            }
            parms.put("parentId", example.getParentId());
            break;
        case CategoryExample.EXAMPLE_NOT_EQUALS:
            if (example.isCombineTypeOr()) {
                parms.put("OR_parent_id_NOT_EQUALS", "Y");
            } else {
                parms.put("AND_parent_id_NOT_EQUALS", "Y");
            }
            parms.put("parentId", example.getParentId());
            break;
        case CategoryExample.EXAMPLE_GREATER_THAN:
            if (example.isCombineTypeOr()) {
                parms.put("OR_parent_id_GT", "Y");
            } else {
                parms.put("AND_parent_id_GT", "Y");
            }
            parms.put("parentId", example.getParentId());
            break;
        case CategoryExample.EXAMPLE_GREATER_THAN_OR_EQUAL:
            if (example.isCombineTypeOr()) {
                parms.put("OR_parent_id_GE", "Y");
            } else {
                parms.put("AND_parent_id_GE", "Y");
            }
            parms.put("parentId", example.getParentId());
            break;
        case CategoryExample.EXAMPLE_LESS_THAN:
            if (example.isCombineTypeOr()) {
                parms.put("OR_parent_id_LT", "Y");
            } else {
                parms.put("AND_parent_id_LT", "Y");
            }
            parms.put("parentId", example.getParentId());
            break;
        case CategoryExample.EXAMPLE_LESS_THAN_OR_EQUAL:
            if (example.isCombineTypeOr()) {
                parms.put("OR_parent_id_LE", "Y");
            } else {
                parms.put("AND_parent_id_LE", "Y");
            }
            parms.put("parentId", example.getParentId());
            break;
        }
        return parms;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table category
     *
     * @abatorgenerated Sat Dec 17 22:21:47 CST 2011
     */
    private Map getcreate_timeExampleParms(CategoryExample example) {
        Map parms = new HashMap();
        switch (example.getCreateTime_Indicator()) {
        case CategoryExample.EXAMPLE_NULL:
            if (example.isCombineTypeOr()) {
                parms.put("OR_create_time_NULL", "Y");
            } else {
                parms.put("AND_create_time_NULL", "Y");
            }
            break;
        case CategoryExample.EXAMPLE_NOT_NULL:
            if (example.isCombineTypeOr()) {
                parms.put("OR_create_time_NOT_NULL", "Y");
            } else {
                parms.put("AND_create_time_NOT_NULL", "Y");
            }
            break;
        case CategoryExample.EXAMPLE_EQUALS:
            if (example.isCombineTypeOr()) {
                parms.put("OR_create_time_EQUALS", "Y");
            } else {
                parms.put("AND_create_time_EQUALS", "Y");
            }
            parms.put("createTime", example.getCreateTime());
            break;
        case CategoryExample.EXAMPLE_NOT_EQUALS:
            if (example.isCombineTypeOr()) {
                parms.put("OR_create_time_NOT_EQUALS", "Y");
            } else {
                parms.put("AND_create_time_NOT_EQUALS", "Y");
            }
            parms.put("createTime", example.getCreateTime());
            break;
        case CategoryExample.EXAMPLE_GREATER_THAN:
            if (example.isCombineTypeOr()) {
                parms.put("OR_create_time_GT", "Y");
            } else {
                parms.put("AND_create_time_GT", "Y");
            }
            parms.put("createTime", example.getCreateTime());
            break;
        case CategoryExample.EXAMPLE_GREATER_THAN_OR_EQUAL:
            if (example.isCombineTypeOr()) {
                parms.put("OR_create_time_GE", "Y");
            } else {
                parms.put("AND_create_time_GE", "Y");
            }
            parms.put("createTime", example.getCreateTime());
            break;
        case CategoryExample.EXAMPLE_LESS_THAN:
            if (example.isCombineTypeOr()) {
                parms.put("OR_create_time_LT", "Y");
            } else {
                parms.put("AND_create_time_LT", "Y");
            }
            parms.put("createTime", example.getCreateTime());
            break;
        case CategoryExample.EXAMPLE_LESS_THAN_OR_EQUAL:
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
     * This method corresponds to the database table category
     *
     * @abatorgenerated Sat Dec 17 22:21:47 CST 2011
     */
    private Map getmodify_timeExampleParms(CategoryExample example) {
        Map parms = new HashMap();
        switch (example.getModifyTime_Indicator()) {
        case CategoryExample.EXAMPLE_NULL:
            if (example.isCombineTypeOr()) {
                parms.put("OR_modify_time_NULL", "Y");
            } else {
                parms.put("AND_modify_time_NULL", "Y");
            }
            break;
        case CategoryExample.EXAMPLE_NOT_NULL:
            if (example.isCombineTypeOr()) {
                parms.put("OR_modify_time_NOT_NULL", "Y");
            } else {
                parms.put("AND_modify_time_NOT_NULL", "Y");
            }
            break;
        case CategoryExample.EXAMPLE_EQUALS:
            if (example.isCombineTypeOr()) {
                parms.put("OR_modify_time_EQUALS", "Y");
            } else {
                parms.put("AND_modify_time_EQUALS", "Y");
            }
            parms.put("modifyTime", example.getModifyTime());
            break;
        case CategoryExample.EXAMPLE_NOT_EQUALS:
            if (example.isCombineTypeOr()) {
                parms.put("OR_modify_time_NOT_EQUALS", "Y");
            } else {
                parms.put("AND_modify_time_NOT_EQUALS", "Y");
            }
            parms.put("modifyTime", example.getModifyTime());
            break;
        case CategoryExample.EXAMPLE_GREATER_THAN:
            if (example.isCombineTypeOr()) {
                parms.put("OR_modify_time_GT", "Y");
            } else {
                parms.put("AND_modify_time_GT", "Y");
            }
            parms.put("modifyTime", example.getModifyTime());
            break;
        case CategoryExample.EXAMPLE_GREATER_THAN_OR_EQUAL:
            if (example.isCombineTypeOr()) {
                parms.put("OR_modify_time_GE", "Y");
            } else {
                parms.put("AND_modify_time_GE", "Y");
            }
            parms.put("modifyTime", example.getModifyTime());
            break;
        case CategoryExample.EXAMPLE_LESS_THAN:
            if (example.isCombineTypeOr()) {
                parms.put("OR_modify_time_LT", "Y");
            } else {
                parms.put("AND_modify_time_LT", "Y");
            }
            parms.put("modifyTime", example.getModifyTime());
            break;
        case CategoryExample.EXAMPLE_LESS_THAN_OR_EQUAL:
            if (example.isCombineTypeOr()) {
                parms.put("OR_modify_time_LE", "Y");
            } else {
                parms.put("AND_modify_time_LE", "Y");
            }
            parms.put("modifyTime", example.getModifyTime());
            break;
        }
        return parms;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table category
     *
     * @abatorgenerated Sat Dec 17 22:21:47 CST 2011
     */
    private Map getsysflagExampleParms(CategoryExample example) {
        Map parms = new HashMap();
        switch (example.getSysflag_Indicator()) {
        case CategoryExample.EXAMPLE_NULL:
            if (example.isCombineTypeOr()) {
                parms.put("OR_sysflag_NULL", "Y");
            } else {
                parms.put("AND_sysflag_NULL", "Y");
            }
            break;
        case CategoryExample.EXAMPLE_NOT_NULL:
            if (example.isCombineTypeOr()) {
                parms.put("OR_sysflag_NOT_NULL", "Y");
            } else {
                parms.put("AND_sysflag_NOT_NULL", "Y");
            }
            break;
        case CategoryExample.EXAMPLE_EQUALS:
            if (example.isCombineTypeOr()) {
                parms.put("OR_sysflag_EQUALS", "Y");
            } else {
                parms.put("AND_sysflag_EQUALS", "Y");
            }
            parms.put("sysflag", example.getSysflag());
            break;
        case CategoryExample.EXAMPLE_NOT_EQUALS:
            if (example.isCombineTypeOr()) {
                parms.put("OR_sysflag_NOT_EQUALS", "Y");
            } else {
                parms.put("AND_sysflag_NOT_EQUALS", "Y");
            }
            parms.put("sysflag", example.getSysflag());
            break;
        case CategoryExample.EXAMPLE_GREATER_THAN:
            if (example.isCombineTypeOr()) {
                parms.put("OR_sysflag_GT", "Y");
            } else {
                parms.put("AND_sysflag_GT", "Y");
            }
            parms.put("sysflag", example.getSysflag());
            break;
        case CategoryExample.EXAMPLE_GREATER_THAN_OR_EQUAL:
            if (example.isCombineTypeOr()) {
                parms.put("OR_sysflag_GE", "Y");
            } else {
                parms.put("AND_sysflag_GE", "Y");
            }
            parms.put("sysflag", example.getSysflag());
            break;
        case CategoryExample.EXAMPLE_LESS_THAN:
            if (example.isCombineTypeOr()) {
                parms.put("OR_sysflag_LT", "Y");
            } else {
                parms.put("AND_sysflag_LT", "Y");
            }
            parms.put("sysflag", example.getSysflag());
            break;
        case CategoryExample.EXAMPLE_LESS_THAN_OR_EQUAL:
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
     * This method corresponds to the database table category
     *
     * @abatorgenerated Sat Dec 17 22:21:47 CST 2011
     */
    private Map getExampleParms(CategoryExample example) {
        Map parms = new HashMap();
        parms.putAll(getIdExampleParms(example));
        parms.putAll(getnameExampleParms(example));
        parms.putAll(getdescriptionExampleParms(example));
        parms.putAll(getparent_idExampleParms(example));
        parms.putAll(getcreate_timeExampleParms(example));
        parms.putAll(getmodify_timeExampleParms(example));
        parms.putAll(getsysflagExampleParms(example));
        return parms;
    }


}