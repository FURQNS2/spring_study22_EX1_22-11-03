package com.sycompany.test;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller   //자동으로 import해주고 객체형성을 하지 않아도 바로 사용가능
public class MyController {

	@RequestMapping(value = "/member")  //member가 불리면 하단 메소드를 작동하라
	public String member() {

		return "member";
	}
	
	@RequestMapping(value = "/list")  //member가 불리면 하단 메소드를 작동하라
	public String list() { // view에 사용하는 jsp이름은 당연히 문자열(String)이다. 

		return "list";   //view로 사용한 jsp 이름 작성
	}

	@RequestMapping(value = "/Content")  //member가 불리면 하단 메소드를 작동하라
	public String content() { // view에 사용하는 jsp이름은 당연히 문자열(String)이다. 
	
		return "board/Content";   //폴더를 만들었다면 폴더명까지 넣어줘야 한다. (WEB-INF/views/board/content.jsp)
	}
	
	@RequestMapping(value = "/view")  //member가 불리면 하단 메소드를 작동하라
	public String view(Model model) { // view에 사용하는 jsp이름은 당연히 문자열(String)이다. 
		
		model.addAttribute("name", "홍길동"); // String name="홍길동"; add-얻어서 저장하다 set와 거의 유사, addAttribute("변수명","아무거나 적음, 숫자열 or 문자열 모두가능")
		
		return "board/view";   //폴더를 만들었다면 폴더명까지 넣어줘야 한다. (WEB-INF/views/board/content.jsp)
	}
	
	@RequestMapping(value = "/reply")  //member가 불리면 하단 메소드를 작동하라
	public ModelAndView reply(Model model) { // view에 사용하는 jsp이름은 당연히 문자열(String)이다. 
		
		ModelAndView mv =new ModelAndView();  //데이터와jsp를 두가지 동시에 잡을 수 있는 클래스
		mv.addObject("name", "홍길동");
		mv.addObject("age", "30");
		mv.setViewName("board/reply");

		return mv;   // 입력된 데이터와 jsp를 입력받은 객체반환
	}
}
