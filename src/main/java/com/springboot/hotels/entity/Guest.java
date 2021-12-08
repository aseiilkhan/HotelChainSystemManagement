package com.springboot.hotels.entity;
import java.util.List;

import javax.persistence.*;
@Entity
@Table(name = "guest")
public class Guest{
	@Id
	private int id;
	private String id_type;
	private int id_number;
	private String address;
	private String home_number;
	private String mobile_number;	

	public Guest() {};
	
	public Guest(int id, String id_type, int id_number, String address, String home_number, String mobile_number) {
		this.id = id;
		this.id_type = id_type;
		this.id_number = id_number;
		this.address = address;
		this.home_number = home_number;
		this.mobile_number = mobile_number;
	}
	
	public int getId() {
		return id;
	}
	
	public String getId_type() {
		return id_type;
	}
	
	public int getId_number() {
		return id_number;
	}
	
	public String getAddress() {
		return address;
	}
	
	public String getHome_number() {
		return home_number;
	}
	
	public String getMobile_number() {
		return mobile_number;
	}
}