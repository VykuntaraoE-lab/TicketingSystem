package com.ticket.controller;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.ticket.model.Ticket;
import com.ticket.service.TicketService;

@RestController
public class TicketController {

	private static final Logger logger = LogManager.getLogger(TicketController.class);

	@Autowired
	TicketService ticketService;

	@RequestMapping("/user")
	public ModelAndView add(Model model) {
		return new ModelAndView("home");
	}

	@RequestMapping("/newTicket")
	public ModelAndView newTicket(Model model) {
		model.addAttribute("ticket", new Ticket());
		return new ModelAndView("ticketForm");
	}

	@RequestMapping(value = "/saveTicket", method = RequestMethod.POST)
	public ModelAndView saveTicket(Ticket ticket) {
		ticketService.addTicket(ticket);
		return new ModelAndView("success");

	}
}
