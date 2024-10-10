package com.example.kinoxp.service;

import com.example.kinoxp.model.Theater;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ApiServiceGetTheater {
    List<Theater> getTheater();
}
