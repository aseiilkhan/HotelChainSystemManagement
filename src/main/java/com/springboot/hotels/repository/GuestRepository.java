package com.springboot.hotels.repository;
 
import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.hotels.entity.Guest;
 
public interface GuestRepository extends JpaRepository<Guest, Integer> {

}