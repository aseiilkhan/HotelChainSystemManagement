package com.springboot.hotels.model;
import java.util.*;
public class Bill{
	private Hotel hotel;
	private RoomType roomType;
	private Date checkIn;
	private Date checkOut;
	
	public Bill(Hotel hotel, RoomType roomType, Date checkIn, Date checkOut) {
		this.hotel = hotel;
		this.roomType = roomType;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}
	
	public Hotel getHotel() {
		return hotel;
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