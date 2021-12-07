package com.springboot.hotels.model;
public class RoomType{
	private int size;
	private int capacity;
	private int hotelId;
	RoomType(int size, int capacity, int hotelId){
		this.size = size;
		this.capacity = capacity;
		this.hotelId = hotelId;
	}
	
	public int getSize() { return size;}
	public int getCapacity() { return capacity;}
	public int getHotelId() {
		return hotelId;
	}
}