package com.dingxiang.service;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dingxiang.model.User;

public class UserServiceTest {

	/*
	 * ���Ʒ�ת��
	 * 	1����������ʵ��������������ӿ�
	 * 	2��ԭ���˹�������������������
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
