package com.springboot.hotels.repository;
 
import java.util.List;
import java.util.Map;
import java.sql.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.springboot.hotels.controller.*;
import com.springboot.hotels.entity.*;


public interface HotelRepository extends JpaRepository<Hotel, Integer> {
	@Query(value = "SELECT * FROM hotel WHERE id = ?1", nativeQuery = true)
	Hotel findHotelById(int id);
	
	List<List<Object>> findEmployeesById(int id);
	
	List<List<Object>> findRoomTypes(int id);
	
	List<String> findNumbers(int id);
	
	List<List<Object>> findRooms(int id);
	
	@Query(value = "Select hotel_has_number.number from hotel_has_number inner join (select * from hotel where id = ?1) as x on x.id = hotel_has_number.hotel_id", nativeQuery = true)
	List<String> findNumbersById(int id);
	
	

}