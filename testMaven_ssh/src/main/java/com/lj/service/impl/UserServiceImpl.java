package com.lj.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.lj.dao.UserDao;
import com.lj.model.User;
import com.lj.service.UserService;

public class UserServiceImpl implements UserService{
	@Autowired
	private UserDao userDao;
	
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public User findUserById(int id) {
		return userDao.selectUserById(id);
	}

}
