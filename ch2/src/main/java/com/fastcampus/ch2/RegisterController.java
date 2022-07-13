package com.fastcampus.ch2;

import java.net.URLEncoder;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller // ctrl+shift+os
public class RegisterController {
	
	@RequestMapping(value = "/register/add", method={RequestMethod.GET, RequestMethod.POST})
	public String register() {
		return "registerFrom"; //WEB-INF//views/registerForm.jsp
	}
	
	//@RequestMapping(value = "/register/save", method=RequestMethod.POST)
	@PostMapping("/register/save") // 4.3부터
	public String save(User user, Model m) throws Exception {
		//1. 유효성검사
		if(!isValid(user)) {
			String msg = URLEncoder.encode("id를 잘못 입력하셨습니다.", "utf-8");
			
			m.addAttribute("msg", msg);
			return "forward:/register/add"; //url재작성(rewriting)
			//return "redirect:/register/add?msg"+msg; //url재작성(rewriting)
			
		}
		
		//2. DB에 신규회원 정보를 저장
		return "registerinfo";
	}

	private boolean isValid(User user) {
		return false;
	}
	
	
	

}
