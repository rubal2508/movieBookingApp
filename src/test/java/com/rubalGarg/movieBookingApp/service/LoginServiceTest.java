package com.rubalGarg.movieBookingApp.service;

import com.rubalGarg.movieBookingApp.model.RegisteredUser;
import com.rubalGarg.movieBookingApp.repo.RegisteredUserRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class LoginServiceTest {

    @Mock
    private RegisteredUserRepository registeredUserRepository;

    @InjectMocks
    private LoginService loginService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testRegisterUser() {
        // Arrange
        List<RegisteredUser> usersToSave = Arrays.asList(
                new RegisteredUser(1, "password1"),
                new RegisteredUser(1, "password2")
        );

        List<RegisteredUser> savedUsers = Arrays.asList(
                new RegisteredUser(1, "password1"),
                new RegisteredUser(2, "password2")
        );

        when(registeredUserRepository.saveAll(usersToSave)).thenReturn(savedUsers);

        // Act
        List<RegisteredUser> result = loginService.registerUser(usersToSave);

        // Assert
        verify(registeredUserRepository, times(1)).saveAll(usersToSave);
        assertEquals(savedUsers, result);
    }
}
