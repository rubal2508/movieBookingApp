package com.rubalGarg.movieBookingApp.service;

import com.rubalGarg.movieBookingApp.model.*;
import com.rubalGarg.movieBookingApp.repo.MovieRepository;
import com.rubalGarg.movieBookingApp.repo.ShowRepository;
import com.rubalGarg.movieBookingApp.repo.TheatreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShowsService {

    @Autowired
    private MovieRepository movieRepository;

    @Autowired
    private ShowRepository showRepository;

    @Autowired
    private TheatreRepository theatreRepository;


    public List<Movie> addMovies(List<Movie> movies){
        return movieRepository.saveAll(movies);
    }

    public List<Theatre> addTheatres(List<Theatre> theatres){
        return theatreRepository.saveAll(theatres);
    }

    public List<Show> addShows(List<Show> shows){
        return showRepository.saveAll(shows);
    }

    public List<Show> searchShows(String movieName) {
        return showRepository.getShowsByMovieName(movieName);
    }

    public Show editShow(Show show){
        return showRepository.save(show);
    }
}
