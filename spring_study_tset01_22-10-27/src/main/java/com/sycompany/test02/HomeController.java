package com.sycompany.test02;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.apache.taglibs.standard.lang.jstl.test.beans.PublicBean1;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
	
	@RequestMapping("border/login")
	public String login() {
		
		return "border/login";
	}
	
	
	@RequestMapping("border/loginok")
	public String loginok(HttpServletRequest requset, Model model) {
			
		String id = requset.getParameter("id");
		String pw = requset.getParameter("pw");

		
		if(id.equals("admin") && pw.equals("12345")) {
			model.addAttribute("usercheck", "관리자");
			return "border/admin";
		} else if(id.equals("user") && pw.equals("12345")) {
			model.addAttribute("usercheck", "사용자");
			return "border/user";
		} else {
			model.addAttribute("usercheck","비회원");
			return "border/loginfair";
		}
		
		
	}
	
	@RequestMapping("border/admin")
	public String admin() {
		return "border/admin";
	}
		
	@RequestMapping("border/user")
		public String user() {
			return "border/user";
		}
	
	@RequestMapping("border/loginfair")
		public String loginfair() {
			return "border/loginfair";
		}
		
}
