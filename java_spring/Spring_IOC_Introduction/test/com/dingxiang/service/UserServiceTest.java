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

		// BeanFactory applicationContext = new ClassPathXmlApplicationContext();
		// UserService userService = new UserService();
		// UserDAO dao = (UserDAO) applicationContext.getBean("u");
		// userService.setUserDao(dao);
		// User u = new User();
		// userService.add(u);

		// BeanFactory applicationContext = new
		// ClassPathXmlApplicationContext("beans.xml");
		// UserService service = (UserService)
		// applicationContext.getBean("userService");
		//
		// User u = new User();
		// service.add(u);
		

		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		UserService service = (UserService) ctx.getBean("userService");

		User u = new User();
		u.setUsername("zhangsan");
		u.setPassword("zhangsan");
		service.add(u);
	}
}
