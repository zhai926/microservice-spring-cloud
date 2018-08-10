package com.zhaihuilin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by zhaihuilin on 2018/8/8 9:30.
 */
@SpringBootApplication
@ComponentScan({"com.zhaihuilin.entity","com.zhaihuilin"})
@EnableEurekaClient  // 开启注册客服端
public class MicroserviceSpringCloudMember8003Application {

  public static void main(String[] args) {
    SpringApplication.run(MicroserviceSpringCloudMember8003Application.class,args);
  }
}
