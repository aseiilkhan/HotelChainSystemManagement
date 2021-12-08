package com.springboot.hotels.entity;

import java.sql.Date;

import javax.persistence.*;
@Entity
@Table(name = "reservation")
public class Reservation{
	@Id
	private int id;
	private int guestId;
	private int hotelId;
	private Date checkIn;
	private Date checkOut;
	private String roomType;
	public Reservation() {};
	public Reservation (int id, int gi, int hi, Date ci, Date co, String rt) {
		this.id = id;
		guestId = gi;
		hotelId = hi;
		checkIn = ci;
		checkOut = co;
		roomType = rt;
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
	
	public String getRoomType() {
		return roomType;
	}
	
}