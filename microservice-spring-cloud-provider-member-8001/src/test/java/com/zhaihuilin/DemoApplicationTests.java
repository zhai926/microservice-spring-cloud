package com.zhaihuilin;

import com.zhaihuilin.entity.Member;
import com.zhaihuilin.service.MemberService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {


	@Autowired
	private MemberService memberService;

	@Test
	public  void  save() throws  Exception{
		Member member =new Member("admin","上海市",20,"01");
		memberService.saveMember(member);
		System.out.println("-------》"+member.toString());
	}

}
