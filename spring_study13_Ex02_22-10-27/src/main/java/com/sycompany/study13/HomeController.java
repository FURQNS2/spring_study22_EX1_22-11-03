package com.sycompany.study13;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

	@RequestMapping(value = "/login")
	public String login() {
		
		return "login";
	}
	
	@RequestMapping("/CheckId")
	public String checkid(@RequestParam("id") String id, @RequestParam("pw") String pw, Model model) {
			//@RequestParam에 넘어오는 값이 적은 경우만 사용하는 것이 좋다.
		
		model.addAttribute("id", id);
		model.addAttribute("pw", pw);
				
		return "CheckId";
	}
	
	@RequestMapping(value = "/join")
	public String join() {
		
		return "join";
	}
	
	
//	@RequestMapping("/joinok")
//	public String joinok(HttpServletRequest request, Model model) {
//		
//		String mid = request.getParameter("id");
//		String mpw = request.getParameter("pw");
//		String mname = request.getParameter("name");
//		String memail = request.getParameter("email");
//		
//		MemberDto member = new MemberDto(mid, mpw, mname, memail);
//
//		model.addAttribute("memberInfo", member);
//		
////		model.addAttribute("id",mid);
////		model.addAttribute("pw",mpw);
////		model.addAttribute("name",mname);
////		model.addAttribute("email",memail);
//		
//		return "joinok";
//	}
	
	
	
//	@RequestMapping("/joinok")
//	public String joinok(MemberDto memberDto) { //클래스를 매개변수로 선언(단, 클래스 이름과 동일해야 함)
//		
//		return "joinok";
//	}

	@RequestMapping("/joinok")
	public String joinok(@ModelAttribute("memberInfo") MemberDto memberDto) { //클래스를 변수명을 변경시킬수 있는 annotation사용하기!
		
		return "joinok";
	}
	
	
	@RequestMapping("/height/{memberHT}")
	public String memberheight(@PathVariable String memberHT, Model model) { //Path-경로, Variable-변수
		model.addAttribute("memberHT", memberHT);
		return "MemberHeight";
	}
	
}
