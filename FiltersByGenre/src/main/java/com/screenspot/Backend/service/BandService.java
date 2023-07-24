package com.screenspot.Backend.service;

import com.screenspot.Backend.entiry.Band;
import com.screenspot.Backend.repository.BandRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BandService {

    private final BandRepository repository;

    @Autowired
    public BandService(BandRepository repository) {
        this.repository = repository;
    }

    public Band save(Band band) {
        return repository.save(band);
    }

    public List<Band> findByGenre(String genre) {
        return repository.findByGenre(genre);
    }

    public List<Band> findByName(String name) {
        return repository.findByName(name);
    }
}
