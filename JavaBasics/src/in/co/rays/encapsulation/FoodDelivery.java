package in.co.rays.encapsulation;

public class FoodDelivery {
	private int id;
	private String coustomerName;
	private String restaurant;
	private double orderAmount;
	private String deliveryStatus;
	
	public void setId(int id) {
		this.id=id;
	}
	
	public int getId() {
		return id;
	}
	
	public void setCoustomerName(String coustomerName) {
		this.coustomerName=coustomerName;

	}
	public String getCoustomerName() {
		return coustomerName;
	}
	
	public void setRestaurant(String restaurant) {
		this.restaurant=restaurant;
	}
	public String getRestaurant() {
		return restaurant;
	}
	public void setOrderAmount(double orderAmount) {
		this.orderAmount=orderAmount;
	}
	public double getOrderAmount() {
		return orderAmount;
	}
	
	public void setDeliveryStatus(String deliveryStatus) {
		this.deliveryStatus=deliveryStatus;
	}
	public String getDeliveryStatus() {
		return deliveryStatus;
	
	}
	
	
	}
	
	

	
	
	
	
