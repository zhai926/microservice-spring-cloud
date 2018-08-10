package com.zhaihuilin.service;

import com.zhaihuilin.entity.Member;

import java.util.List;

/**
 * Created by zhaihuilin on 2018/8/7 18:18.
 */
public interface MemberService {

  public Member findMemberByMemberId(String memberId);

  public List<Member> findAll();

  public  Member saveMember(Member member);
}
