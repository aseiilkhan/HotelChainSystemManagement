package com.springboot.hotels;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.hotels.model.Hotel;

import java.util.ArrayList;
import java.util.List;

@RestController
public class WebController {

	@GetMapping("/a")
	public List<Integer> hello() {
		List<Integer> x = new ArrayList<Integer>();
		x.add(2);
		x.add(1);
		return x;
	}
	
	@GetMapping("/hotels")
	public List<Hotel> getHotelsList(){
		List<Hotel> x = new ArrayList<Hotel>();
		return x;
	}
	
	
}
