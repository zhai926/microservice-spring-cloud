package com.zhaihuilin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Created by zhaihuilin on 2018/8/10 13:44.
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigApplication3344 {

  public static void main(String[] args) {
     SpringApplication.run(ConfigApplication3344.class,args);
  }
}
