package com.javabootcamp.food_order.restaurants;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class RestaurantService {
	
   private List<Restaurant> restaurants =	new ArrayList<>(Arrays.asList(
			new Restaurant("Rest1","KFC","Non Veg"),
			new Restaurant("Rest2","BBQ","Non Veg"),
			new Restaurant("Rest3","Kaveri","Veg"),
			new Restaurant("Rest4","McD","Non Veg")
			));
   public List<Restaurant> RestaurantList()
   {
	   return restaurants;
   }
   public Restaurant RestaurantShow(String id)
	{
	   return restaurants.stream().filter(t->t.getId().equals(id)).findFirst().get();
	}
   public void addRestaurant(Restaurant restaurant)
   {
	   restaurants.add(restaurant);
   }
   public void updateRestaurant(Restaurant restaurant,String id) 
   {
	for(int i=0;i<restaurants.size();i++)
	{
		Restaurant R = restaurants.get(i);
		if(R.getId().equals(id))
		{
			restaurants.set(i, restaurant);
			return;
		}
	}
   }
   public void deleteRestaurant(Restaurant restaurant, String id) 
   {	
	   restaurants.removeIf(R -> R.getId().equals(id));
   }

}
	