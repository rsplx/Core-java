package in.co.rays.collection;

import java.util.ArrayList;
import java.util.List;

public class TestList {
	
	public static void main(String[] args) {
		
	
	List list = new ArrayList();
	
	list.add(0,"ram");
	list.add(1,"shyam");
	list.add(2,"lokesh");
	list.add(3,"lankesh");
	list.add(4,true);
	
	System.out.println(list);
	System.out.println(list.get(3));
	System.out.println(list.remove(1));
	System.out.println(list);
	
	
	
	
	
	}
	
	

}
