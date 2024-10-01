package com.example.kinoxp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.kinoxp.model.Seat;

public interface SeatRepository extends JpaRepository<Seat, Integer> {
    
}