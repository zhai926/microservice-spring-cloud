package com.zhaihuilin.dao;

import com.zhaihuilin.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by zhaihuilin on 2018/8/7 18:17.
 */
@Repository
public interface MemberRepository extends JpaRepository<Member,Long> {

     public  Member findMemberByMemberId(String memberId);
}
