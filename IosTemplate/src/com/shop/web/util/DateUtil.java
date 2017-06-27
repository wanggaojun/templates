package com.shop.web.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtil {
	private static final String DEFAULT_DATE_FORMAT = getDefaultDateFormat();
	
	/**
	 * ��ǰʱ�����N��
	 */
	public static Date Ds(int days) {
		Calendar calendar = Calendar.getInstance();
		int day = calendar.get(Calendar.DAY_OF_YEAR);
		calendar.set(Calendar.DAY_OF_YEAR, day + days);
		return calendar.getTime();
	}

	/**
	 * ��ǰʱ������N��
	 */
	public static Date MonthAdd(int days) {
		Calendar calendar = Calendar.getInstance();
		int day = calendar.get(Calendar.MONTH);
		calendar.set(Calendar.MONTH, day + days);
		return calendar.getTime();
	}
	
	/**
	 * ���ϵͳ��ǰʱ��
	 */
	public static String nowDate() {
		return getDateFormat().format(System.currentTimeMillis());
	}

	/**
	 * ���ϵͳ��ǰʱ��
	 */
	public static String nowDate(String df) {
		if (Validator.isBlank(df))
			return getDateFormat().format(System.currentTimeMillis());
		else
			return getDateFormat(df).format(System.currentTimeMillis());
	}
	
	/**
	 * ��õ�ǰָ��ʱ��
	 */
	public static String nowDate(String df,Date date) {
		if (Validator.isBlank(df))
			return getDateFormat().format(date);
		else
			return getDateFormat(df).format(date);
	}
	
	/**
	 * ��õ�ǰָ��ʱ��
	 */
	public static String nowDate(String df,long currentTimeMillis) {
		if (Validator.isBlank(df))
			return getDateFormat().format(currentTimeMillis);
		else
			return getDateFormat(df).format(currentTimeMillis);
	}
	

	/**
	 * ʱ������
	 */
	public static String costTime(long time1, long time2) {
		long sub = time1 - time2;
		// yyyy-MM-dd HH:mm:ss
		String time = "";
		// ����Сʱ
		long remainder = sub % (3600 * 1000);
		long result = sub / (3600 * 1000);
		if (result < 10) {
			time += "00" + result;
		} else if (result < 100) {
			time += "0" + result;
		} else {
			time += "" + result;
		}
		// ���ٷ���
		sub = remainder;
		remainder = sub % (60 * 1000);
		result = sub / (60 * 1000);
		if (result < 10) {
			time += ":0" + result;
		} else {
			time += ":" + result;
		}
		// ������
		sub = remainder;
		result = sub / (1000);
		if (result < 10) {
			time += ":0" + result;
		} else {
			time += ":" + result;
		}

		return time;
	}

	/**
	 * ʱ������
	 * @param startTime ��ʼʱ��
	 * @param minute ����ʱ��
	 * @return ʣ�������
	 */
	public static long costTime(String startTime, String minute) throws ParseException {
		Date date = getDateFormat(Constant.YYYY_MM_DD_HH_MM_SS).parse(startTime);
		long originalTimeMillis = date.getTime();
		long currentTimeMillis = System.currentTimeMillis();
		long minuteTimeMillis = Long.parseLong(minute) * 60 * 1000;

		return minuteTimeMillis - (currentTimeMillis - originalTimeMillis);
	}
	
	/**
	 * ʱ������
	 * @param startTime ��ʼʱ��
	 * @param endTime ����ʱ��
	 * @param minute ����ʱ��
	 * @return ʣ�������
	 */
	public static long costTime(String startTime, String endTime, String minute) throws Exception {
		long originalTimeMillis = convertTimeMillis(startTime);
		long currentTimeMillis = convertTimeMillis(endTime);
		long minuteTimeMillis = Long.parseLong(minute) * 60 * 1000;
		return minuteTimeMillis - (currentTimeMillis - originalTimeMillis);
	}
	
	/**
	 * ��ָ��ʱ��ת��Ϊ������
	 * @param time ָ��ʱ��
	 */
	public static long convertTimeMillis(String time) throws Exception {
		try {
			return getDateFormat(Constant.YYYY_MM_DD_HH_MM_SS).parse(time).getTime();
		} catch (Exception e) {
			return getDateFormat(getDefaultDateFormat()).parse(time).getTime();
		}
	}
	
	/**
	 * Ĭ�����ڸ�ʽ
	 */
	protected static String getDefaultDateFormat() {
		return Constant.YYYY_MM_DD_HH_MM;
	}
	
	/**
	 * ���Ĭ�����ڸ�ʽ
	 */
	protected static DateFormat getDateFormat() {
    	return new SimpleDateFormat(DEFAULT_DATE_FORMAT);
    }
    
	/**
	 * ���ָ�����ڸ�ʽ
	 */
	protected static DateFormat getDateFormat(String format) {
    	return new SimpleDateFormat(format);
    }
	
	/**
	 * �������ڸ�ʽ��ʽ��ʱ��
	 */
	protected static String format(String format, Date date) {
		return getDateFormat(format).format(date);
	}

}