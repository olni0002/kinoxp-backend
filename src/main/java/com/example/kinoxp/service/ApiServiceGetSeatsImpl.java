package com.example.kinoxp.service;


import com.example.kinoxp.model.Seat;
import com.example.kinoxp.repository.SeatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApiServiceGetSeatsImpl implements ApiServiceGetSeats{


    @Autowired
    SeatRepository seatRepository;

    @Override
    public List<Seat> getSeats() {
        return seatRepository.findAll();
    }

    @Override
    public List<Seat> getShowingbyTheaterId(Integer theaterId) {
        return seatRepository.getShowingsByTheaterId(theaterId);
    }
}
