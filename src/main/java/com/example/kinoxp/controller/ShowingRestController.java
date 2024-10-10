package com.example.kinoxp.controller;

import com.example.kinoxp.model.Showing;
import com.example.kinoxp.service.ApiServiceGetShowings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin("*")
public class ShowingRestController {

    @Autowired
    ApiServiceGetShowings apiServiceGetShowings;


    @GetMapping("/showing/{movieId}")
    public List<Showing> getShowingsByMovieId(@PathVariable Integer movieId) {
        return apiServiceGetShowings.getShowingbyMovieId(movieId);
    }
    @GetMapping("/showings/{id}")
    public Showing getShowingById(@PathVariable Integer id) {
        return apiServiceGetShowings.getShowingById(id);
    }

    @GetMapping("/showingall")
    public List<Showing> getShowing() {
        return apiServiceGetShowings.getShowing();
    }

}
