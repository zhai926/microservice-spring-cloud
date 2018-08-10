package com.zhaihuilin.utils;

import lombok.extern.slf4j.Slf4j;

import java.util.Random;

/**
 * 生成随机手机短信验证码
 * Created by zhaihuilin on 2018/5/24 16:02.
 */
@Slf4j
public class GenerateSmsUtils {

  public static String generateSms() {
    Random rm = new Random();
    String sms = String.valueOf(rm.nextInt(999999));
    int cha = 0;
    while((cha = 6 - sms.length()) > 0) {
      switch (cha) {
        case 1:
          sms = sms.concat(String.valueOf(rm.nextInt(9)));
          break;
        case 2:
          sms = sms.concat(String.valueOf(rm.nextInt(99)));
          break;
        case 3:
          sms = sms.concat(String.valueOf(rm.nextInt(999)));
          break;
        case 4:
          sms = sms.concat(String.valueOf(rm.nextInt(9999)));
          break;
        default:
          sms = sms.concat(String.valueOf(rm.nextInt(99999)));
          break;
      }
    }
    return sms;
  }

  // 测试主程序
  public static void main(String[] args) {
    for(int i = 0; i < 100000; i++) {
      String s = GenerateSmsUtils.generateSms();
			System.out.println("i == "+i+"  [" + s+"]");
    }
  }
}
