package com.sycompany.study13;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

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
	
	@RequestMapping("board/login")
	public String login() {
		
		return "board/login";
	}
	
	@RequestMapping("board/confirmId")
	public String confirmId(HttpServletRequest request, Model model) { //메소드
		
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		System.out.println(id + pw);
		
		model.addAttribute("id", id); // id란 변수에 파라미터 id를 넣는다.
		model.addAttribute("pw", pw); // pw란 변수에 파라미터 pw를 넣는다.
		
		
		return "board/confirmId";
	}

	@RequestMapping("hand/loginok")
	public String loginok() {
		
		return "hand/loginok";
	}
	
	@RequestMapping("hand/board/confirmId")
	public String confirmPw(HttpServletRequest request, Model model) { //메소드
		
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		System.out.println(id + pw);
		
		model.addAttribute("id", id); // id란 변수에 파라미터 id를 넣는다.
		model.addAttribute("pw", pw); // pw란 변수에 파라미터 pw를 넣는다.
		
		
		return "board/confirmId";
	}
	
}

