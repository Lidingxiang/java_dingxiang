package com.dingxiang.service;

import com.dingxiang.dao.UserDAO;
import com.dingxiang.dao.impl.UserDAOImpl;
import com.dingxiang.model.User;

public class UserService {
	
	private UserDAO userDao;

	public UserDAO getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDAO userDao) {
		this.userDao = userDao;
	}
	
	public void add(User user) {
		
		this.userDao.save(user);
	}
}
