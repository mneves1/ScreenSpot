package com.screenspot.Backend.controller;

import com.screenspot.Backend.entiry.Movie;
import com.screenspot.Backend.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movies")
public class MovieController {

    private final MovieService service;

    @Autowired
    public MovieController(MovieService service) {
        this.service = service;
    }

    @PutMapping
    public ResponseEntity<Movie> addMovie(@RequestBody Movie movie) {
        Movie savedMovie = service.save(movie);
        return new ResponseEntity<>(savedMovie, HttpStatus.CREATED);
    }

    @GetMapping("/{genre}")
    public ResponseEntity<List<Movie>> getMoviesByGenre(@PathVariable String genre) {
        List<Movie> movies = service.findByGenre(genre);
        return new ResponseEntity<>(movies, HttpStatus.OK);
    }


}

