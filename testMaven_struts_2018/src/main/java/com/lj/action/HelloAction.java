package com.lj.action;

import com.opensymphony.xwork2.ActionSupport;

public class HelloAction extends ActionSupport{
	
	public String hello() {
		System.out.println("进入action");
		return SUCCESS;
	}
}
