package com.zhaihuilin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * Created by zhaihuilin on 2018/8/10 10:23.
 */
@SpringBootApplication
@EnableZuulProxy  // 声明Zuul 代理
public class MicroserviceSpringCloudGatewayZuul9527Application {

  public static void main(String[] args) {
    SpringApplication.run(MicroserviceSpringCloudGatewayZuul9527Application.class,args);
  }
}
