package com.example.kinoxp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.kinoxp.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}