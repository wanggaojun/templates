package com.shop.web.entity;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.thoughtworks.xstream.annotations.XStreamAlias;
@XmlRootElement(name = "goods")
public class Goods extends BaseEntity{

	private List<GoodsDetail> goodsDetail;
	/**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column goods.Id
     *
     * @abatorgenerated Sat Dec 17 22:21:47 CST 2011
     */
    private Integer id;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column goods.categroy_id
     *
     * @abatorgenerated Sat Dec 17 22:21:47 CST 2011
     */
   
    private Integer categroyId;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column goods.goods_name
     *
     * @abatorgenerated Sat Dec 17 22:21:47 CST 2011
     */
    private String goodsName;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column goods.goods_number
     *
     * @abatorgenerated Sat Dec 17 22:21:47 CST 2011
     */
    private String goodsNumber;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column goods.goods_desc
     *
     * @abatorgenerated Sat Dec 17 22:21:47 CST 2011
     */
    private String goodsDesc;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column goods.goods_price
     *
     * @abatorgenerated Sat Dec 17 22:21:47 CST 2011
     */
    private Integer goodsPrice;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column goods.promote_price
     *
     * @abatorgenerated Sat Dec 17 22:21:47 CST 2011
     */
    private String promotePrice;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column goods.create_time
     *
     * @abatorgenerated Sat Dec 17 22:21:47 CST 2011
     */
    private Long createTime;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column goods.sysflag
     *
     * @abatorgenerated Sat Dec 17 22:21:47 CST 2011
     */
    private Byte sysflag;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column goods.isvalid
     *
     * @abatorgenerated Sat Dec 17 22:21:47 CST 2011
     */
    private Byte isvalid;

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column goods.Id
     *
     * @return the value of goods.Id
     *
     * @abatorgenerated Sat Dec 17 22:21:47 CST 2011
     */
    @XmlElement
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column goods.Id
     *
     * @param id the value for goods.Id
     *
     * @abatorgenerated Sat Dec 17 22:21:47 CST 2011
     */
    public void setId(Integer id) {
        this.id = id;
    }
    
    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column goods.categroy_id
     *
     * @return the value of goods.categroy_id
     *
     * @abatorgenerated Sat Dec 17 22:21:47 CST 2011
     */
    @XmlElement
    public Integer getCategroyId() {
        return categroyId;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column goods.categroy_id
     *
     * @param categroyId the value for goods.categroy_id
     *
     * @abatorgenerated Sat Dec 17 22:21:47 CST 2011
     */
    public void setCategroyId(Integer categroyId) {
        this.categroyId = categroyId;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column goods.goods_name
     *
     * @return the value of goods.goods_name
     *
     * @abatorgenerated Sat Dec 17 22:21:47 CST 2011
     */
    @XmlElement
    public String getGoodsName() {
        return goodsName;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column goods.goods_name
     *
     * @param goodsName the value for goods.goods_name
     *
     * @abatorgenerated Sat Dec 17 22:21:47 CST 2011
     */
    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column goods.goods_number
     *
     * @return the value of goods.goods_number
     *
     * @abatorgenerated Sat Dec 17 22:21:47 CST 2011
     */
    public String getGoodsNumber() {
        return goodsNumber;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column goods.goods_number
     *
     * @param goodsNumber the value for goods.goods_number
     *
     * @abatorgenerated Sat Dec 17 22:21:47 CST 2011
     */
    public void setGoodsNumber(String goodsNumber) {
        this.goodsNumber = goodsNumber;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column goods.goods_desc
     *
     * @return the value of goods.goods_desc
     *
     * @abatorgenerated Sat Dec 17 22:21:47 CST 2011
     */
    public String getGoodsDesc() {
        return goodsDesc;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column goods.goods_desc
     *
     * @param goodsDesc the value for goods.goods_desc
     *
     * @abatorgenerated Sat Dec 17 22:21:47 CST 2011
     */
    public void setGoodsDesc(String goodsDesc) {
        this.goodsDesc = goodsDesc;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column goods.goods_price
     *
     * @return the value of goods.goods_price
     *
     * @abatorgenerated Sat Dec 17 22:21:47 CST 2011
     */
    public Integer getGoodsPrice() {
        return goodsPrice;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column goods.goods_price
     *
     * @param goodsPrice the value for goods.goods_price
     *
     * @abatorgenerated Sat Dec 17 22:21:47 CST 2011
     */
    public void setGoodsPrice(Integer goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column goods.promote_price
     *
     * @return the value of goods.promote_price
     *
     * @abatorgenerated Sat Dec 17 22:21:47 CST 2011
     */
    public String getPromotePrice() {
        return promotePrice;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column goods.promote_price
     *
     * @param promotePrice the value for goods.promote_price
     *
     * @abatorgenerated Sat Dec 17 22:21:47 CST 2011
     */
    public void setPromotePrice(String promotePrice) {
        this.promotePrice = promotePrice;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column goods.create_time
     *
     * @return the value of goods.create_time
     *
     * @abatorgenerated Sat Dec 17 22:21:47 CST 2011
     */
    public Long getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column goods.create_time
     *
     * @param createTime the value for goods.create_time
     *
     * @abatorgenerated Sat Dec 17 22:21:47 CST 2011
     */
    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column goods.sysflag
     *
     * @return the value of goods.sysflag
     *
     * @abatorgenerated Sat Dec 17 22:21:47 CST 2011
     */
    public Byte getSysflag() {
        return sysflag;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column goods.sysflag
     *
     * @param sysflag the value for goods.sysflag
     *
     * @abatorgenerated Sat Dec 17 22:21:47 CST 2011
     */
    public void setSysflag(Byte sysflag) {
        this.sysflag = sysflag;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column goods.isvalid
     *
     * @return the value of goods.isvalid
     *
     * @abatorgenerated Sat Dec 17 22:21:47 CST 2011
     */
    public Byte getIsvalid() {
        return isvalid;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column goods.isvalid
     *
     * @param isvalid the value for goods.isvalid
     *
     * @abatorgenerated Sat Dec 17 22:21:47 CST 2011
     */
    public void setIsvalid(Byte isvalid) {
        this.isvalid = isvalid;
    }

	public void setGoodsDetail(List<GoodsDetail> goodsDetail) {
		this.goodsDetail = goodsDetail;
	}

	public List<GoodsDetail> getGoodsDetail() {
		return goodsDetail;
	}


}