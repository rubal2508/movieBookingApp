package com.rubalGarg.movieBookingApp.controller;

import com.rubalGarg.movieBookingApp.model.Movie;
import com.rubalGarg.movieBookingApp.model.Show;
import com.rubalGarg.movieBookingApp.model.Theatre;
import com.rubalGarg.movieBookingApp.service.ShowsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ShowsController {

    @Autowired
    private ShowsService showsService;

    @PostMapping("/addMovies")
    public List<Movie> addMovies(@RequestBody List<Movie> movies){
        return showsService.addMovies(movies);
    }

    @PostMapping("/addTheatres")
    public List<Theatre> addTheatres(@RequestBody List<Theatre> theatres){
        return showsService.addTheatres(theatres);
    }

    @PostMapping("/addShows")
    public List<Show> addShows(@RequestBody List<Show> shows){
        return showsService.addShows(shows);
    }

    @PostMapping("/editShow")
    public Show editShow(@RequestBody Show show){
        return showsService.editShow(show);
    }

    @GetMapping("/searchShows")
    public List<Show> searchShows(@RequestParam String movieName){
        return showsService.searchShows(movieName);
    }
}
