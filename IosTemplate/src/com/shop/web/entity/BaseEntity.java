package com.shop.web.entity;

public class BaseEntity {
    private Integer mysqlOffset;  
    
    private Integer mysqlLength;

	public void setMysqlOffset(Integer mysqlOffset) {
		this.mysqlOffset = mysqlOffset;
	}

	public Integer getMysqlOffset() {
		return mysqlOffset;
	}

	public void setMysqlLength(Integer mysqlLength) {
		this.mysqlLength = mysqlLength;
	}

	public Integer getMysqlLength() {
		return mysqlLength;
	} 

}
