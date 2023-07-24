package com.screenspot.Backend.service.Ratings;

import com.screenspot.Backend.entiry.Ratings.Ratings;
import com.screenspot.Backend.entiry.user.User;
import com.screenspot.Backend.repository.Ratings.RatingsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RatingsService {
    @Autowired
    private RatingsRepository ratingsRepository;

    public Ratings createRating(Ratings ratings) {
        return ratingsRepository.save(ratings);
    }

    public Ratings getRatings(int id) {
        Optional<Ratings> ratings = ratingsRepository.findById(id);
        return ratings.orElseThrow(() -> new RuntimeException("Rating not found"));
    }
}
