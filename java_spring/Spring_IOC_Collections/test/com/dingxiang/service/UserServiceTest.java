package com.dingxiang.service;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dingxiang.dao.UserDAO;

public class UserServiceTest {

	/*
	 * ���Ʒ�ת��
	 * 	1����������ʵ��������������ӿ�
	 * 	2��ԭ���˹�������������������
	 * */
	@Test
	public void testAdd() throws Exception {
 
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		
		UserDAO u1 = (UserDAO)ctx.getBean("u");
		
		System.out.println(u1.toString());
	}
}
