package com.example.kinoxp.service;

import com.example.kinoxp.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ApiServiceGetUser {
    List<User> getUsers();
}
