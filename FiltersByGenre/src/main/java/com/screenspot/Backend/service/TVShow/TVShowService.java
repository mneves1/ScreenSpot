package com.screenspot.Backend.service.TVShow;

import com.screenspot.Backend.entiry.TVShow.TVShow;
import com.screenspot.Backend.repository.TVShow.TVShowRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TVShowService {
    @Autowired
    private TVShowRepository tvShowRepository;

    public TVShow saveTVShow(TVShow tvShow) {
        return tvShowRepository.save(tvShow);
    }

    public List<TVShow> getTVShowByGenre(String genre) {
        return tvShowRepository.findByGenre(genre);
    }

    public List<TVShow> getTVShowByTitle(String title) {
        return tvShowRepository.findByTitle(title);
    }
}