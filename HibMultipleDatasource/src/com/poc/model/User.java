package com.poc.model;

import java.io.Serializable;

/**
 * @author sakthidasans
 *
 */
public class User implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private int id;
	private String userId;
	private String firstName;
	private String lastName;
	private String email;
	
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEmail() {
		return email;
	}
	
	
}
