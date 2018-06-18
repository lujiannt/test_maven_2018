package com.lj.dao.impl;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.lj.dao.UserDao;
import com.lj.model.User;

public class UserDaoImpl extends HibernateDaoSupport implements UserDao{

	@Override
	public User selectUserById(int id) {
		return getHibernateTemplate().get(User.class, id);
	}

}
