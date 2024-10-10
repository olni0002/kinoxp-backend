package com.example.kinoxp.service;

import com.example.kinoxp.model.Showing;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ApiServiceGetShowings {
    List<Showing> getShowingbyMovieId(Integer movieId);
    List<Showing> getShowing();

    Showing getShowingById(Integer id);
}
