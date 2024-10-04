package com.example.kinoxp.service;

import com.example.kinoxp.model.Movie;
import com.example.kinoxp.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApiServiceGetMovieImpl implements ApiServiceGetMovie{


    @Autowired
    MovieRepository movieRepository;
    @Override
    public List<Movie> getMovie() {
        return movieRepository.findAll();
    }
}
