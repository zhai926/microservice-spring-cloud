package com.zhaihuilin.utils;

/**
 * 字符串非空判断
 * Created by zhaihuilin on 2018/5/23 15:47.
 */
public class StringUtil {

  public  static  boolean isNotEmpty(String str){
     if (str !=null && str.trim().length()!=0){
        return  true;
     }
     return false;
  }

}
