package com.example.kinoxp.repository;

import com.example.kinoxp.model.Showing;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.kinoxp.model.Seat;

import java.util.List;

public interface SeatRepository extends JpaRepository<Seat, Integer> {
    List<Seat> getShowingsByTheaterId(Integer theaterId);
}