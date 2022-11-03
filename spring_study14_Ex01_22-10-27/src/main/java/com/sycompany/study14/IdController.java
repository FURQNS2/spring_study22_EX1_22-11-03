package com.sycompany.study14;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class IdController {

	@RequestMapping("/index")
	public String index() {
			
		return "index";
	}
	
//	@RequestMapping("/student")
//	public String student() {
//			
//		return "studentIdView";
//	}
	
//	@RequestMapping("/studentIdView")
//	public String studentIdView(@RequestParam("id") String id, Model model ) {
//		
//		model.addAttribute("studentId", id);	
//		
//		return "studentIdView";
//	}
	
	@RequestMapping(value="/student", method = RequestMethod.POST)
	public String studentIdView(HttpServletRequest request, Model model) {
		
		String id = request.getParameter("id");
		
		model.addAttribute("studentId", id);	
		
		return "studentIdView";
	}
}
