package com.springboot.hotels.model;
public class RoomTypeModel{
	private int size;
	private int capacity;
	private int hotelId;
	RoomTypeModel(int size, int capacity, int hotelId){
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