package com.rubalGarg.movieBookingApp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Show {

    @Id
    @GeneratedValue
    private int showId;
    private String movieName;
    private String dateTime;
    private int availableSeats;
    private int movieId;
    private int theatreId;

}
