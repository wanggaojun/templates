package com.shop.web.util;


public final class StringUtil {


	public static int getLength(String str) {
		return str.replaceAll("[^\\x00-\\xff]", "**").length();
	}

}
