package com.screenspot.Backend.controller;

import com.screenspot.Backend.entiry.Band;
import com.screenspot.Backend.service.BandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bands")
public class BandController {

    private final BandService service;

    @Autowired
    public BandController(BandService service) {
        this.service = service;
    }

    @PutMapping
    public ResponseEntity<Band> addBand(@RequestBody Band band) {
        Band savedBand = service.save(band);
        return new ResponseEntity<>(savedBand, HttpStatus.CREATED);
    }

    @GetMapping("/genre/{genre}")
    public ResponseEntity<List<Band>> getBandsByGenre(@PathVariable String genre) {
        List<Band> bands = service.findByGenre(genre);
        return new ResponseEntity<>(bands, HttpStatus.OK);
    }

    @GetMapping("/name/{name}")
    public ResponseEntity<List<Band>> getBandsByName(@PathVariable String name) {
        List<Band> bands = service.findByName(name);
        return new ResponseEntity<>(bands, HttpStatus.OK);
    }
}
