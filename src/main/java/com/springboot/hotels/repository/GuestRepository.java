package com.springboot.hotels.repository;
 
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.springboot.hotels.entity.Guest;
import com.springboot.hotels.entity.Hotel;
 
public interface GuestRepository extends JpaRepository<Guest, Integer> {

	@Query(value = "SELECT * FROM guest WHERE id = ?1", nativeQuery = true)
	Guest findGuestById(int id);
	
	
	Hotel findHotelById(int id);
	
	List<List<Object>> findReservationsById(int id);
}