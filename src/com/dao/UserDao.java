package com.dao;

import java.util.ArrayList;

import com.bean.UserBean;

public class UserDao {

	public static ArrayList<UserBean> users = new ArrayList<UserBean>();

	//
	private UserDao() {

	}

	static UserDao userDao = null;

	public static UserDao getInstance() {
		if (userDao == null)
			userDao = new UserDao();

		return userDao;
	}

	public static void addUser(UserBean user) {
		users.add(user);
	}
}

class A {
	void add() {
		UserDao dao = UserDao.getInstance();
		dao.addUser(null);
	}
}