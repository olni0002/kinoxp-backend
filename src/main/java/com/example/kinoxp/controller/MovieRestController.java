package com.example.kinoxp.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.kinoxp.model.Movie;
import com.example.kinoxp.repository.MovieRepository;

@RestController
public class MovieRestController {

    private MovieRepository movieRepository;

    public MovieRestController(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }
    
    @GetMapping("/api/movie")
    public List<Movie> getAllMovies() {
        return movieRepository.findAll();
    }

    @GetMapping("/api/movie/{id}")
    public Optional<Movie> getMovieById(@PathVariable int id) {
        return movieRepository.findById(id);
    }

    @PostMapping("/api/movie")
    public void createMovie(@RequestBody Movie movie) {
        movieRepository.save(movie);
    }

    @PutMapping("/api/movie/{id}")
    public void updateMovie(@RequestBody Movie movie, @PathVariable int id) {
        movie.setId(id);
        movieRepository.save(movie);
    }

    @DeleteMapping("/api/movie/{id}")
    public void deleteMovie(@PathVariable int id) {
        movieRepository.deleteById(id);
    }
}