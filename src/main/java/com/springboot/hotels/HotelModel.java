package com.springboot.hotels;

public class HotelModel {
	private int id;
	private String name;
	private String address;
	private String[] numbers;
	public HotelModel(int id, String name, String address, String[] numbers) {
		this.id = id;
		this.name = name;
		this.address=  address;
		this.numbers = numbers;
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
	
	public String[] getNumbers() {
		return numbers;
	}
	
}