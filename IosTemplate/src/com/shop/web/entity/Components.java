package com.shop.web.entity;

import java.io.Serializable;

public class Components implements Serializable   {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4438446749522238038L;
	private String labelName;
	private String labelType;
	public String getLabelType() {
		return labelType;
	}
	public void setLabelType(String labelType) {
		this.labelType = labelType;
	}
	public String getLabelName() {
		return labelName;
	}
	public void setLabelName(String labelName) {
		this.labelName = labelName;
	}

}
