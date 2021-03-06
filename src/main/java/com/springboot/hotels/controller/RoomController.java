package com.springboot.hotels.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.hotels.entity.Reservation;
import com.springboot.hotels.entity.Room;
import com.springboot.hotels.repository.ReservationRepository;
import com.springboot.hotels.repository.RoomRepository;

import java.util.List;

@RestController
@RequestMapping(value = "/room")
public class RoomController {
    @Autowired
    private RoomRepository roomRepo;
    @GetMapping
    public List<Room> listAll() {
        List<Room> rooms = roomRepo.findAll();
        return rooms;
    }
       
}
