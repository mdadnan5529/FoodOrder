package com.javabootcamp.food_order.menu;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.javabootcamp.food_order.restaurants.Restaurant;

@RestController
public class MenuList {
	
	@Autowired
	private MenuService menuservice; 
	
	@RequestMapping("/Restaurants/{id}/Menu")
	public List<Menu> menuList(@PathVariable String id)
	{
		return menuservice.menuList(id);
	}
	@RequestMapping("/Restaurants/{RestaurantId}/Menu/{id}")
	public Menu menuShow(@PathVariable String id)
	{
		return menuservice.menuShow(id);
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/Restaurants/{RestaurantId}/Menu")
	public void addMenu(@RequestBody Menu menu,@PathVariable String RestaurantId)
	{
		menu.setRestaurant(new Restaurant(RestaurantId,"",""));
		menuservice.addMenu(menu);
	}
	@RequestMapping(method=RequestMethod.PUT,value="/Restaurants/{RestaurantId}/Menu/{id}")
	public void updateMenu(@RequestBody Menu menu,@PathVariable String id,@PathVariable String RestaurantId)
	{
		menu.setRestaurant(new Restaurant(RestaurantId,"",""));
		menuservice.updateMenu(menu	);
	}
	@RequestMapping(method=RequestMethod.DELETE,value="/Restaurants/{RestaurantId}/Menu/{id}")
	public void deleteRestaurant(@RequestBody Menu menu,@PathVariable String id)
	{
		menuservice.deleteMenu(menu,id);
	}
}
