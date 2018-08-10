package com.zhaihuilin.service;

import com.zhaihuilin.entity.Member;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 *
 * Created by zhaihuilin on 2018/8/9 14:43.
 */
@FeignClient(name = "MICROSERVICE-MEMBER",fallbackFactory = MemberServiceFallBackFactory.class)   // 连接哪一个微服务
public interface MemberFeignService {

  @RequestMapping(value = "/api/member/findMemberId/{memberId}",method = RequestMethod.GET)
  public Member findMemberByMemberId(String memberId);


  @RequestMapping(value = "/api/member/list",method = RequestMethod.GET)
  public List<Member> findAll();

  @RequestMapping(value = "/api/member/save",method = RequestMethod.POST)
  public  Member saveMember(Member member);

}
