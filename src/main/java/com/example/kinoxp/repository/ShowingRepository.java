package com.example.kinoxp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.kinoxp.model.Showing;

public interface ShowingRepository extends JpaRepository<Showing, Integer> {
    
}