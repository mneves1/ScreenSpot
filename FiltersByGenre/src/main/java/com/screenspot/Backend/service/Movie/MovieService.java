package com.screenspot.Backend.service.Movie;

import com.screenspot.Backend.entiry.Movie.Movie;
import com.screenspot.Backend.repository.Movie.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
