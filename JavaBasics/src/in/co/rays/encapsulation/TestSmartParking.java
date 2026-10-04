package in.co.rays.encapsulation;

import java.text.ParseException;

public class TestSmartParking {
	
	public static void main (String[] args) throws ParseException{
		
		SmartParking s = new SmartParking();
		
		s.setEntryTime("5:50pm");
		s.setId(0);
		s.setOccupied(true);
	    s.setVehicleNumber("MP 13 EZ 6578");
	    s.setVehicleType("Motorcycle");
	    
	    System.out.println("vehicle id is ="+ s.getId());
	    System.out.println("vehicle number is ="+ s.getVehicleNumber());
	    System.out.println("vehicle Type is ="+ s.getVehicleType());
	    System.out.println("vehicle entry Time is ="+ s.getEntryTime());
	    System.out.println("vehicle occupancy="+ s.getOccupied());
	    
	}

}
