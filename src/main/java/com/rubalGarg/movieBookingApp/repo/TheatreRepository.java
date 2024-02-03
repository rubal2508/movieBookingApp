package com.rubalGarg.movieBookingApp.repo;

import com.rubalGarg.movieBookingApp.model.Theatre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TheatreRepository extends JpaRepository<Theatre,Integer > {
}
