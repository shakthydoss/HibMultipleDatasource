package com.poc.multiurlpatter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import com.poc.service.IUserService;
import com.poc.service.IUserService2;

@Controller
@SessionAttributes
public class UserController extends MultiActionController {
	
	@Autowired
	private IUserService userService;
	
	@Autowired
	private IUserService2 userService2;

	public ModelAndView add(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		System.out.println("Add method called");
		if(userService == null){
			System.out.println("\n\nuserService is null");
		}else{
			userService.getUsers();
		}
		
		if(userService2 == null){
			System.out.println("\n\nuserService2 is null");
		}else{
			userService2.getUsers();
		}
		return new ModelAndView("add", "message", "Add method is called in multiple controller");
	}
	
	public ModelAndView edit(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		System.out.println("edit method called");
		return new ModelAndView("edit", "message", "Edit method is called in multiple controller");
	}
	
}