package in.co.rays.stream;

import java.util.ArrayList;

public interface IntStream {
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		
		list.add(78000);
		list.add(60000);
		list.add(50000);
		list.add(40000);
		list.add(30000);
		
		list.stream().sorted() .skip(1).limit(1).forEach(System.out::println);
		
		
		
		
	}


}