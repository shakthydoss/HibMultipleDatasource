package com.poc.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.poc.model.User;

public class UserDAOImpl2 extends HibernateDaoSupport  implements IUserDAO2{
	
	@Autowired
	//private SessionFactory sessionFactory;
	
	public List<User> getUsers() {
		System.out.println("I am from PGTIS");
		//Session  session = sessionFactory.openSession();
		return null;
	}
	
	
}
