package com.dingxiang.service;

import org.junit.Test;

import com.dingxiang.dao.UserDAO;
import com.dingxiang.model.User;
import com.dingxiang.spring.BeanFactory;
import com.dingxiang.spring.ClassPathXmlApplicationContext;

public class UserServiceTest {

	@Test
	public void testAdd() throws Exception {

//		 BeanFactory applicationContext = new ClassPathXmlApplicationContext();
//		 UserService userService = new UserService();
//		 UserDAO dao = (UserDAO) applicationContext.getBean("u");
//		 userService.setUserDao(dao);
//		 User u = new User();
//		 userService.add(u);

		BeanFactory applicationContext = new ClassPathXmlApplicationContext();
		UserService service = (UserService) applicationContext.getBean("userService");

		User u = new User();
		service.add(u);
	}
}
