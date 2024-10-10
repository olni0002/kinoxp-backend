package com.example.kinoxp.service;

import com.example.kinoxp.model.Showing;
import com.example.kinoxp.repository.ShowingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApiServiceGetShowingsImpl implements ApiServiceGetShowings{


    @Autowired
    private final ShowingRepository showingRepository;

    public ApiServiceGetShowingsImpl(ShowingRepository showingRepository) {
        this.showingRepository = showingRepository;
    }


    @Override
    public List<Showing> getShowingbyMovieId(Integer movieId) {
        return showingRepository.getShowingsByMovieId(movieId);
    }

    @Override
    public List<Showing> getShowing() {
        return showingRepository.findAll();
    }

    @Override
    public Showing getShowingById(Integer id) {
        return showingRepository.getShowingById(id);
    }
}
