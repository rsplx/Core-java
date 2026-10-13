package in.co.rays.polymorphism;

public class TestBank {
	
	public static void main(String[] args) {

		Bank[] banks = new Bank[3];

		banks[0] = new AxisBank();
		banks[1] = new HDFCBank();
		banks[2] = new ICICIBank();
		
		for(Bank bank : banks){		
			System.out.println(bank.getName());
			System.out.println(bank.interestRate());
		}
}
}