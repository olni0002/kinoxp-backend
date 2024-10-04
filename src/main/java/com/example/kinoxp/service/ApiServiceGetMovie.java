package com.example.kinoxp.service;

import com.example.kinoxp.model.Movie;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ApiServiceGetMovie {
    List<Movie> getMovie();
}
