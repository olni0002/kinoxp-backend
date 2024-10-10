package com.example.kinoxp.controller;

import java.util.List;
import java.util.Optional;

import com.example.kinoxp.service.ApiServiceGetMovie;
import com.example.kinoxp.service.ApiServiceGetMovieImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.kinoxp.model.Movie;
import com.example.kinoxp.repository.MovieRepository;

@RestController
@RequestMapping("/api/movie")
@CrossOrigin("*")
public class MovieRestController {

    @Autowired
    private ApiServiceGetMovieImpl apiServiceGetMovie;
    private MovieRepository movieRepository;

    public MovieRestController(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }
    
    @GetMapping
    public List<Movie> getAllMovies() {
        return movieRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Movie> getMovieById(@PathVariable int id) {
        return movieRepository.findById(id);
    }

    @PostMapping
    public void createMovie(@RequestBody Movie movie) {
        movieRepository.save(movie);
    }

    @PutMapping("/{id}")
    public void updateMovie(@RequestBody Movie movie, @PathVariable int id) {
        movie.setId(id);
        movieRepository.save(movie);
    }

    @DeleteMapping("/{id}")
    public void deleteMovie(@PathVariable int id) {
        movieRepository.deleteById(id);
    }
}