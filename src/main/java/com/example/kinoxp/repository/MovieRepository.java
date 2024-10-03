package com.example.kinoxp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.kinoxp.model.Movie;

import java.util.List;

public interface MovieRepository extends JpaRepository<Movie, Integer> {
}