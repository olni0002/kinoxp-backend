package com.example.kinoxp.service;

import com.example.kinoxp.model.Seat;
import com.example.kinoxp.model.Showing;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ApiServiceGetSeats {
     List<Seat> getSeats();
     List<Seat> getShowingbyTheaterId(Integer theaterId);
}
