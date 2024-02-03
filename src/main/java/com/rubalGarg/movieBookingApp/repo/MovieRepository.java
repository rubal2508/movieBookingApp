package com.rubalGarg.movieBookingApp.repo;

import com.rubalGarg.movieBookingApp.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Integer> {
}
