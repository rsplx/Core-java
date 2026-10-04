package in.co.rays.basic;

public class Armstrommnumber34 {
	public static void main(String[] args) {
		int num = 1890;
		
		int a = num % 10;
		int b = (num/10)% 10;
		int c = num / 100;
		
		int sum = a*a*a+b*b*b+c*c*c;
		
		if(sum==num) {
			System.out.println("its a armstrom number");
		}else {
			System.out.println("its not a armstrom number");
		}
	}

}
