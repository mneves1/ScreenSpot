package com.screenspot.Backend.repository.Ratings;

import com.screenspot.Backend.entiry.Ratings.Ratings;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RatingsRepository extends JpaRepository<Ratings, Integer> {

}
