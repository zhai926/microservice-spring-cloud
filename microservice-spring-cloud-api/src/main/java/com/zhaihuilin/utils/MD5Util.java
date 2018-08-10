package com.zhaihuilin.utils;

import lombok.extern.slf4j.Slf4j;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * MD5加密解密
 * Created by zhaihuilin on 2018/5/23 15:58.
 */
@Slf4j
public class MD5Util {

  // 采用 MD5 的两次加密 生成32位md5码
  public  static  String string2MD5(String inStr) {
    MessageDigest md5 = null;
    try {
      md5 = MessageDigest.getInstance("MD5");// 指定采用什么方式加密  MD5
    } catch (NoSuchAlgorithmException e) {
      log.error("加密错误的原因,{}",e);
      e.printStackTrace();
      return "";
    }
    char[] charArray=inStr.toCharArray(); // 将 String 类型转换成 char[]
    byte[] byteArray=new  byte[charArray.length];

    for (int i = 0; i < charArray.length; i++)
      byteArray[i] = (byte) charArray[i];
    byte[] md5Bytes = md5.digest(byteArray);
    StringBuffer hexValue = new StringBuffer();
    for (int i = 0; i < md5Bytes.length; i++){
      int val = ((int) md5Bytes[i]) & 0xff;
      if (val < 16)
        hexValue.append("0");
      hexValue.append(Integer.toHexString(val));
    }
    return hexValue.toString();
  }

  // 加密解密算法 执行一次加密，两次解密
  public static String convertMD5(String inStr){
     char[] a= inStr.toCharArray();
     for (int i= 0; i<a.length;i++){
       a[i] = (char) (a[i] ^ 't');
     }
     String s =new String(a);
     return  s;
  }

  // 测试主程序
  public static void main(String[] args) {
    String inStr = new String("123456");
    log.info("原始的数据,{}",inStr);
    log.info("MD5后的数据,{}",string2MD5(inStr));
    log.info("加密后的数据,{}",convertMD5(inStr));
    log.info("解密的数据,{}",convertMD5(convertMD5(inStr)));

  }
}
