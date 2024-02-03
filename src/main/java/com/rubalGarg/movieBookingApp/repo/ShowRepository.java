package com.rubalGarg.movieBookingApp.repo;

import com.rubalGarg.movieBookingApp.model.Show;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ShowRepository extends JpaRepository<Show, Integer> {
    List<Show> getShowsByMovieName(String movieName);
}
