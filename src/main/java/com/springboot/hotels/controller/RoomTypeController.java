package com.springboot.hotels.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.hotels.entity.Reservation;
import com.springboot.hotels.entity.Room;
import com.springboot.hotels.entity.RoomType;
import com.springboot.hotels.repository.ReservationRepository;
import com.springboot.hotels.repository.RoomRepository;
import com.springboot.hotels.repository.RoomTypeRepository;

import java.util.List;

@RestController
@RequestMapping(value = "/roomType")
public class RoomTypeController {
    @Autowired
    private RoomTypeRepository roomTypeRepo;
    @GetMapping
    public List<RoomType> listAll() {
        List<RoomType> roomsTypes = roomTypeRepo.findAll();
        return roomsTypes;
    }
       
}
