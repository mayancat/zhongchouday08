package com.atguigu.atcrowdfunding.potal.service;

import java.util.Map;

import com.atguigu.atcrowdfunding.bean.Member;

public interface MemberService {

	Member queryMebmerlogin(Map<String, Object> paramMap);

	void updateAcctType(Member loginMember);

	void updateBasicinfo(Member loginMember);

	void updateEmail(Member loginMember);

	void updateAuthstatus(Member loginMember);

}
