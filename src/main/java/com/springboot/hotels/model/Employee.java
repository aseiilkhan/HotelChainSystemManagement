package com.springboot.hotels.model;
import java.sql.Date;
import java.util.List;

public class Employee{
	private String name;
	private String surname;
	private List<List<Date>> workTime;
	
	public Employee(String name, String surname, List<List<Date>> workTime){
		this.name = name;
		this.surname = surname;
		this.workTime = workTime;
	}
	
	public String getName() {
		return name;
	}
	
	public String getSurname() {
		return surname;
	}
	
	public List<List<Date>> getWorkTime(){
		return workTime;
	}
}