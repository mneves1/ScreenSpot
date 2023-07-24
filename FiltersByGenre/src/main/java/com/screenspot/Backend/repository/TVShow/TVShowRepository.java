package com.screenspot.Backend.repository.TVShow;

import com.screenspot.Backend.entiry.TVShow.TVShow;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TVShowRepository extends JpaRepository<TVShow, Integer> {
    List<TVShow> findByGenre(String genre);
    List<TVShow> findByTitle(String title);
}