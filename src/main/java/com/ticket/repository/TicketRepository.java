package com.ticket.repository;

import org.springframework.data.repository.CrudRepository;

import com.ticket.model.Ticket;

public interface TicketRepository extends CrudRepository<Ticket, Integer> {

}
