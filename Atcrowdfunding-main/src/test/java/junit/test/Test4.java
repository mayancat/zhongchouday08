package junit.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.atguigu.atcrowdfunding.bean.User;
import com.atguigu.atcrowdfunding.manager.service.UserService;
import com.atguigu.atcrowdfunding.util.MD5Util;

public class Test4 {

	public static void main(String[] args) throws Exception {
		ApplicationContext ioc = new ClassPathXmlApplicationContext("spring/spring*.xml");
		
		UserService userService = ioc.getBean(UserService.class);
		
		
		for (int i = 101; i <= 200; i++) {
			User user = new User();
			user.setLoginacct("test"+i);
			user.setUserpswd(MD5Util.digest("123"));
			user.setUsername("test"+i);
			user.setEmail("2045579742"+i+"@qq.com");
			user.setCreatetime("2019-05-23 14:17:00");
			userService.saveUser(user);
		}
		
	}

}
