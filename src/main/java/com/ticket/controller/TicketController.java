package com.ticket.controller;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.ticket.service.TicketService;

@RestController
public class TicketController {

	private static final Logger logger = LogManager.getLogger(TicketController.class);

	@Autowired
	TicketService ticketService;
}
