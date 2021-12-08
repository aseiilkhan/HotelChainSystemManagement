package com.springboot.hotels.repository;
 
import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.hotels.entity.Hotel;
import com.springboot.hotels.entity.Reservation;
 
public interface ReservationRepository extends JpaRepository<Reservation, Integer> {

}