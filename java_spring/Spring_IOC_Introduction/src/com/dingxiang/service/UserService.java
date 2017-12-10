package com.dingxiang.service;

import com.dingxiang.dao.UserDAO;
import com.dingxiang.dao.impl.UserDAOImpl;
import com.dingxiang.model.User;

public class UserService {
	
	private UserDAO userDAO;

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
