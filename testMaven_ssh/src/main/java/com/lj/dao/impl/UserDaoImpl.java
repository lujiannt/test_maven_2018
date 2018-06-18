package com.lj.dao.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.lj.dao.UserDao;
import com.lj.model.User;

public class UserDaoImpl extends HibernateDaoSupport implements UserDao{

	@Override
	public User selectUserById(int id) {
		//这里的session不是hibernate原生的，而是经过包装过的
		Session session = getHibernateTemplate().getSessionFactory().getCurrentSession();
		Query query = session.createQuery("from User where id = :id");
		query.setParameter("id", id);
		List<User> users = (List<User>) query.list();
		
		//List<User> users = (List<User>) getHibernateTemplate().find("from User where id = ?", id);
		//return getHibernateTemplate().get(User.class, id);
		return users.get(0);
	}

}
