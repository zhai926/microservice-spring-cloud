package com.zhaihuilin.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zhaihuilin on 2018/8/10 16:18.
 */
@RestController
public class ConfigClientController {



     @Value("${spring.application.name}")
     private  String applicationName;

     @Value("${eureka.client.serviceUrl.defaultZone}")
     private  String eurekaServiceS;

     @Value("${server.port}")
     private  String  port;

     @GetMapping("/profile")
     public String Hello(){

         System.out.println("applicationName----->"+applicationName);
         System.out.println("eurekaServiceS----->"+eurekaServiceS);
         System.out.println("port----->"+port);

         String sTR = applicationName+ "\t" + eurekaServiceS + "\t" + port;

         return sTR;
     }
}
