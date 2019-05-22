package com.atguigu.atcrowdfunding.manager.service;

import java.util.Map;

import com.atguigu.atcrowdfunding.bean.User;
import com.atguigu.atcrowdfunding.util.Page;

public interface UserService {

	User queryUserlogin(Map<String, Object> paramMap);

	//@Deprecated
	//Page queryPage(Integer pageno, Integer pagesize);
	
	
	int saveUser(User user);

	Page queryPage(Map<String,Object> paramMap);

}
