package com.shop.web.dao;

import com.shop.web.entity.Category;
import com.shop.web.entity.CategoryExample;
import java.util.List;

public interface CategoryDAO {
    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table category
     *
     * @abatorgenerated Sat Dec 17 22:21:47 CST 2011
     */
    void insert(Category record);
    int deletAllByPid(int id);
    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table category
     *
     * @abatorgenerated Sat Dec 17 22:21:47 CST 2011
     */
    int updateByPrimaryKey(Category record);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table category
     *
     * @abatorgenerated Sat Dec 17 22:21:47 CST 2011
     */
    int updateByPrimaryKeySelective(Category record);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table category
     *
     * @abatorgenerated Sat Dec 17 22:21:47 CST 2011
     */
    List selectByExample(CategoryExample example, String orderByClause);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table category
     *
     * @abatorgenerated Sat Dec 17 22:21:47 CST 2011
     */
    List selectByExample(CategoryExample example);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table category
     *
     * @abatorgenerated Sat Dec 17 22:21:47 CST 2011
     */
    Category selectByPrimaryKey(Integer id);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table category
     *
     * @abatorgenerated Sat Dec 17 22:21:47 CST 2011
     */
    int deleteByExample(CategoryExample example);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table category
     *
     * @abatorgenerated Sat Dec 17 22:21:47 CST 2011
     */
    int deleteByPrimaryKey(Integer id);
}