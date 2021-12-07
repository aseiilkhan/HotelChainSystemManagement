package com.springboot.hotels.model;
import java.util.List;

public class Guest{
	private String identificationType;
	private int id;
	private String address;
	private String homeNumber;
	private String mobileNumber;	
	private List<Reservation> reservations;
	private List<Reservation> ocuppaying;
	private List<Bill> bills;
	
}