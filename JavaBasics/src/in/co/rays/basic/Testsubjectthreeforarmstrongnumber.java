package in.co.rays.basic;

public class Testsubjectthreeforarmstrongnumber {
	public static void main(String[] args) {
		int num = 150;
		
		int a = num %10;
		int b = (num/10)%10;
		int c = num/100;
		 
		int sum = a*a*a+b*b*b+c*c*c;
		
		if (sum==num){
			System.out.println("oh its armstrong number");
		}else {
			System.out.println("oh its not a armstrong number");
			
		}
	}

}
