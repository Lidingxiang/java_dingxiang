package com.dingxiang.dao.impl;

import com.dingxiang.dao.UserDAO;
import com.dingxiang.model.User;

public class UserDAOImpl implements UserDAO {

	private int daoId;
	private String daoStatus;

	public int getDaoId() {
		return daoId;
	}

	public void setDaoId(int daoId) {
		this.daoId = daoId;
	}

	public String getDaoStatus() {
		return daoStatus;
	}

	public void setDaoStatus(String daoStatus) {
		this.daoStatus = daoStatus;
	}

	@Override
	public void save(User user) {
		// Hibernate
		// JDBC
		// XML
		// NetWork
		System.out.println("user saved!");
		System.out.print("daoId=" + this.daoId + "daoStatus=" + this.daoStatus);
	}

}
