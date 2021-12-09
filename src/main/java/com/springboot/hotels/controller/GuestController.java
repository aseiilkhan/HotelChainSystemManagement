package com.springboot.hotels.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.hotels.entity.Guest;
import com.springboot.hotels.repository.GuestRepository;

import java.util.List;

@RestController
@RequestMapping(value = "/guests")
public class GuestController {
    @Autowired
    private GuestRepository guestRepo;
    @GetMapping
    public List<Guest> listAll() {
        List<Guest> listGuests = guestRepo.findAll();
           
        return listGuests;
    }
       
}