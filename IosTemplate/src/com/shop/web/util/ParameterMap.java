package com.shop.web.util;

import java.util.HashMap;

@SuppressWarnings("unchecked")
public class ParameterMap extends HashMap {

	public ParameterMap(Object... parameters) {
		for (int i = 0; i < parameters.length - 1; i += 2) {
			super.put(parameters[i], parameters[i + 1]);
		}
	}
}
