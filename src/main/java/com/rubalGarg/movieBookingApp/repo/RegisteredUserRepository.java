package com.rubalGarg.movieBookingApp.repo;

import com.rubalGarg.movieBookingApp.model.RegisteredUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegisteredUserRepository extends JpaRepository<RegisteredUser, Integer> {
}
