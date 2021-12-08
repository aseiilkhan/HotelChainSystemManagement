package com.springboot.hotels.model;

import java.sql.Date;

public class ReservationModel{
	private int id;
	private int guestId;
	private int hotelId;
	private Date checkIn;
	private Date checkOut;
	
	public ReservationModel(int id, int gi, int hi, Date ci, Date co) {
		this.id = id;
		guestId = gi;
		hotelId = hi;
		checkIn = ci;
		checkOut = co;
	}
	
	public int getId() {
		return id;
	}
	
	public int getGuestId() {
		return guestId;
	}
	
	public int getHotelId() {
		return hotelId;
	}
	
	
	public Date getCheckIn() {
		return checkIn;
	}
	
	public Date getCheckOut() {
		return checkOut;
	}
	
}