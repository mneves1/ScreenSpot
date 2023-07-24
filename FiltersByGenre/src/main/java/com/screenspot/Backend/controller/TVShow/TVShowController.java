package com.screenspot.Backend.controller.TVShow;

import com.screenspot.Backend.entiry.TVShow.TVShow;
import com.screenspot.Backend.service.TVShow.TVShowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TVShowController {
    @Autowired
    private TVShowService tvShowService;

    @PutMapping("/tvshows")
    public TVShow addTVShow(@RequestBody TVShow tvShow) {
        return tvShowService.saveTVShow(tvShow);
    }

    @GetMapping("/tvshows/genre/{genre}")
    public List<TVShow> findTVShowsByGenre(@PathVariable String genre) {
        return tvShowService.getTVShowByGenre(genre);
    }

    @GetMapping("/tvshows/title/{title}")
    public List<TVShow> findTVShowsByTitle(@PathVariable String title) {
        return tvShowService.getTVShowByTitle(title);
    }
}