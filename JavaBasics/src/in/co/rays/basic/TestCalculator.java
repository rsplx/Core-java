package in.co.rays.basic;

public class TestCalculator {
	public static void main(String[] args) {
		
		String opr = "-";
		int a = 5;
		int b = 16;
		switch (opr) {
		case "+":
			System.out.println("result:" + (a+b));
			break;
		case "-":
			System.out.println("result" + (a-b));
			break;
		case "*":
			System.out.println("result" + (a*b));
			break;
		case "/":
			System.out.println("result" + (a/b));
			break;
		case "%":
			System.out.println("result" + (a%b));
			break;
			
		
		}
		
		
	}

}
