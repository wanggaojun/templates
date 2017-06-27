package com.shop.web.entity;

import java.io.Serializable;
import java.util.List;

public class ComponentsList implements Serializable  {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8664866808226979184L;
	private List<Components> components;

	public List<Components> getComponents() {
		return components;
	}

	public void setComponents(List<Components> components) {
		this.components = components;
	}




}
