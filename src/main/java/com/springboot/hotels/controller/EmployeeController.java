package com.springboot.hotels.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.hotels.entity.Employee;
import com.springboot.hotels.repository.EmployeeRepository;
import java.util.List;

@RestController
@RequestMapping(value = "/employee")
public class EmployeeController {
    @Autowired
    private EmployeeRepository employeeRepo;
    @GetMapping
    public List<Employee> listAll() {
        List<Employee> listEmployees = employeeRepo.findAll();
           
        return listEmployees;
    }
    
    @GetMapping("/byHotel/{id}")
    public List<Employee> a(@PathVariable int id){
    	return employeeRepo.employeesById(id);
    }
       
}