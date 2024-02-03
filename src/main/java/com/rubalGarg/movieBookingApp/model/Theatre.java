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
public class Theatre {
    @Id
    private int theatreId;
    private String theatreName;
    private int totalCapacity;
    private String location;
}
