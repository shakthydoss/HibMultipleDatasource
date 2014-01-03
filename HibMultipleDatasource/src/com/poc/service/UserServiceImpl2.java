package com.poc.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.poc.dao.IUserDAO;
import com.poc.dao.IUserDAO2;
import com.poc.model.User;

@Service
public class UserServiceImpl2 implements IUserService2{

	private IUserDAO2 userDAO2;
	
	public IUserDAO2 getUserDAO2() {
		return userDAO2;
	}

	public void setUserDAO2(IUserDAO2 userDAO2) {
		this.userDAO2 = userDAO2;
	}

	@Override
	public List<User> getUsers() {
		System.out.println("\n\nI am in UserServiceImp2....");
		return userDAO2.getUsers();
	}
	

}
