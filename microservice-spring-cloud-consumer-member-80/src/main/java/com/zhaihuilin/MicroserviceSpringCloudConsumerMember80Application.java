package com.zhaihuilin;

import com.myrule.MyRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * Created by zhaihuilin on 2018/8/8 9:30.
 */
@SpringBootApplication
@EnableEurekaClient   // 开启服务
@RibbonClient(name = "MICROSERVICE-MEMBER",configuration = MyRule.class)
public class MicroserviceSpringCloudConsumerMember80Application {

  /**
   * 必须添加
   * @return
   */
  @Bean
  @LoadBalanced   // 是restTemplate  整合 Ribbon   必须添加
  public RestTemplate restTemplate(){
     return  new RestTemplate();
  }

  public static void main(String[] args) {
    SpringApplication.run(MicroserviceSpringCloudConsumerMember80Application.class,args);
  }
}
