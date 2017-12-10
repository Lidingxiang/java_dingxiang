package com.dingxiang.service;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dingxiang.model.User;

public class UserServiceTest {

	/*
	 * 控制反转：
	 * 	1：具体依赖实现现在依赖抽象接口
	 * 	2：原来人工控制现在由容器控制
	 * */
	@Test
	public void testAdd() throws Exception {
 
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		
		UserService service = (UserService) ctx.getBean("userService");
		UserService service2 = (UserService) ctx.getBean("userService");
		
		System.out.println(service==service2);

		User u = new User();
		u.setUsername("zhangsan");
		u.setPassword("zhangsan");
		service.add(u);
	}
}
