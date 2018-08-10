package com.zhaihuilin.controller;

import com.zhaihuilin.config.RestUrlPerfixConfig;
import com.zhaihuilin.entity.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by zhaihuilin on 2018/8/8 10:37.
 */
@RestController
public class Member_Consumber_Controller {

     @Autowired
     private RestTemplate restTemplate;

     @Autowired
     private RestUrlPerfixConfig restUrlPerfixConfig;

     //private  final  static  String Rest_Url_Perfix = "http://localhost:8001/api/member/";
     private  final  static  String Rest_Url_Perfix = "http://MICROSERVICE-MEMBER/api/member/";

     @GetMapping(value = "/consumber/member/findMemberId/{memberId}")
     public Member  findMemberId(
             @PathVariable("memberId") String memberId){

      return restTemplate.getForObject(Rest_Url_Perfix +"/findMemberId/" + memberId,Member.class);

     }

     @GetMapping(value = "/consumber/member/showInfo")
     public Object  showInfo(){
          return restTemplate.getForObject(Rest_Url_Perfix +"/showInfo/" ,Object.class);
     }






}
