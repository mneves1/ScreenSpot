package com.screenspot.Backend.entiry.Ratings;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.sql.Timestamp;


@Entity
@Table(name = "Ratings")
public class Ratings {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer id;
        @Column(name = "stars")
        private Integer stars;

        @Column(name = "user_id")
        private Integer user_id;

        @Column(name = "item_id")
        private Integer item_id;

        @Column(name = "rating")
        private BigDecimal rating;

        @Column(name = "created_at")
        private Timestamp created_at;

    public Integer getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getStars() {
        return stars;
    }

    public void setStars(Integer stars) {
        this.stars = stars;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public Integer getItem_id() {
        return item_id;
    }

    public void setItem_id(Integer item_id) {
        this.item_id = item_id;
    }

    public BigDecimal getRating() {
        return rating;
    }

    public void setRating(BigDecimal rating) {
        this.rating = rating;
    }

    public Timestamp getCreated_at() {
            return created_at;
        }
    public void setCreated_at(Timestamp created_at) {
            this.created_at = created_at;
        }
}
