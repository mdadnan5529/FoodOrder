package com.javabootcamp.food_order.menu;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface MenuRepository extends CrudRepository <Menu,String>{
	
	//getRestaurants
	public List<Menu> findByRestaurantId(String RestaurantId);
	//getRestaurant
	//updateRestaurant
	//deleteRestaurant

}
