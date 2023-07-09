package com.screenspot.moviesbygenre.service;

import com.screenspot.moviesbygenre.entiry.Movie;
import com.screenspot.moviesbygenre.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {

    private final MovieRepository repository;

    @Autowired
    public MovieService(MovieRepository repository) {
        this.repository = repository;
    }

    public Movie save(Movie movie) {
        return repository.save(movie);
    }

    public List<Movie> findByGenre(String genre) {
        return repository.findByGenre(genre);
    }



}
