package com.zhaihuilin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by zhaihuilin on 2018/8/8 9:30.
 */
@SpringBootApplication
@EnableEurekaClient   // 开启服务
@EnableFeignClients(basePackages = "com.zhaihuilin")
@ComponentScan(value = "com.zhaihuilin")
public class MicroserviceSpringCloudConsumerMemberFeginApplication {

  public static void main(String[] args) {
    SpringApplication.run(MicroserviceSpringCloudConsumerMemberFeginApplication.class,args);
  }
}
