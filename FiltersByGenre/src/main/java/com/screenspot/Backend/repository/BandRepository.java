package com.screenspot.Backend.repository;

import com.screenspot.Backend.entiry.Band;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BandRepository extends JpaRepository<Band, Integer> {
    List<Band> findByGenre(String genre);
    List<Band> findByName(String name);
}

