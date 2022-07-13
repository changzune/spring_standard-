package com.fastcampus.ch2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/login")
public class LoginController {
	@GetMapping("/login")
	public String loginForm(){
		return "loginForm";
	}
	
	@PostMapping("/login")
	public String login(String id, String pwd){
		// 1.id와 pwd를 확인
		// 2.id와 pwd가 일치하면, 홈으로 이동
		// 일치 하지 않으며, loginForm으로 이동
		return "loginForm";
	}
	

}
