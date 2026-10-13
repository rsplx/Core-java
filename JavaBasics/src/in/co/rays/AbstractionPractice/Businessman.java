package in.co.rays.AbstractionPractice;

public class Businessman extends person implements Killer, Richman {

	@Override
	public void EarnMoney() {
		System.out.println("5000$");
	}

	@Override
	public void InvestMoney() {
		System.out.println("4000$");

	}

	@Override
	public void SpentMoney() {
		System.out.println("1000$");
          
	}

	@Override
	public void KillPeople() {
		System.out.println("At least 1");

	}

	@Override
	public void TakeBlood() {
		System.out.println("max 5");
		

	}

}
