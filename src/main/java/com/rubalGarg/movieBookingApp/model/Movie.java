package com.rubalGarg.movieBookingApp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Movie {

    @Id
    private int movieId;
    private String movieName;
    private float rating = 0.0f;
    private Genre genre;
    private Language language;

}
