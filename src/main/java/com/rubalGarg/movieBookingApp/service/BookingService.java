package com.rubalGarg.movieBookingApp.service;

import com.rubalGarg.movieBookingApp.model.RegisteredUser;
import com.rubalGarg.movieBookingApp.model.Show;
import com.rubalGarg.movieBookingApp.model.Ticket;
import com.rubalGarg.movieBookingApp.repo.RegisteredUserRepository;
import com.rubalGarg.movieBookingApp.repo.ShowRepository;
import com.rubalGarg.movieBookingApp.repo.TicketRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookingService {

    @Autowired
    private TicketRepository ticketRepository;

    @Autowired
    private RegisteredUserRepository registeredUserRepository;

    @Autowired
    private ShowRepository showRepository;

    static final Logger log = LoggerFactory.getLogger(BookingService.class);

    public Ticket bookTicket(Ticket ticket){
        // check if user/show exists
        Optional<RegisteredUser> user = registeredUserRepository.findById(ticket.getUserId());
        Optional<Show> show = showRepository.findById(ticket.getShowId());
        if(!user.isPresent()){
            log.info("User not registered");
            return null;
        }

        // check seating cap
        if (show.get().getAvailableSeats() < ticket.getSeats()){
            log.info("not enough seats");
            return null;
        }

        int curr_seats = show.get().getAvailableSeats();
        show.get().setAvailableSeats(curr_seats - ticket.getSeats());
        showRepository.save(show.get());
        return ticketRepository.save(ticket);
    }

    public List<Ticket> getBookingHistory(int userId){
        return ticketRepository.getTicketsByUserId(userId);
    }
}
