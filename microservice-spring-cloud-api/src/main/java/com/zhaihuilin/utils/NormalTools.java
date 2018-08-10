package com.zhaihuilin.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by zhaihuilin on 2018/5/24 16:22.
 */
public class NormalTools {

  public static String getFileType(String fileName) {
    if(fileName!=null && fileName.indexOf(".")>=0) {
      return fileName.substring(fileName.lastIndexOf("."), fileName.length());
    }
    return "";
  }

  /**
   * 判断文件是否为图片文件
   * @param fileName
   * @return
   */
  public static Boolean isImageFile(String fileName) {
    String [] img_type = new String[]{".jpg", ".jpeg", ".png", ".gif", ".bmp"};
    if(fileName==null) {return false;}
    fileName = fileName.toLowerCase();
    for(String type : img_type) {
      if(fileName.endsWith(type)) {return true;}
    }
    return false;
  }

  /**
   * 进行时间的转换
   * @param pattern
   * @return
   */
  public static String curDate(String pattern) {
    SimpleDateFormat sdf = new SimpleDateFormat(pattern);
    return sdf.format(new Date());
  }

  public static String curDate() {
    return curDate("yyyy-MM-dd HH:mm:ss");
  }
}
