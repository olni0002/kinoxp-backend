package com.example.kinoxp.controller;

import com.example.kinoxp.model.Movie;
import com.example.kinoxp.service.ApiServiceGetMovie;
import com.example.kinoxp.service.ApiServiceGetMovieImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin("*")
public class MVR {

    @Autowired
    ApiServiceGetMovie apiServiceGetMovie;

    @GetMapping("/movies")
    public List<Movie> getMovies(){
        return apiServiceGetMovie.getMovie();
    }

}
