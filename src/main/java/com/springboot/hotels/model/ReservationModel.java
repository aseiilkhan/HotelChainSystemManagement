package com.springboot.hotels.model;

import java.sql.Date;

import com.springboot.hotels.entity.Hotel;
import com.springboot.hotels.entity.RoomType;

public class ReservationModel{
	private int id;
	private int guestId;
	private Date checkIn;
	private Date checkOut;
	private Hotel hotel;
	private RoomType roomType;
	
	public ReservationModel(int id, int gi, Date ci, Date co, Hotel h, RoomType roomType) {
		this.id = id;
		guestId = gi;
		checkIn = ci;
		checkOut = co;
		hotel = h;
		this.roomType = roomType;
	}
	
	public ReservationModel(Object a, Object b, Object d, Object e, Hotel h, RoomType rt) {
		id = (int)a;
		guestId = (int)b;
		checkIn = (Date)d;
		checkOut = (Date)e;
		hotel = h;
		roomType = rt;
	}
	public int getId() {
		return id;
	}
	
	public int getGuestId() {
		return guestId;
	}
	
	public Date getCheckIn() {
		return checkIn;
	}
	
	public Date getCheckOut() {
		return checkOut;
	}
	
	public Hotel getHotel() {
		return hotel;
	}
	
	public RoomType getRoomType() {
		return roomType;
	}
	
}