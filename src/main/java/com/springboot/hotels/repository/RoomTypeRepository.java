package com.springboot.hotels.repository;
 
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.springboot.hotels.entity.Guest;
import com.springboot.hotels.entity.RoomType;
import com.springboot.hotels.entity.RoomTypeId;
 
public interface RoomTypeRepository extends JpaRepository<RoomType, RoomTypeId> {

	@Query(value = "SELECT * FROM room_type WHERE id = ?1", nativeQuery = true)
	RoomType findRoomTypeById(int id);
}