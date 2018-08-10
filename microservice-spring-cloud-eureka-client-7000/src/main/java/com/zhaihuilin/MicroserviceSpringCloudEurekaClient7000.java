package com.zhaihuilin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by zhaihuilin on 2018/8/10 17:18.
 */
@SpringBootApplication
@EnableEurekaServer
public class MicroserviceSpringCloudEurekaClient7000 {

  public static void main(String[] args) {
    SpringApplication.run(MicroserviceSpringCloudEurekaClient7000.class,args);
  }
}
