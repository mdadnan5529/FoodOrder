package com.javabootcamp.food_order.menu;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.javabootcamp.food_order.restaurants.Restaurant;

@Entity
public class Menu {
	
	@Id
	private String id;
	private String name;
	private String description;
	@ManyToOne
	private Restaurant restaurant;
	
	
	public Menu()
	{
		
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Menu(String id, String name, String description,String RestaurantId) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.restaurant=new Restaurant(RestaurantId,"","");
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
	public Restaurant getRestaurant() {
		return restaurant;
	}
	public void setRestaurant(Restaurant restaurant) {
		this.restaurant = restaurant;
	}

}
