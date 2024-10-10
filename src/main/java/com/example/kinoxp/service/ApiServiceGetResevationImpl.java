package com.example.kinoxp.service;

import com.example.kinoxp.model.Reservation;
import com.example.kinoxp.repository.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ApiServiceGetResevationImpl implements ApiServiceGetResevation{

    @Autowired
    ReservationRepository reservationRepository;

    @Override
    public List<Reservation> getAllReservation() {
        return reservationRepository.findAll();
    }

    @Override
    public Reservation createReservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    @Override
    public List<Reservation> getReservationsByShowingId(Integer showingId) {
        return reservationRepository.findByShowingId(showingId);
    }


}
