package in.co.rays.encapsulation;

import java.text.ParseException;

public class TestOnlineVoting {
	
	public static void main(String[] args) throws ParseException{
		
		OnlineVoting o = new OnlineVoting();
		
		o.setId(5749);
		o.setName("rishabh");
		o.setAge(0);
		o.setConstituency("ujjain");
		o.setHasVoted(false);
		 
		System.out.println("id is ="+ o.getId());
		System.out.println("name is ="+ o.getName());
		System.out.println("age is ="+ o.getAge());
		System.out.println("constituency is ="+ o.getConstituency());
		System.out.println("voted="+ o.getHasVoted());
		
		
			
			
		}
	}

