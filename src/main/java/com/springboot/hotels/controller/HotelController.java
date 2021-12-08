package com.springboot.hotels.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.hotels.entity.*;
import com.springboot.hotels.model.HotelModel;
import com.springboot.hotels.repository.EmployeeRepository;
import com.springboot.hotels.repository.HotelRepository;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/hotel")
public class HotelController {
    @Autowired
    private HotelRepository hotelRepo;
    
    private HotelModel getHotelModel(int id) {
    	Hotel h = hotelRepo.findHotelById(id);
    	List<Employee> employees= getEmployees(id);
    	List<RoomType> roomTypes= getRoomTypes(id);
    	List<String> numbers= getNumbers(id);
    	List<Room> rooms= getRooms(id);
    	HotelModel hm = new HotelModel(h.getId(), h.getName(),h.getAddress(), h.getCountry(), numbers, roomTypes, rooms, employees);
    	return hm;
    }
    @GetMapping("/{id}/employees")
    private List<Employee> getEmployees(@PathVariable int id){
    	List<List<Object>> objects = hotelRepo.findEmployeesById(id);
    	List<Employee> employees = new ArrayList<Employee>();
    	for(List<Object> x: objects) {
    		Employee e = new Employee(x.get(0), x.get(1), x.get(2), x.get(3), x.get(4));
    		employees.add(e);
    	}
    	return employees;
    }
    
    @GetMapping("/{id}/roomTypes")
    private List<RoomType> getRoomTypes(@PathVariable int id){
    	List<List<Object>> objects = hotelRepo.findRoomTypes(id);
    	List<RoomType> rts = new ArrayList<RoomType>();
    	for(List<Object> x: objects) {
    		RoomType rt = new RoomType(x.get(0), x.get(1), x.get(2), x.get(3));
    		rts.add(rt);
    	}
    	return rts;
    }
    
    @GetMapping("{id}/numbers")
    private List<String> getNumbers(@PathVariable int id){
    	return hotelRepo.findNumbers(id);
    }
    
    @GetMapping("{id}/rooms")
    private List<Room> getRooms(@PathVariable int id){
    	List<List<Object>> objects = hotelRepo.findRooms(id);
    	List<Room> rooms = new ArrayList<Room>();
    	for(List<Object> x: objects) {
    		Room r = new Room(x.get(0), x.get(1), x.get(2));
    		rooms.add(r);
    	}
    	return rooms;
    }
    @GetMapping("/{id}")
    private HotelModel getHotel(@PathVariable int id) {
    	HotelModel hm = getHotelModel(id);
    	return hm;
    }
    @GetMapping
    public List<HotelModel> listAll() {
        List<Hotel> hotels = hotelRepo.findAll();
        List<HotelModel> hm = new ArrayList<HotelModel>();
        for(Hotel x: hotels) {
        	hm.add(getHotelModel(x.getId()));
        }
        return hm;
    }
    
}