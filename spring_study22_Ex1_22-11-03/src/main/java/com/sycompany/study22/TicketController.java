package com.sycompany.study22;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TicketController {

	private TicketDao dao;   //dao클래스를 멤버변수로 선언
	
	
	@Autowired   // 불려온 값을 초기화 시켜줌
	public void setDao(TicketDao dao) {
		this.dao = dao;
	}

	
	@RequestMapping("/buy_ticket")
	public String buy_ticket() {
		return "buy_ticket";
	}
	
	@RequestMapping("/buy_ticket_card")
	public String buy_ticket_card(TicketDto tickerDto, Model model) {
		//TicketDao dao = new TicketDao();
		dao.buyTicket(tickerDto);
		model.addAttribute("ticketInfo", tickerDto);
		
		return "buy_ticket_end";
	}
	
}
