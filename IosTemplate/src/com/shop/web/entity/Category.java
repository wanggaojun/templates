package com.shop.web.entity;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.shop.web.dao.CategoryDAO;

public class Category {
	private List<Category> subCategory;
	public void setSubCategory(List<Category> subCategory) {
		this.subCategory = subCategory;
	}
	public List<Category> getSubCategory() {
		return subCategory;
	}
//	@Autowired
//	private CategoryDAO categoryDAO;
//	private List<Category> subCategory;
//	public Category(){};
//	public Category(int id){
//		this.getSqlMapClientTemplate().queryForListthis.init(id);
//	}
//	@SuppressWarnings("unchecked")
//	private List<Category> init(int id){
//		CategoryExample example=new CategoryExample();
//		example.setParentId(id);
//		return categoryDAO.selectByExample(example, "id");
//	}
//	public void setSubCategory(List<Category> subCategory) {
//		this.subCategory = subCategory;
//	}
//	public List<Category> getSubCategory() {
//		return subCategory;
//	}

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column category.Id
     *
     * @abatorgenerated Sat Dec 17 22:21:47 CST 2011
     */
    private Integer id;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column category.name
     *
     * @abatorgenerated Sat Dec 17 22:21:47 CST 2011
     */
    private String name;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column category.description
     *
     * @abatorgenerated Sat Dec 17 22:21:47 CST 2011
     */
    private String description;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column category.parent_id
     *
     * @abatorgenerated Sat Dec 17 22:21:47 CST 2011
     */
    private Integer parentId;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column category.create_time
     *
     * @abatorgenerated Sat Dec 17 22:21:47 CST 2011
     */
    private Long createTime;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column category.modify_time
     *
     * @abatorgenerated Sat Dec 17 22:21:47 CST 2011
     */
    private Long modifyTime;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column category.sysflag
     *
     * @abatorgenerated Sat Dec 17 22:21:47 CST 2011
     */
    private Byte sysflag;

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column category.Id
     *
     * @return the value of category.Id
     *
     * @abatorgenerated Sat Dec 17 22:21:47 CST 2011
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column category.Id
     *
     * @param id the value for category.Id
     *
     * @abatorgenerated Sat Dec 17 22:21:47 CST 2011
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column category.name
     *
     * @return the value of category.name
     *
     * @abatorgenerated Sat Dec 17 22:21:47 CST 2011
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column category.name
     *
     * @param name the value for category.name
     *
     * @abatorgenerated Sat Dec 17 22:21:47 CST 2011
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column category.description
     *
     * @return the value of category.description
     *
     * @abatorgenerated Sat Dec 17 22:21:47 CST 2011
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column category.description
     *
     * @param description the value for category.description
     *
     * @abatorgenerated Sat Dec 17 22:21:47 CST 2011
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column category.parent_id
     *
     * @return the value of category.parent_id
     *
     * @abatorgenerated Sat Dec 17 22:21:47 CST 2011
     */
    public Integer getParentId() {
        return parentId;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column category.parent_id
     *
     * @param parentId the value for category.parent_id
     *
     * @abatorgenerated Sat Dec 17 22:21:47 CST 2011
     */
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column category.create_time
     *
     * @return the value of category.create_time
     *
     * @abatorgenerated Sat Dec 17 22:21:47 CST 2011
     */
    public Long getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column category.create_time
     *
     * @param createTime the value for category.create_time
     *
     * @abatorgenerated Sat Dec 17 22:21:47 CST 2011
     */
    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column category.modify_time
     *
     * @return the value of category.modify_time
     *
     * @abatorgenerated Sat Dec 17 22:21:47 CST 2011
     */
    public Long getModifyTime() {
        return modifyTime;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column category.modify_time
     *
     * @param modifyTime the value for category.modify_time
     *
     * @abatorgenerated Sat Dec 17 22:21:47 CST 2011
     */
    public void setModifyTime(Long modifyTime) {
        this.modifyTime = modifyTime;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column category.sysflag
     *
     * @return the value of category.sysflag
     *
     * @abatorgenerated Sat Dec 17 22:21:47 CST 2011
     */
    public Byte getSysflag() {
        return sysflag;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column category.sysflag
     *
     * @param sysflag the value for category.sysflag
     *
     * @abatorgenerated Sat Dec 17 22:21:47 CST 2011
     */
    public void setSysflag(Byte sysflag) {
        this.sysflag = sysflag;
    }
}