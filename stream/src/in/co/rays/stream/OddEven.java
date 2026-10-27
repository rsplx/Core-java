package in.co.rays.stream;

import java.util.ArrayList;

public class OddEven {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();

		list.add(2);
		list.add(5);
		list.add(71);
		list.add(71);
		list.add(78);
		list.add(90);
		list.add(32);

		System.out.println("Even numbers:");
		list.stream().filter(n -> n % 2 == 0).forEach(System.out::println);

		System.out.println("Odd numbers:");
		list.stream().filter(n -> n % 2 != 0).forEach(System.out::println);

		System.out.println("Prime numbers:");
		list.stream().filter(n -> n > 1)
				.filter(n -> java.util.stream.IntStream.rangeClosed(2, (int) Math.sqrt(n)).noneMatch(i -> n % i == 0))
				.forEach(System.out::println);

	}

}
