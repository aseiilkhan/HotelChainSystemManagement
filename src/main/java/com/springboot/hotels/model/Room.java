package com.springboot.hotels.model;
import java.util.*;
public class Room{
	private int roomNumber;
	private int floor;
	private RoomType roomType;
	private List<Integer> priceList;
	private int hotelId;
	Room(int roomNumber, int floor, RoomType roomType, List<Integer> priceList, int hotelId){
		this.floor = floor;
		this.roomNumber = roomNumber;
		this.roomType = roomType;
		this.priceList = priceList;
		this.hotelId = hotelId;
	}
	
	public int getFloor() {
		return floor;
	}
	
	public int getRoomNumber() {
		return roomNumber;
	}
	
	public RoomType getRoomType() {
		return roomType;
	}
	
	public int getHotelId() {
		return hotelId;
	}
}
