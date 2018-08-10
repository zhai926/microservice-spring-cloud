package com.zhaihuilin.service;

import com.zhaihuilin.entity.Member;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 对 服务进行容错处理  不必在 controller 里进行处理
 * Created by zhaihuilin on 2018/8/9 16:43.
 */
@Component
public class MemberServiceFallBackFactory implements FallbackFactory<MemberFeignService> {


  @Override
  public MemberFeignService create(Throwable throwable) {
    return new MemberFeignService() {
      @Override
      public Member findMemberByMemberId(String memberId) {

        Member member =new Member();
        member.setMemberId(memberId);
        member.setUserName("该编号:"+ memberId + "不存在,该服务降级处理,已暂停该服务");
        return member;
      }

      @Override
      public List<Member> findAll() {
        return null;
      }

      @Override
      public Member saveMember(Member member) {
        return null;
      }
    };
  }
}
