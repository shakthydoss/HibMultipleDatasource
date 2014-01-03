package com.poc.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.poc.dao.IUserDAO;
import com.poc.model.User;

@Service
public class UserServiceImpl implements IUserService{

	private IUserDAO userDAO;
	
	@Override
	public List<User> getUsers() {
		System.out.println("\n\nI am in UserServiceImp....");
		return userDAO.getUsers();
	}
	public void setUserDAO(IUserDAO userDAO) {
		this.userDAO = userDAO;
	}

	public IUserDAO getUserDAO() {
		return userDAO;
	}

}
