package com.example.kinoxp.service;

import com.example.kinoxp.model.Theater;
import com.example.kinoxp.repository.TheaterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApiServiceGetTheaterImpl implements ApiServiceGetTheater{

    @Autowired
    TheaterRepository theaterRepository;

    @Override
    public List<Theater> getTheater() {
        return theaterRepository.findAll();
    }
}
