package com.springboot.hotels.entity;
import java.util.*;

import javax.persistence.*;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;
@Entity
@Table(name = "hotel")
@NamedNativeQueries({
	@NamedNativeQuery(name = "Hotel.findRoomTypes", query = "Select rt.id, rt.type_name, rt.capacity, rt.size from (Select * from hotel_has_room_type where hotel_id = ?1) a join room_type rt on rt.id = a.room_type_id"),
	@NamedNativeQuery(name = "Hotel.findEmployeesById", query = "Select e.employee_id, e.name, e.surname, e.salary, e.hotel_id from (Select * from hotel h where h.id = ?1) x join employee e on e.hotel_id = x.id"),
	@NamedNativeQuery(name = "Hotel.findNumbers", query = "Select hhn.number from hotel_has_number hhn where hhn.hotel_id = ?1"),
	@NamedNativeQuery(name = "Hotel.findRooms", query = "Select r.hotel_room_type_id, r.room_number, r.floor_number from (Select hhrt.id from hotel_has_room_type hhrt where hhrt.hotel_id = ?1) a join room r on r.hotel_room_type_id = a.id")
})
public class Hotel {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name	;
	private String address;
	private String country;
	public Hotel() {};
	public Hotel(int id, String name, String address, List<String> numbers) {
		this.id = id;
		this.name = name;
		this.address = address;
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
	
}