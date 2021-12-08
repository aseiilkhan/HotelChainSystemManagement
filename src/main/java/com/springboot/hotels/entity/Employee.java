package com.springboot.hotels.entity;
import java.sql.Date;
import java.util.List;

import javax.persistence.*;
@Entity
@Table(name = "employee")
public class Employee{
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private int employee_id;
	private String name;
	private String surname;
	private int salary;
	private int hotel_id;
	
	public Employee() {}
	
	public Employee(int employee_id, String name, String surname, int salary, int hotel_id){
		this.employee_id = employee_id;
		this.name = name;
		this.surname = surname;
		this.salary = salary;
		this.hotel_id = hotel_id;
	}
	
	public Employee(Object a, Object b, Object c, Object d, Object e) {
		employee_id = (int)a;
		name = (String)b;
		surname = (String)c;
		salary = (int)d;
		hotel_id = (int)e;
	}
	
	public int getEmployee_id() {
		return employee_id;
	}
	
	public String getName() {
		return name;
	}
	
	public String getSurname() {
		return surname;
	}
	
	public int getSalary() {
		return salary;
	}
	
	public int getHotel_id() {
		return hotel_id;
	}
}