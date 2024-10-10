package com.example.kinoxp.controller;

import com.example.kinoxp.model.Seat;
import com.example.kinoxp.service.ApiServiceGetSeats;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin("*")
public class SeatRestController {

    @Autowired
    ApiServiceGetSeats apiServiceGetSeats;

    @GetMapping("/seats")
    public List<Seat> getSeats(){
        return apiServiceGetSeats.getSeats();
    }
    @GetMapping("/seats/{theaterId}")
    public List<Seat> getSeatsByTheater(@PathVariable Integer theaterId){
        return apiServiceGetSeats.getShowingbyTheaterId(theaterId);
    }



}
