package com.poc.rest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserController {

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public @ResponseBody String add() {
		System.out.println("I am from rest add");
		return "add method from rest";
	}
 
	@RequestMapping(value = "/edit", method = RequestMethod.GET)
	public  @ResponseBody String edit() {
		System.out.println("I am from rest edit");
		return "edit method from rest";
	}
}
