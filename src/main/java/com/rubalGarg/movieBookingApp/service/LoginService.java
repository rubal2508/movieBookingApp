package com.rubalGarg.movieBookingApp.service;

import com.rubalGarg.movieBookingApp.model.RegisteredUser;
import com.rubalGarg.movieBookingApp.repo.RegisteredUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoginService {

    @Autowired
    private RegisteredUserRepository registeredUserRepository;

    public List<RegisteredUser> registerUser(List<RegisteredUser> users){
        return registeredUserRepository.saveAll(users);
    }
}
