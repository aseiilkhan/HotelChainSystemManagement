package com.springboot.hotels.model;
import java.util.*;

import com.springboot.hotels.entity.Hotel;
public class Bill{
	private Date checkIn;
	private Date checkOut;
	
	public Bill(Date checkIn, Date checkOut) {
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}
	
	public Date getCheckIn() {
		return checkIn;
	}
	
	public Date getCheckOut() {
		return checkOut;
	}
}