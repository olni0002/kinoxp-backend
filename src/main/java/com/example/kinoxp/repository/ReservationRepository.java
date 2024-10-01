package com.example.kinoxp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.kinoxp.model.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Integer> {
    
}