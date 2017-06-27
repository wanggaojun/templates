package com.shop.web.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class OrderFactory {
	/*
    * 生成订单号,订单号的组成 两位年+两位月+两位日+两位小时+当天的订单总数 如:11071012100  
    * @param createDate  
    * @return  
    */  
   @SuppressWarnings("unused")
private String buildOrderid(Date createDate) {  
       SimpleDateFormat dateFormat = new SimpleDateFormat("yyMMddHH");  
       StringBuilder out  = new StringBuilder(dateFormat.format(createDate));  
       dateFormat = new SimpleDateFormat("yyyy-MM-dd");  
       String strdate = dateFormat.format(createDate);// 2011-07-10  
       Date date = createDate;  
       try {  
           date = dateFormat.parse(strdate);  
       } catch (ParseException e) {e.printStackTrace();}  
       int count=1;
       //long count = (Long)em.createQuery("select count(o) from Order o where o.createDate>=?1")  
       //.setParameter(1, date, TemporalType.TIMESTAMP).getSingleResult();  
       out.append(count+1);  
       return out.toString();  
   }  
}
