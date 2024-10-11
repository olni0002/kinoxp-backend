package com.example.kinoxp.controller;

import com.example.kinoxp.model.Reservation;
import com.example.kinoxp.service.ApiServiceGetResevation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")

public class ResevationRestController {
    @Autowired
    private ApiServiceGetResevation apiServiceGetResevation;

    @PostMapping("/reservations")
    public Reservation createReservation(@RequestBody Reservation reservation) {
        Reservation createdReservation = apiServiceGetResevation.createReservation(reservation);
        return createdReservation;
    }

    @GetMapping("/resevation")
    public List<Reservation> getAllReservations() {
        List<Reservation> reservations = apiServiceGetResevation.getAllReservation();
        return reservations;
    }

    @GetMapping("/resevation/{showingId}")
    public List<Reservation> getReservationsByShowingId(@PathVariable Integer showingId) {
        return apiServiceGetResevation.getReservationsByShowingId(showingId);
    }

}
