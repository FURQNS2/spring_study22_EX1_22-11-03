package com.sycompany.study14;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RedirectController {

	@RequestMapping("/login")
	public String login() {
		
		return "login";
	}
	
	@RequestMapping("/loginok")
	public String loginok(HttpServletRequest request) {
		
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		if(id.equals("tiger") && pw.equals("12345")) {
			return "redirect: idok";
		}else {
			return "redirect: idNG";
		}
		
	}
	
	@RequestMapping("/idok")
	public String idok() {
		
		return "check/idok";
	}
	
	@RequestMapping("/idNG")
	public String idNG() {
		
		return "check/idNG";
	}
	
	
	@RequestMapping("/test")
	public String test() {
		
		return "redirect:http://localhost:8080/study14/test.jsp";
	}
	
	
}
