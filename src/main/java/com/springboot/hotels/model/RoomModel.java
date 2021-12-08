package com.springboot.hotels.model;
import java.util.*;
public class RoomModel{
	private int roomNumber;
	private int floor;
	private List<Integer> priceList;
	private int hotelId;
	RoomModel(int roomNumber, int floor, List<Integer> priceList, int hotelId){
		this.floor = floor;
		this.roomNumber = roomNumber;
		this.priceList = priceList;
		this.hotelId = hotelId;
	}
	
	public int getFloor() {
		return floor;
	}
	
	public int getRoomNumber() {
		return roomNumber;
	}
	
	public int getHotelId() {
		return hotelId;
	}
}
