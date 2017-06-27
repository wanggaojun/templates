package com.shop.web.util;


import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Collection;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang.StringUtils;



public final class Validator {

	/**
	 * ��֤�����Ƿ�Ϊ��
	 * @param ����֤���ַ���
	 * @return ����Ƿ��ϵ��ַ���,����true,����Ϊfalse
	 */
	public static boolean isEmpty(Collection<?> collection) {
		return collection == null || collection.isEmpty();
	}
	
	/**
	 * ��֤�����Ƿ�Ϊ��
	 * @param ����֤���ַ���
	 * @return ����Ƿ��ϵ��ַ���,����true,����Ϊfalse
	 */
	public static boolean isBlank(Object[] obj) {
		return obj == null ? true : (obj.length == 0 ? true : false);
	}

	/**
	 * ��֤�ַ����Ƿ�Ϊ��
	 * @param ����֤���ַ���
	 * @return ����Ƿ��ϵ��ַ���,����true,����Ϊfalse
	 */
	public static boolean isBlank(String str) {
		return StringUtils.isBlank(str);
	}

	/**
	 * ��֤�ַ��������Ƿ����ָ������-ȥ��2�˿ո�
	 * @param ����֤���ַ���
	 * @param ����
	 * @return ����Ƿ��ϵ��ַ���,����true,����Ϊfalse
	 */
	public static boolean isGtLength(String str, int length) {
		if (isBlank(str)) {
			return false;
		}
		return StringUtil.getLength(str.trim()) > length;
	}

	/**
	 * ��֤�ַ��������Ƿ�С��ָ������-ȥ��2�˿ո�
	 * @param ����֤���ַ���
	 * @param ����
	 * @return ����Ƿ��ϵ��ַ���,����true,����Ϊfalse
	 */
	public static boolean isLtLength(String str, int length) {
		if (isBlank(str)) {
			return false;
		}
		return StringUtil.getLength(str.trim()) < length;
	}

	/**
	 * ��֤�Ƿ���һ���۸�
	 * @param ����֤���ַ���
	 * @param ����
	 * @return ����Ƿ��ϵ��ַ���,����true,����Ϊfalse
	 */
	public static boolean isPrice(String str) {
		if (isBlank(str)) {
			return false;
		}
		String regex = "[0-9]+(.[0-9]+)?";
		return match(regex, str);
	}

	/**
	 * ��֤�Ƿ���һ��������ļ۸�
	 * @param ����֤���ַ���
	 * @param ����
	 * @return ����Ƿ��ϵ��ַ���,����true,����Ϊfalse
	 */
	public static boolean isDeposit(String str) {
		if (isBlank(str)) {
			return false;
		}
		String regex = "^(([1-9]+[0-9]*.{1}[0-9]+)|([0].{1}[1-9]+[0-9]*)|([1-9][0-9]*)|([0][.][0-9]+[1-9]*))$";
		return match(regex, str);
	}

	/**
	 * ��֤��������
	 * @param ����֤���ַ���
	 * @return ����Ƿ��ϸ�ʽ���ַ���,����true,����Ϊfalse
	 */
	public static boolean isNumber(String str) {
		if (isBlank(str)) {
			return false;
		}
		String regex = "^[0-9]*$";
		return match(regex, str);
	}

	/**
	 * ��֤�����������
	 * @param ����֤���ַ���
	 * @return ����Ƿ��ϸ�ʽ���ַ���,����true,����Ϊfalse
	 */
	public static boolean isIntNumber(String str) {
		if (isBlank(str)) {
			return false;
		}
		String regex = "^\\+?[1-9][0-9]*$";
		return match(regex, str);
	}

	/**
	 * ��֤�Ƿ���һ�������ֵ�QQ����
	 * @param ����֤���ַ���
	 * @return ����Ƿ��ϸ�ʽ���ַ���,����true,����Ϊfalse
	 */
	public static boolean isQq(String str) {
		if (isBlank(str)) {
			return false;
		}
		String regex = "^\\d{5,}$";
		return match(regex, str);
	}

	/**
	 * ��֤�ֻ�����
	 * @param ����֤���ַ���
	 * @return ����Ƿ��ϸ�ʽ���ַ���,����true,����Ϊfalse
	 */
	public static boolean isMobilePhone(String str) {
		if (isBlank(str)) {
			return false;
		}
		String regex = "^1[3,5]\\d{9}$";
		return match(regex, str);
	}

	/**
	 * ��֤�绰����
	 * @param ����֤���ַ���
	 * @return ����Ƿ��ϸ�ʽ���ַ���,����true,����Ϊfalse
	 */
	public static boolean isTelePhone(String str) {
		if (isBlank(str)) {
			return false;
		}
		String regex = "^(\\d{3,4}-)?\\d{6,8}$";
		return match(regex, str);
	}

	/**
	 * ��֤����
	 * @param ����֤���ַ���
	 * @return ����Ƿ��ϵ��ַ���,����true,����Ϊfalse
	 */
	public static boolean isEmail(String str) {
		if (isBlank(str)) {
			return false;
		}
		String regex = "\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*";
		return match(regex, str);
	}

	/**
	 * ��֤�������֤��
	 * @param ����֤���ַ���
	 * @return ����Ƿ��ϸ�ʽ���ַ���,����true,����Ϊfalse
	 */
	public static boolean isIDcard(String str) {
		if (isBlank(str)) {
			return false;
		}
		//Checker checker = new Checker(str);
		return false;
	}

	/**
	 * ��֤��ʵ����
	 * @param ����֤���ַ���
	 * @return ����Ƿ��ϸ�ʽ���ַ���,����true,����Ϊfalse
	 */
	public static boolean isName(String str) {
		if (isBlank(str)) {
			return false;
		}
		String regex = "[\\u4E00-\\u9FA5]{2,}";
		return match(regex, str);
	}

	/**
	 * ��֤�û���
	 * @param ����֤���ַ���
	 * @return ����Ƿ��ϸ�ʽ���ַ���,����true,����Ϊfalse
	 */
	public static boolean isUserName(String str) {
		if (isBlank(str)) {
			return false;
		}
		String regex = "^[\\w]{6,20}$";
		return match(regex, str);
	}

	/**
	 * ��֤������������(�ַ�������ͬʱ����)
	 * @param ����֤���ַ���
	 * @return ����Ƿ��ϸ�ʽ���ַ���,����true,����Ϊfalse
	 */
	public static boolean isPassword(String str) {
		if (isBlank(str)) {
			return false;
		}
		String regex = "[A-Za-z]+[0-9]";
		return match(regex, str);
	}

	/**
	 * ��֤�������볤�� (6-20λ)
	 * @param ����֤���ַ���
	 * @return ����Ƿ��ϸ�ʽ���ַ���,����true,����Ϊfalse
	 */
	public static boolean isPasswLength(String str) {
		if (isBlank(str)) {
			return false;
		}
		String regex = "^\\d{6,20}$";
		return match(regex, str);
	}

	/**
	 * ��֤IP��ַ
	 * @param ����֤���ַ���
	 * @return ����Ƿ��ϸ�ʽ���ַ���,����true,����Ϊfalse
	 */
	public static boolean isIP(String str) {
		if (isBlank(str)) {
			return false;
		}
		String num = "(25[0-5]|2[0-4]\\d|[0-1]\\d{2}|[1-9]?\\d)";
		String regex = "^" + num + "\\." + num + "\\." + num + "\\." + num
				+ "$";
		return match(regex, str);
	}

	/**
	 * ��֤��ַUrl
	 * @param ����֤���ַ���
	 * @return ����Ƿ��ϸ�ʽ���ַ���,����true,����Ϊfalse
	 */
	public static boolean isUrl(String str) {
		if (isBlank(str)) {
			return false;
		}
		String regex = "http(s)?://([\\w-]+\\.)+[\\w-]+(/[\\w- ./?%&=]*)?";
		return match(regex, str);
	}
	
	/**
	 * ��֤������ַ
	 * @param ����֤���ַ���
	 * @return ����Ƿ��ϸ�ʽ���ַ���,����true,����Ϊfalse
	 */
	public static boolean isDomainName(String str) {
		if (isBlank(str)) {
			return false;
		}
		String regex = "([\\w-]+\\.)+[\\w-]+(/[\\w- ./?%&=]*)?";
		return match(regex, str);
	}

	/**
	 * ��֤�����������
	 * @param ����֤���ַ���
	 * @return ����Ƿ��ϸ�ʽ���ַ���,����true,����Ϊfalse
	 */
	public static boolean isPostalcode(String str) {
		if (isBlank(str)) {
			return false;
		}
		String regex = "^\\d{6}$";
		return match(regex, str);
	}

	/**
	 * ��֤������λС��
	 * @param ����֤���ַ���
	 * @return ����Ƿ��ϸ�ʽ���ַ���,����true,����Ϊfalse
	 */
	public static boolean isDecimal(String str) {
		if (isBlank(str)) {
			return false;
		}
		String regex = "^[0-9]+(.[0-9]{2})?$";
		return match(regex, str);
	}

	/**
	 * ��֤����һ���12����
	 * @param ����֤���ַ���
	 * @return ����Ƿ��ϸ�ʽ���ַ���,����true,����Ϊfalse
	 */
	public static boolean isMonth(String str) {
		if (isBlank(str)) {
			return false;
		}
		String regex = "^(0?[[1-9]|1[0-2])$";
		return match(regex, str);
	}

	/**
	 * ��֤����һ���µ�31��
	 * @param ����֤���ַ���
	 * @return ����Ƿ��ϸ�ʽ���ַ���,����true,����Ϊfalse
	 */
	public static boolean isDay(String str) {
		if (isBlank(str)) {
			return false;
		}
		String regex = "^((0?[1-9])|((1|2)[0-9])|30|31)$";
		return match(regex, str);
	}

	/**
	 * ��֤����ʱ��
	 * @param ����֤���ַ���
	 * @return ����Ƿ�����ַ��ʽ���ַ���,����true,����Ϊfalse
	 */
	public static boolean isDate(String str) {
		if (isBlank(str)) {
			return false;
		}
		String regex = "^((((1[6-9]|[2-9]\\d)\\d{2})-(0?[13578]|1[02])-(0?[1-9]|[12]\\d|3[01]))|(((1[6-9]|[2-9]\\d)\\d{2})-(0?[13456789]|1[012])-(0?[1-9]|[12]\\d|30))|(((1[6-9]|[2-9]\\d)\\d{2})-0?2-(0?[1-9]|1\\d|2[0-8]))|(((1[6-9]|[2-9]\\d)(0[48]|[2468][048]|[13579][26])|((16|[2468][048]|[3579][26])00))-0?2-29-)) (20|21|22|23|[0-1]?\\d):[0-5]?\\d:[0-5]?\\d$";
		return match(regex, str);
	}

	/**
	 * ��֤��д��ĸ
	 * @param ����֤���ַ���
	 * @return ����Ƿ��ϸ�ʽ���ַ���,����true,����Ϊfalse
	 */
	public static boolean isUpChar(String str) {
		if (isBlank(str)) {
			return false;
		}
		String regex = "^[A-Z]+$";
		return match(regex, str);
	}

	/**
	 * ��֤Сд��ĸ
	 * @param ����֤���ַ���
	 * @return ����Ƿ��ϸ�ʽ���ַ���,����true,����Ϊfalse
	 */
	public static boolean isLowChar(String str) {
		if (isBlank(str)) {
			return false;
		}
		String regex = "^[a-z]+$";
		return match(regex, str);
	}

	/**
	 * ��֤������ĸ
	 * @param ����֤���ַ���
	 * @return ����Ƿ��ϸ�ʽ���ַ���,����true,����Ϊfalse
	 */
	public static boolean isLetter(String str) {
		if (isBlank(str)) {
			return false;
		}
		String regex = "^[A-Za-z]+$";
		return match(regex, str);
	}

	/**
	 * ��֤����
	 * @param ����֤���ַ���
	 * @return ����Ƿ��ϸ�ʽ���ַ���,����true,����Ϊfalse
	 */
	public static boolean isChinese(String str) {
		if (isBlank(str)) {
			return false;
		}
		String regex = "^[\u4e00-\u9fa5],{0,}$";
		return match(regex, str);
	}

	/**
	 * ��֤�Ƿ���ͼƬ�ļ�
	 * @param file ��Ҫ��֤���ļ�
	 * @return �����ͼƬ�ļ�,����true,����Ϊfalse
	 */
	public static boolean isImage(File file) {
		byte[] b = new byte[10];
		int l = -1;
		try {
			InputStream imgFile = new FileInputStream(file);
			l = imgFile.read(b);
			imgFile.close();
		} catch (Exception e) {
			return false;
		}
		if (l == 10) {
			byte b0 = b[0];
			byte b1 = b[1];
			byte b2 = b[2];
			byte b3 = b[3];
			byte b6 = b[6];
			byte b7 = b[7];
			byte b8 = b[8];
			byte b9 = b[9];
			if (b0 == (byte) 'G' && b1 == (byte) 'I' && b2 == (byte) 'F') {
				return true;
			} else if (b1 == (byte) 'P' && b2 == (byte) 'N' && b3 == (byte) 'G') {
				return true;
			} else if (b6 == (byte) 'J' && b7 == (byte) 'F' && b8 == (byte) 'I'
					&& b9 == (byte) 'F') {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	/**
	 * ��֤�Ƿ���ͼƬ�ļ���С�Ƿ�С�ڵ���ָ����С
	 * @param file ��Ҫ��֤���ļ�
	 * @param size ָ����С ��λkb
	 * @return �����С��ָ����С,����true,����Ϊfalse
	 */
	public static boolean isLtImageSize(File file, int size) {
		if (file == null || size <= 0) {
			return false;
		}
		long length = size * 1024;// ��Kb�����ֽ�
		if (file.length() <= length) {
			return true;
		} else {
			return false;
		}
	}
	
	/**
	 * ����ǲ���ͼƬ�Ƿ�С��ָ����С
	 * @param fileList ��Ҫ��֤���ļ�����
	 * @param size ָ����С ��λkb
	 * @return �����״�ƥ�䵽�����ϵ��ļ����� ���򷵻�-1
	 */
	public static int chkImage(List<File> fileList, int size) {
		int i=0;
		if(!isEmpty(fileList)){
			for(File file : fileList){
				if(!isImage(file) || !isLtImageSize(file, size)){
					return i;
				}
				i++;
			}
		}
		return -1;
	}
	
	/**
	 * ����ǲ���ͼƬ�Ƿ�С��ָ����С
	 * @param fileList ��Ҫ��֤���ļ�
	 * @param size ָ����С ��λkb
	 * @return ����Ƿ���,����true,����Ϊfalse
	 */
	public static boolean chkImage(File file, int size) {
		if(!isImage(file) || !isLtImageSize(file, size)){
			return false;
		}
		return true;
	}

	/**
	 * @param regex ������ʽ�ַ���
	 * @param str Ҫƥ����ַ���
	 * @return ���str ���� regex��������ʽ��ʽ,����true, ���򷵻� false;
	 */
	private static boolean match(String regex, String str) {
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(str);
		return matcher.matches();
	}
}