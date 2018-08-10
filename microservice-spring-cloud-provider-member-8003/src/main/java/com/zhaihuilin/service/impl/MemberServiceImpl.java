package com.zhaihuilin.service.impl;

import com.zhaihuilin.dao.MemberRepository;
import com.zhaihuilin.entity.Member;
import com.zhaihuilin.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by zhaihuilin on 2018/8/7 18:19.
 */
@Service
public class MemberServiceImpl implements MemberService {


  @Autowired
  private MemberRepository memberRepository;


  @Override
  public Member findMemberByMemberId(String memberId) {
    return memberRepository.findMemberByMemberId(memberId);
  }


  @Override
  public List<Member> findAll() {
    return memberRepository.findAll();
  }

  @Transactional
  @Override
  public Member saveMember(Member member) {
    return memberRepository.save(member);
  }
}
