package com.javabootcamp.food_order.menu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MenuService {
	
	@Autowired
	private MenuRepository menuRepository;
	
//   private List<Menu> restaurants =	new ArrayList<>(Arrays.asList(
//			new Menu("Rest1","KFC","Non Veg"),
//			new Menu("Rest2","BBQ","Non Veg"),
//			new Menu("Rest3","Kaveri","Veg"),
//			new Menu("Rest4","McD","Non Veg")
//			));
   public List<Menu> menuList(String restaurantId)
   {
	   //return restaurants;
	   List<Menu> menus = new ArrayList<>();
	   menuRepository.findByRestaurantId(restaurantId)
	   .forEach(menus::add);
	   return menus; 
   }
   public Menu menuShow(String id)
	{
	   //return restaurants.stream().filter(t->t.getId().equals(id)).findFirst().get();
	    return menuRepository.findById(id).get();
	}
   public void addMenu(Menu menu)
   {
	   //restaurants.add(restaurant);
	   menuRepository.save(menu);
   }
   public void updateMenu(Menu menu) 
   {
//	for(int i=0;i<restaurants.size();i++)
//	{
//		Restaurant R = restaurants.get(i);
//		if(R.getId().equals(id))
//		{
//			restaurants.set(i, restaurant);
//			return;
//		}
//	}
	   menuRepository.save(menu);
   }
   public void deleteMenu(Menu menu, String id) 
   {	
//	   restaurants.removeIf(R -> R.getId().equals(id));
	   menuRepository.delete(menu);
   }

}
	