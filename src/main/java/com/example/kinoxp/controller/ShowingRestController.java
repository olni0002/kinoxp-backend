package com.example.kinoxp.controller;

import com.example.kinoxp.model.Showing;
import com.example.kinoxp.repository.ShowingRepository;
import com.example.kinoxp.service.ApiServiceGetShowings;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin("*")
public class ShowingRestController {

    private ApiServiceGetShowings apiServiceGetShowings;
    private ShowingRepository showingRepository;

    public ShowingRestController(ApiServiceGetShowings apiServiceGetShowings, ShowingRepository showingRepository) {
        this.apiServiceGetShowings = apiServiceGetShowings;
        this.showingRepository = showingRepository;
    }

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

    @PostMapping("/api/showing")
    public void createShowing(@RequestBody Showing showing) {
        showingRepository.save(showing);
    }

    @DeleteMapping("/api/showing/{id}")
    public void deleteShowing(@PathVariable int id) {
        showingRepository.deleteById(id);
    }
}
