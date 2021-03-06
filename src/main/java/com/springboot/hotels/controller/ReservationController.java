package com.springboot.hotels.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.hotels.entity.Reservation;
import com.springboot.hotels.repository.ReservationRepository;

import java.util.List;

import javax.validation.Valid;

@RestController
@RequestMapping(value = "/reservation")
public class ReservationController {
    @Autowired
    private ReservationRepository reservationRepo;
    @GetMapping
    public List<Reservation> listAll() {
        List<Reservation> reservations = reservationRepo.findAll();
        return reservations;
    }
    
    @PostMapping("/add") Reservation insertReservation(@Valid @RequestBody Reservation x) {
    	reservationRepo.save(x);
    	return x;
    }
       
}
