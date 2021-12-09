package com.springboot.hotels.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.hotels.entity.Guest;
import com.springboot.hotels.entity.Hotel;
import com.springboot.hotels.entity.Reservation;
import com.springboot.hotels.entity.RoomType;
import com.springboot.hotels.model.ReservationModel;
import com.springboot.hotels.repository.GuestRepository;
import com.springboot.hotels.repository.HotelRepository;
import com.springboot.hotels.repository.RoomTypeRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

@RestController
@RequestMapping(value = "/guest")
public class GuestController {
    @Autowired
    private GuestRepository guestRepo;
    @Autowired
    private HotelRepository hotelRepo;
    @Autowired
    private RoomTypeRepository roomTypeRepo;
    @GetMapping
    public List<Guest> listAll() {
        List<Guest> listGuests = guestRepo.findAll();
           
        return listGuests;
    }
    
    @PostMapping("/add")
    public Guest addUser(@RequestBody Guest g) {
    	guestRepo.save(g);
    	return g;
    }
    
    @GetMapping("{id}") Guest findGuestById(@PathVariable int id) {
    	return guestRepo.findGuestById(id);
    }
    
    public Hotel getHotelById(@PathVariable int id) {
    	return hotelRepo.findHotelById(id);
    }
    
    public RoomType getRoomTypeById(@PathVariable int id) {
    	return roomTypeRepo.findRoomTypeById(id);
    }
    
    @GetMapping("{id}/reservations") List<ReservationModel> findReservationsById(@PathVariable int id){
    	List<List<Object>> objects= guestRepo.findReservationsById(id);
    	List<ReservationModel> x = new ArrayList<ReservationModel>();
    	for(List<Object> a: objects) {
    		Hotel h = getHotelById((int)a.get(4));
    		RoomType rt = getRoomTypeById((int)a.get(5));
    		x.add(new ReservationModel(a.get(0), a.get(1), a.get(2), a.get(3),  h, rt));
    	}
    	
    	return x;
    }
}