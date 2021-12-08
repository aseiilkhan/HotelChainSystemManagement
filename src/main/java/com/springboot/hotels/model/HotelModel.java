package com.springboot.hotels.model;
import java.util.*;

import com.springboot.hotels.entity.Employee;
import com.springboot.hotels.entity.Room;
import com.springboot.hotels.entity.RoomType;
public class HotelModel {
	private int id;
	private String name	;
	private String address;
	private String country;
	private List<Employee> employees;
	private List<Room> rooms;
	private List<RoomType> roomTypes;
	private List<String> numbers;
	public HotelModel(int id, String name, String address, String country, List<String> numbers, List<RoomType> roomTypes, List<Room> rooms, List<Employee> employees) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.country = country;
		this.employees = employees;
		this.numbers = numbers;
		this.roomTypes= roomTypes;
		this.rooms = rooms;
	}
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	
	public String getAddress() {
		return address;
	}
	
	public String getCountry() {
		return country;
	}
	
	public List<Employee> getEmployees(){
		return employees;
	}
	
	public List<Room> getRooms(){
		return rooms;
	}
	
	public List<RoomType> getRoomTypes(){
		return roomTypes;
	}
	
	public List<String> getNumbers(){
		return numbers;
	}
}