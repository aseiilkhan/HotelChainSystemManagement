package com.springboot.hotels.entity;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "room")
@IdClass(RoomId.class)
public class Room implements Serializable{
	@Id
	private int hotelRoomTypeId;
	@Id
	private int roomNumber;
	private int floorNumber;
	
	public Room() {};
	
	public Room(int h, int r, int f) {
		hotelRoomTypeId = h;
		roomNumber = r;
		floorNumber = f;
	}
	
	public Room(Object a,Object b,Object c) {
		hotelRoomTypeId = (int)a;
		roomNumber = (int)b;
		floorNumber = (int)c;
	}
	
	public int getHotelRoomTypeId() {
		return hotelRoomTypeId;
	}
	
	public int getRoomNumber() {
		return roomNumber;
	}
	
	public int getFloorNumber() {
		return floorNumber;
	}
}