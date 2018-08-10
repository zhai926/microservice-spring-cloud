package com.zhaihuilin.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
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

     @HystrixCommand(fallbackMethod = "findMemberIdFallback")
     @RequestMapping(value = "/findMemberId/{memberId}")
     public Member findMemberId(
             @PathVariable("memberId") String memberId
     ){

             Member member=memberService.findMemberByMemberId(memberId);
             if (member == null){
                   throw  new  RuntimeException("该用户不存在");
             }
             return  member;
     }

     @RequestMapping(value = "/findMemberList")
     public List<Member> findMemberList(){

          return memberService.findAll();
     }

     @RequestMapping(value = "/showInfo")
     public  List<ServiceInstance> showInfo(){
          return  this.discoveryClient.getInstances("MICROSERVICE-MEMBER");  // 微服务暴露在外的名称
     }


     public Member findMemberIdFallback(String memberId){
          Member  member =new Member();
          member.setMemberId(memberId);
          member.setUserName("该用户不存在");
          member.setDb_socure("数据库中没有");
          return member;
     }


}
