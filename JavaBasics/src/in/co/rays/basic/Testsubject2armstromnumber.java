package in.co.rays.basic;

public class Testsubject2armstromnumber {
	public static void main(String[] args) {
		int num = 156;

		int a = num % 10;
		int b = (num / 100) % 10;
		int c = num / 100;

		int sum = a * a * a + b * b * +c * c * c;

		if (sum == num) {
			System.out.println("oh its a armstrong number");
		} else {
			System.out.println("oh its a not a armstrong number");

		}

	}

}
