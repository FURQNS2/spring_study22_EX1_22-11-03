package com.sycompany.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller   //자동으로 import해주고 객체형성을 하지 않아도 바로 사용가능
public class MyController {

	@RequestMapping(value = "/member")  //member가 불리면 하단 메소드를 작동하라
	public String member() {
		return "member";
	}
	
	
}
