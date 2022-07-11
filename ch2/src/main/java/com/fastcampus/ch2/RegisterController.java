package com.fastcampus.ch2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller // ctrl+shift+os
public class RegisterController {
	
	@RequestMapping("/register/add")
	public String register() {
		return "registerFrom"; //WEB-INF//
	}
	
	@RequestMapping("/register/save")
	public String save() {
		return "registerinfo";
	}
	
	
	

}
