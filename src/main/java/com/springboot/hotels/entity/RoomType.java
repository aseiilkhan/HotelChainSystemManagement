package com.springboot.hotels.entity;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "room_type")
public class RoomType implements Serializable{
	@Id
	private int id;
	private String typeName;
	private int capacity;
	private int size;
	
	public RoomType() {};
	
	public RoomType(int c, String t, int s, int i) {
		id = i;
		typeName = t;
		size = s;
		capacity =c;
	}
	
	public RoomType(Object a, Object b, Object c, Object d) {
		id = (int)a;
		typeName = (String)b;
		capacity = (int)c;
		size = (int) d;
	}
	
	public int getCapacity() {
		return capacity;
	}
	
	public String getType() {
		return typeName;
	}
	
	public int getId() {
		return id;
	}
	
	public int getSize() {
		return size;
	}
}