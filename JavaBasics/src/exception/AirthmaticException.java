package exception;

public class AirthmaticException {
	public static void main(String[] args) {

		try {
			int a = 15;
			int b = 0;
			int c = a / b;
			System.out.println(c);

		} catch (Exception e) {
			System.out.println("exception: " + e.getMessage());

		}
	}
}
