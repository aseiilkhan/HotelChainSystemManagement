package com.springboot.hotels;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {

	@GetMapping("/a")
	public HotelModel hello() {
		return new HotelModel(1, "a", "b", new String[] {"a","b"});
	}

}
