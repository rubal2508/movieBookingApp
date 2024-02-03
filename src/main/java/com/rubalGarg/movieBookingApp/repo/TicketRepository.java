package com.rubalGarg.movieBookingApp.repo;

import com.rubalGarg.movieBookingApp.model.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TicketRepository extends JpaRepository<Ticket,Integer> {
    List<Ticket> getTicketsByUserId(Integer userId);
}
