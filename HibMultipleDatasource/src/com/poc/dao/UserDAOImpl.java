package com.poc.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.poc.model.User;

public class UserDAOImpl extends HibernateDaoSupport  implements IUserDAO{
	
	@Autowired
	private SessionFactory sessionFactory1;
	

	public List<User> getUsers() {
		System.out.println("I am from SLPG");
		
		Session session = sessionFactory1.openSession();
		Query query = session.createQuery("From User");
		query.setCacheable(true);
		List<User> users = query.list();
		return users;
	}
	
	
}
