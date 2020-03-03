package com.ticket.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ticket.model.Ticket;
import com.ticket.repository.TicketRepository;

@Service
public class TicketServiceImpl implements TicketService {

	@Autowired
	TicketRepository ticketRepository;

	@Override
	public Ticket addTicket(Ticket ticket) {
		return ticketRepository.save(ticket);
	}

}
