package com.springboot.hotels.repository;
 
import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.hotels.entity.Room;
import com.springboot.hotels.entity.RoomId;
 
public interface RoomRepository extends JpaRepository<Room, Integer> {

}