package com.sycompany.val;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberController {

	@RequestMapping("/login")
	public String login() {
		return "login";
	}
	
	@RequestMapping("/loginok")
	public String loginok(MemberDto memberDto, BindingResult result) {
		
		MemberValidator validator = new MemberValidator();   // 내가 만든  MemberValidator클래스를 객체로 만들기
		validator.validate(memberDto, result);  // html에 입력한 값이 memberDto의 값의 조건과 맞는지 확인할 수 있게 result에 담아줌
		
		if(result.hasErrors()) {
			return "login";
		}else {
			return "loginok";	
		}
		
		
		
		
	}
}

