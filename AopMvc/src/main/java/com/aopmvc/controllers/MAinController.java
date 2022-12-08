package com.aopmvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class MAinController {


	public MAinController() {
		super();
		System.out.println("MAinController.MAinController()");
	}
	@RequestMapping("/")
	public String home() {
		return "index";
	}
	@RequestMapping("/hello")
	public String first()
	{
		return "hello";
	}
	
	
}
