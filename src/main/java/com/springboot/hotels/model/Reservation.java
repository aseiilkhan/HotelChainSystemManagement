package com.springboot.hotels.model;

import java.sql.Date;

public class Reservation{
	private int id;
	private int guestId;
	private int hotelId;
	private RoomType roomType;
	private Date checkIn;
	private Date checkOut;
	
	public Reservation(int id, int gi, int hi, RoomType rt, Date ci, Date co) {
		this.id = id;
		guestId = gi;
		hotelId = hi;
		roomType = rt;
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
	
	public RoomType getRoomType() {
		return roomType;
	}
	
	public Date getCheckIn() {
		return checkIn;
	}
	
	public Date getCheckOut() {
		return checkOut;
	}
	
}