package com.example.kinoxp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.kinoxp.model.Showing;

import java.util.List;

public interface ShowingRepository extends JpaRepository<Showing, Integer> {
    //List<Showing> getShowingsByMovieId(Integer movieId);
}