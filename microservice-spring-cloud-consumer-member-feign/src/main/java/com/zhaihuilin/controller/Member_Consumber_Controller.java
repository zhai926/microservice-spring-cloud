package com.zhaihuilin.controller;

import com.zhaihuilin.entity.Member;
import com.zhaihuilin.service.MemberFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by zhaihuilin on 2018/8/8 10:37.
 */
@RestController
public class Member_Consumber_Controller {

     @Autowired
     private MemberFeignService memberFeignService;


     @RequestMapping(value = "/consumber/member/findMemberId/{memberId}")
     public Member  findMemberId(
             @PathVariable("memberId") String memberId){

        return   this.memberFeignService.findMemberByMemberId(memberId);

     }

     @RequestMapping(value = "/consumber/member/findAll")
     public List<Member> finaAll(){
                  return  this.memberFeignService.findAll();
     }





}
