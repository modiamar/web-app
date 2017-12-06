package com.service.rest.webapp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Dog {
	
	@Id
	@GeneratedValue
	private int id;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Dog(String name) {
		super();
		this.name = name;
	}
	
	public Dog(){
		
	}
	@Override
	public String toString() {
		return String.format("Dog [id=%s, name=%s]", id, name);
	}

	
}
