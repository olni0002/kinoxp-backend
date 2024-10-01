package com.example.kinoxp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.kinoxp.model.Theater;

public interface TheaterRepository extends JpaRepository<Theater, Integer> {
    
}