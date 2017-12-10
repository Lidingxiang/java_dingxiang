package com.dingxiang.dao.impl;

import com.dingxiang.dao.UserDAO;
import com.dingxiang.model.User;

public class UserDAOImpl implements UserDAO {

	@Override
	public void save(User user) {
		System.out.println("user saved!");
	}

}
