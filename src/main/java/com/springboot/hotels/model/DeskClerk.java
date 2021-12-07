package com.springboot.hotels.model;

public class DeskClerk{
	private String identificationType;
	private int id;
	private String address;
	private String homeNumber;
	private String mobileNumber;	
	private int hotelId;
	
	public DeskClerk(String identificationType, int id,
			String address, String homeNumber, String mobileNumber, int hotelId) {
		this.identificationType = identificationType;
		this.id = id;
		this.address = address;
		this.homeNumber = homeNumber;
		this.mobileNumber = mobileNumber;
		this.hotelId = hotelId;
	}
	
	public String getIdentificationType() {
		return identificationType;
	}
	
	public int getId() {
		return id;
	}
	
	public String getAddress() {
		return address;
	}
	
	public String getMobileNumber() {
		return mobileNumber;
	}
	
	public String getHomeNumber() {
		return homeNumber;
	}
	
	public int getHotelId() {
		return hotelId;
	}
}