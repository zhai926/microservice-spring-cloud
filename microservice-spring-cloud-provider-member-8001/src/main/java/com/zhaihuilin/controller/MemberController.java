package com.zhaihuilin.controller;

import com.zhaihuilin.entity.Member;
import com.zhaihuilin.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by zhaihuilin on 2018/8/7 18:21.
 */
@RestController
@RequestMapping(value = "/api/member")
public class MemberController {

     @Autowired
     private MemberService memberService;


     @Autowired
     private DiscoveryClient discoveryClient;

     @RequestMapping(value = "/findMemberId/{memberId}")
     public Member findMemberId(
             @PathVariable("memberId") String memberId
     ){

             return  memberService.findMemberByMemberId(memberId);

     }

     @RequestMapping(value = "/findMemberList")
     public List<Member> findMemberList(){

          return memberService.findAll();
     }

     @RequestMapping(value = "/showInfo")
     public  List<ServiceInstance> showInfo(){
          return  this.discoveryClient.getInstances("MICROSERVICE-MEMBER");  // 微服务暴露在外的名称
     }


}
