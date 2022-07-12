package com.fastcampus.ch2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller // ctrl+shift+os
public class RegisterController {
	//
	//@RequestMapping(value = "/register/save", method={Request.GET, RequestMethod.POST})
	//@RequestMapping("/register/add") // 신규회원 가입화면 
	@GetMapping("/register/add")
	public String register() {
		return "registerFrom"; //WEB-INF//
	}
	
	//@RequestMapping(value = "/register/save", method=RequestMethod.POST)
	@PostMapping("/register/save") // 4.3
	public String save() {
		return "registerinfo";
	}
	
	
	

}
