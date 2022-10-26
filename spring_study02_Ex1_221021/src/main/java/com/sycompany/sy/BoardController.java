package com.sycompany.sy;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BoardController {

		@RequestMapping(value = "/good") 
		public String good() {
			return "good";
		}
}
