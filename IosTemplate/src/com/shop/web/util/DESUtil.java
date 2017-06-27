package com.shop.web.util;
 /** 
  * DES算法为密码体制中的对称密码体制，又被成为美国数据加密标准，是1972年美国IBM公司研制的对称密码体制加密算法。
  * DES加密、解密字符串算法
  * @author    李国庆 
  * @company   leemenz (C) copyright 
  * @time      Nov 1, 2006  10:18:41 AM 
  * @version   1.0.0.0 
  * @package   com.des 
  */   
   
 import java.security.*;  
import javax.crypto.*;  
   
 public class DESUtil {  
  private static String strDefaultKey = "national";  
   
  private static Cipher encryptCipher = null;  
   
  private static Cipher decryptCipher = null;  
  
  static{
	  initKey(strDefaultKey);
	  
  }
  /** 
   * 将byte数组转换为表示16进制值的字符串， 如：byte[]{8,18}转换为：0813， 和private static byte[] 
   * hexStr2ByteArr(String strIn) 互为可逆的转换过程 
   *  
   * @param arrB 
   *            需要转换的byte数组 
   * @return 转换后的字符串 
   * @throws Exception 
   *             本方法不处理任何异常，所有异常全部抛出 
   */  
  private static String byteArr2HexStr(byte[] arrB) throws Exception {  
   int iLen = arrB.length;  
   // 每个byte用两个字符才能表示，所以字符串的长度是数组长度的两倍  
   StringBuffer sb = new StringBuffer(iLen * 2);  
   for (int i = 0; i < iLen; i++) {  
    int intTmp = arrB[i];  
    // 把负数转换为正数  
    while (intTmp < 0) {  
     intTmp = intTmp + 256;  
    }  
    // 小于0F的数需要在前面补0  
    if (intTmp < 16) {  
     sb.append("0");  
    }  
    sb.append(Integer.toString(intTmp, 16));  
   }  
   return sb.toString();  
  }  
   
  /** 
   * 将表示16进制值的字符串转换为byte数组， 和private static String byteArr2HexStr(byte[] arrB) 
   * 互为可逆的转换过程 
   *  
   * @param strIn 
   *            需要转换的字符串 
   * @return 转换后的byte数组 
   * @throws Exception 
   *             本方法不处理任何异常，所有异常全部抛出 
   * @author <a href="mailto:leo841001@163.com">LiGuoQing</a> 
   */  
  private static byte[] hexStr2ByteArr(String strIn) throws Exception {  
   byte[] arrB = strIn.getBytes();  
   int iLen = arrB.length;  
   
   // 两个字符表示一个字节，所以字节数组长度是字符串长度除以2  
   byte[] arrOut = new byte[iLen / 2];  
   for (int i = 0; i < iLen; i = i + 2) {  
    String strTmp = new String(arrB, i, 2);  
    arrOut[i / 2] = (byte) Integer.parseInt(strTmp, 16);  
   }  
   return arrOut;  
  }   
  /** 
   *禁用NEW
   */  
  private DESUtil(){}
   
  public static void initKey(String strKey){
		//Security.addProvider(new com.sun.crypto.provider.SunJCE());  
		Key key=null;
		try {
			key = getKey(strKey.getBytes());
			encryptCipher = Cipher.getInstance("DES");  
			encryptCipher.init(Cipher.ENCRYPT_MODE, key);  
			   
			decryptCipher = Cipher.getInstance("DES");  
			decryptCipher.init(Cipher.DECRYPT_MODE, key); 
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}   
	  
  }
  
  /** 
   * 加密字节数组 
   *  
   * @param arrB 
   *            需加密的字节数组 
   * @return 加密后的字节数组 
   * @throws Exception 
   */  
  private static byte[] encrypt2(byte[] arrB) throws Exception {  
   return encryptCipher.doFinal(arrB);  
  }  
   
  /** 
   * 加密字符串 
   *  
   * @param strIn 
   *            需加密的字符串 
   * @return 加密后的字符串 
   * @throws Exception 
   */  
  public static String encrypt(String strIn) throws Exception {  
	  if(null==strIn) return "";
   return byteArr2HexStr(encrypt2(strIn.getBytes()));  
  }  
   
  /** 
   * 解密字节数组 
   *  
   * @param arrB 
   *            需解密的字节数组 
   * @return 解密后的字节数组 
   * @throws Exception 
   */  
  private static byte[] decrypt2(byte[] arrB) throws Exception {  
   return decryptCipher.doFinal(arrB);  
  }  
   
  /** 
   * 解密字符串 
   *  
   * @param strIn 
   *            需解密的字符串 
   * @return 解密后的字符串 
   * @throws Exception 
   */  
  public static String decrypt(String strIn) throws Exception {  
	  if(null==strIn) return "";
   return new String(decrypt2(hexStr2ByteArr(strIn)));  
  }  
   
  /** 
   * 从指定字符串生成密钥，密钥所需的字节数组长度为8位 不足8位时后面补0，超出8位只取前8位 
   *  
   * @param arrBTmp 
   *            构成该字符串的字节数组 
   * @return 生成的密钥 
   * @throws java.lang.Exception 
   */  
  private static Key getKey(byte[] arrBTmp) throws Exception {  
   // 创建一个空的8位字节数组（默认值为0）  
   byte[] arrB = new byte[8];  
   
   // 将原始字节数组转换为8位  
   for (int i = 0; i < arrBTmp.length && i < arrB.length; i++) {  
    arrB[i] = arrBTmp[i];  
   }  
   
   // 生成密钥  
   Key key = new javax.crypto.spec.SecretKeySpec(arrB, "DES");  
   
   return key;  
  }  

   
  /** 
   * @param args 
   */  
  public static void main(String[] args) {  
   // TODO Auto-generated method stub  
   try {  
    String test = "Hellow Word!";  
    //56385fcfade748e690286e94464c975b
    DESUtil.initKey("leemenz");
    System.out.println("加密前的字符："+test);  
    System.out.println("加密后的字符："+DESUtil.encrypt(test));  
    System.out.println("解密后的字符："+DESUtil.decrypt(DESUtil.encrypt(test)));  
    
    System.out.println("加密后的字符："+DESUtil.decrypt(null)); 
    
    
    
   } catch (Exception e) {  
    // TODO: handle exception  
    e.printStackTrace();  
   }  
  }  
 } 