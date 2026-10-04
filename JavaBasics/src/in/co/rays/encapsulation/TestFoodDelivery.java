package in.co.rays.encapsulation;

import java.text.ParseException;

public class TestFoodDelivery {
	
	public static void main(String [] args) throws ParseException{
		
		FoodDelivery f = new FoodDelivery();
		
		f.setCoustomerName("rishabh singh parihar");
		f.setRestaurant("rajkumar");
		f.setOrderAmount(560);
		f.setDeliveryStatus("online");
	
		System.out.println("Coustomer Name is = "+ f.getCoustomerName());
		System.out.println("Restaurant Name is = "+ f.getRestaurant());
		System.out.println("the order amount is = "+ f.getOrderAmount());
		System.out.println("DeliveryStatus is = "+ f.getDeliveryStatus());
		
		
	}

}
