package com.springboot.hotels.repository;
 
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.springboot.hotels.entity.Employee;
import com.springboot.*;
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	@Query(value = "Select * from employee where hotel_id = ?1", nativeQuery = true)
	List<Employee> employeesById(int id);
}