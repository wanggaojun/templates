package com.shop.web.entity;

import java.math.BigDecimal;

public class Cart {
	private int num;
    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column cart.Id
     *
     * @abatorgenerated Sat Dec 17 22:21:46 CST 2011
     */
    private Integer id;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column cart.user_id
     *
     * @abatorgenerated Sat Dec 17 22:21:46 CST 2011
     */
    private Integer userId;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column cart.session_id
     *
     * @abatorgenerated Sat Dec 17 22:21:46 CST 2011
     */
    private String sessionId;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column cart.goods_id
     *
     * @abatorgenerated Sat Dec 17 22:21:46 CST 2011
     */
    private Integer goodsId;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column cart.goods_name
     *
     * @abatorgenerated Sat Dec 17 22:21:46 CST 2011
     */
    private String goodsName;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column cart.goods_price
     *
     * @abatorgenerated Sat Dec 17 22:21:46 CST 2011
     */
    private BigDecimal goodsPrice;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column cart.parent_id
     *
     * @abatorgenerated Sat Dec 17 22:21:46 CST 2011
     */
    private Integer parentId;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column cart.is_valid
     *
     * @abatorgenerated Sat Dec 17 22:21:46 CST 2011
     */
    private Byte isValid;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column cart.sysflag
     *
     * @abatorgenerated Sat Dec 17 22:21:46 CST 2011
     */
    private Byte sysflag;

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column cart.Id
     *
     * @return the value of cart.Id
     *
     * @abatorgenerated Sat Dec 17 22:21:46 CST 2011
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column cart.Id
     *
     * @param id the value for cart.Id
     *
     * @abatorgenerated Sat Dec 17 22:21:46 CST 2011
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column cart.user_id
     *
     * @return the value of cart.user_id
     *
     * @abatorgenerated Sat Dec 17 22:21:46 CST 2011
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column cart.user_id
     *
     * @param userId the value for cart.user_id
     *
     * @abatorgenerated Sat Dec 17 22:21:46 CST 2011
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column cart.session_id
     *
     * @return the value of cart.session_id
     *
     * @abatorgenerated Sat Dec 17 22:21:46 CST 2011
     */
    public String getSessionId() {
        return sessionId;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column cart.session_id
     *
     * @param sessionId the value for cart.session_id
     *
     * @abatorgenerated Sat Dec 17 22:21:46 CST 2011
     */
    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column cart.goods_id
     *
     * @return the value of cart.goods_id
     *
     * @abatorgenerated Sat Dec 17 22:21:46 CST 2011
     */
    public Integer getGoodsId() {
        return goodsId;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column cart.goods_id
     *
     * @param goodsId the value for cart.goods_id
     *
     * @abatorgenerated Sat Dec 17 22:21:46 CST 2011
     */
    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column cart.goods_name
     *
     * @return the value of cart.goods_name
     *
     * @abatorgenerated Sat Dec 17 22:21:46 CST 2011
     */
    public String getGoodsName() {
        return goodsName;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column cart.goods_name
     *
     * @param goodsName the value for cart.goods_name
     *
     * @abatorgenerated Sat Dec 17 22:21:46 CST 2011
     */
    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column cart.goods_price
     *
     * @return the value of cart.goods_price
     *
     * @abatorgenerated Sat Dec 17 22:21:46 CST 2011
     */
    public BigDecimal getGoodsPrice() {
        return goodsPrice;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column cart.goods_price
     *
     * @param goodsPrice the value for cart.goods_price
     *
     * @abatorgenerated Sat Dec 17 22:21:46 CST 2011
     */
    public void setGoodsPrice(BigDecimal goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column cart.parent_id
     *
     * @return the value of cart.parent_id
     *
     * @abatorgenerated Sat Dec 17 22:21:46 CST 2011
     */
    public Integer getParentId() {
        return parentId;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column cart.parent_id
     *
     * @param parentId the value for cart.parent_id
     *
     * @abatorgenerated Sat Dec 17 22:21:46 CST 2011
     */
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column cart.is_valid
     *
     * @return the value of cart.is_valid
     *
     * @abatorgenerated Sat Dec 17 22:21:46 CST 2011
     */
    public Byte getIsValid() {
        return isValid;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column cart.is_valid
     *
     * @param isValid the value for cart.is_valid
     *
     * @abatorgenerated Sat Dec 17 22:21:46 CST 2011
     */
    public void setIsValid(Byte isValid) {
        this.isValid = isValid;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column cart.sysflag
     *
     * @return the value of cart.sysflag
     *
     * @abatorgenerated Sat Dec 17 22:21:46 CST 2011
     */
    public Byte getSysflag() {
        return sysflag;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column cart.sysflag
     *
     * @param sysflag the value for cart.sysflag
     *
     * @abatorgenerated Sat Dec 17 22:21:46 CST 2011
     */
    public void setSysflag(Byte sysflag) {
        this.sysflag = sysflag;
    }

	public void setNum(int num) {
		this.num = num;
	}

	public int getNum() {
		return num;
	}
}