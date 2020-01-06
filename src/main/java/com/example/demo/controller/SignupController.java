package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SignupController{
	
	@RequestMapping("/signup")
	public String signup()
	{
		return "signup";
	}
}