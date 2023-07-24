package com.screenspot.Backend.controller.Ratings;

import com.screenspot.Backend.entiry.Ratings.Ratings;
import com.screenspot.Backend.service.Ratings.RatingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ratings")
public class RatingsController {

    @Autowired
    private RatingsService ratingsService;

    @PutMapping("/ratings/{id}")
    public Ratings createRating(@PathVariable int id, @RequestBody Ratings rating) {
        rating.setId(id); // set the rating id from path variable
        return ratingsService.createRating(rating);
    }

    @GetMapping("/{id}")
    public Ratings getRatings(@PathVariable int id) {
        return ratingsService.getRatings(id);
    }

}
