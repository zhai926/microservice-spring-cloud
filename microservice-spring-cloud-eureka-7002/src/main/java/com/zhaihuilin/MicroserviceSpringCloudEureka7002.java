package com.zhaihuilin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by zhaihuilin on 2018/8/8 14:34.
 */

@EnableEurekaServer
@SpringBootApplication
public class MicroserviceSpringCloudEureka7002 {

  public static void main(String[] args) {
     SpringApplication.run(MicroserviceSpringCloudEureka7002.class,args);
  }
}
