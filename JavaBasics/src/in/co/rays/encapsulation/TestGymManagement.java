package in.co.rays.encapsulation;

import java.text.ParseException;

public class TestGymManagement {
	
	public static void main (String[] args) throws ParseException{
		
		GymManagement g = new GymManagement();
		
	    g.setId(788);
	    g.setName("rishabh");
	    g.setMemberShipType("monthly");
	    g.setJoiningDate("5 june 2026");
	    g.setTrainerName("rahul");
	    
	    System.out.println("id is ="+ g.getId());
	    System.out.println("name is ="+ g.getName());
	    System.out.println("membershiptype is ="+ g.getMemberShipType());
	    System.out.println("joiningdate is ="+ g.getJoiningDate());
	    System.out.println("trainername is ="+ g.getTrainerName());
	    
			
		}
		
	}

