package com.rubalGarg.movieBookingApp.controller;

import com.rubalGarg.movieBookingApp.model.RegisteredUser;
import com.rubalGarg.movieBookingApp.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LoginController {

    @Autowired
    private LoginService loginService;

    @PostMapping("/registerUser")
    public List<RegisteredUser> registerUser(@RequestBody List<RegisteredUser> users){
        return loginService.registerUser(users);
    }

}
