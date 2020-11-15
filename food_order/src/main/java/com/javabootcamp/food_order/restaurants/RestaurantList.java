package com.javabootcamp.food_order.restaurants;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestaurantList {
	
	@Autowired
	private RestaurantService restaurantservice; 
	
	@RequestMapping("/Restaurants")
	public List<Restaurant> RestaurantsList()
	{
		return restaurantservice.RestaurantList();
	}
	@RequestMapping("/Restaurants/{id}")
	public Restaurant RestaurantShow(@PathVariable String id)
	{
		return restaurantservice.RestaurantShow(id);
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/Restaurants")
	public void addRestaurant(@RequestBody Restaurant restaurant)
	{
		restaurantservice.addRestaurant(restaurant);
	}
	@RequestMapping(method=RequestMethod.PUT,value="/Restaurants/{id}")
	public void addRestaurant(@RequestBody Restaurant restaurant,@PathVariable String id)
	{
		restaurantservice.updateRestaurant(restaurant,id);
	}
	@RequestMapping(method=RequestMethod.DELETE,value="/Restaurants/{id}")
	public void deleteRestaurant(@RequestBody Restaurant restaurant,@PathVariable String id)
	{
		restaurantservice.deleteRestaurant(restaurant,id);
	}
}
