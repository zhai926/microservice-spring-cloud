package com.zhaihuilin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * Created by zhaihuilin on 2018/8/9 17:48.
 */
@SpringBootApplication
@EnableHystrixDashboard
public class MicroserviceSpringCloudConsumerHystrixDashboard {
  public static void main(String[] args) {
    SpringApplication.run(MicroserviceSpringCloudConsumerHystrixDashboard.class,args);
  }
}
