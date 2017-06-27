package com.shop.web.dao;

import com.shop.web.entity.User;
import com.shop.web.entity.UserExample;
import java.util.List;

public interface UserDAO {
    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table user
     *
     * @abatorgenerated Sat Dec 17 22:21:48 CST 2011
     */
    void insert(User record);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table user
     *
     * @abatorgenerated Sat Dec 17 22:21:48 CST 2011
     */
    int updateByPrimaryKey(User record);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table user
     *
     * @abatorgenerated Sat Dec 17 22:21:48 CST 2011
     */
    int updateByPrimaryKeySelective(User record);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table user
     *
     * @abatorgenerated Sat Dec 17 22:21:48 CST 2011
     */
    List selectByExample(UserExample example, String orderByClause);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table user
     *
     * @abatorgenerated Sat Dec 17 22:21:48 CST 2011
     */
    List selectByExample(UserExample example);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table user
     *
     * @abatorgenerated Sat Dec 17 22:21:48 CST 2011
     */
    User selectByPrimaryKey(Integer id);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table user
     *
     * @abatorgenerated Sat Dec 17 22:21:48 CST 2011
     */
    int deleteByExample(UserExample example);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table user
     *
     * @abatorgenerated Sat Dec 17 22:21:48 CST 2011
     */
    int deleteByPrimaryKey(Integer id);
}