package com.fastcampus.ch2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller // ctrl+shift+os
public class RegisterController {
	
	@RequestMapping("/regsiter/add")
	public String register() {
		
		return "registerForm"; //WEB-INF//
		
		
	}
	
	
	
	

}
