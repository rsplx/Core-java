package in.co.rays.basic;

public class Armstromtest9 {
	public static void main(String[] args) {
		int num = 189;

		int a = num % 10;
		int b = (num / 10) % 10;
		int c = num / 100;

		int sum = a * a * a + b * b * b + c * c * c;

		if (sum == num) {
			System.out.println("its a anstrom number");

		} else {
			System.out.println("its not a armstrom number");

		}
	}

}
