package com.screenspot.Backend.repository;

import com.screenspot.Backend.entiry.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MovieRepository extends JpaRepository<Movie, Integer> {
    List<Movie> findByGenre(String genre);
}

