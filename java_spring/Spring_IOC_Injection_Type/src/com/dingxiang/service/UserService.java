package com.dingxiang.service;

import com.dingxiang.dao.UserDAO;
import com.dingxiang.dao.impl.UserDAOImpl;
import com.dingxiang.model.User;

public class UserService {

	//构造函数注入
	private UserDAO userDAO;
	public UserService(UserDAO userDAO) {
		super();
		this.userDAO = userDAO;
	}

	public UserDAO getUserDAO() {
		return userDAO;
	}

	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

	public void add(User user) {
		this.userDAO.save(user);
	}
}
