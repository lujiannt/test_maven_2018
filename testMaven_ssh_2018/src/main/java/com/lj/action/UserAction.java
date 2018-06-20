package com.lj.action;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;

import com.lj.model.User;
import com.lj.service.UserService;
import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport{
	@Autowired
	private UserService userService;
	
	private User user;

	public String hello() {
		return SUCCESS;
	}
	
	public String findUserById(){
		user = userService.findUserById(1);
		System.out.println(user.toString());
		return SUCCESS;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
}
