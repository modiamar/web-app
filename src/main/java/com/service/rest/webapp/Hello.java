package com.service.rest.webapp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Hello {
	
	@Id
	@GeneratedValue
	private int id;
	
	private String world;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	

	public String getWorld() {
		return world;
	}

	public void setWorld(String world) {
		this.world = world;
	}


	@Override
	public String toString() {
		return String.format("Hello [id=%s, world=%s]", id, world);
	}


	

}
