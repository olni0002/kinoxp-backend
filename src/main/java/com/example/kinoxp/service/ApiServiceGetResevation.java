package com.example.kinoxp.service;

import com.example.kinoxp.model.Reservation;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface ApiServiceGetResevation {
    List<Reservation> getAllReservation();
    Reservation createReservation(Reservation reservation);

    List<Reservation> getReservationsByShowingId(Integer showingId);


}
