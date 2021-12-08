package com.springboot.hotels.model;
import java.util.List;

public class GuestModel{
	private String identificationType;
	private int id;
	private String address;
	private String homeNumber;
	private String mobileNumber;	
	private List<ReservationModel> reservations;
	private List<ReservationModel> ocuppaying;
	private List<Bill> bills;
	
}