package com.springboot.hotels.repository;
 
import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.hotels.entity.RoomType;
import com.springboot.hotels.entity.RoomTypeId;
 
public interface RoomTypeRepository extends JpaRepository<RoomType, RoomTypeId> {

}