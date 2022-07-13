package com.fastcampus.ch2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller // ctrl+shift+os
public class RegisterController {
	
	@RequestMapping("/register/add")
	public String register() {
		return "registerFrom"; //WEB-INF//
	}
	
	@RequestMapping(value = "/register/save", method=RequestMethod.POST)
	
	public String save() {
		return "registerinfo";
	}
	
	
	

}
