package com.springboot.hotels.model;
import java.util.*;
public class Hotel {
	private int id;
	private String name;
	private String address;
	private List<String> numbers;
	private List<RoomType> roomTypes; 
	private List<Room> rooms;
	private List<Employee> employees;
	private Manager manager;
	private DeskClerk deskClerk;
	public Hotel(int id, String name, String address, List<String> numbers, List<RoomType> roomTypes, List<Room> rooms, List<Employee> employees) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.numbers = numbers;
		this.roomTypes = roomTypes;
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
	
	public List<String> getNumbers() {
		return numbers;
	}
	
	public List<RoomType> getRoomTypes() {
		return roomTypes;
	}
	
	public List<Room> getRooms() {
		return rooms;
	}
	
	public DeskClerk getDeskClerk() {
		return deskClerk;
	}
	
	public Manager getManager() {
		return manager;
	}
	
	public List<Employee> getEmployees(){
		return employees;
	}
}