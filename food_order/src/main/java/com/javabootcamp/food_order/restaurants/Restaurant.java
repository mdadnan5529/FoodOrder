package com.javabootcamp.food_order.restaurants;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Restaurant {
	
	@Id
	private String id;
	private String name;
	private String description;
	public Restaurant()
	{
		
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Restaurant(String id, String name, String description) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

}
