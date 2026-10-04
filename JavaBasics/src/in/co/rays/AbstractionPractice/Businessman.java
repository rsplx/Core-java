package in.co.rays.AbstractionPractice;

public class Businessman extends person implements Killer, Richman {

	@Override
	public void EarnMoney() {
		// TODO Auto-generated method stub
		System.out.println("5000$");
	}

	@Override
	public void InvestMoney() {
		// TODO Auto-generated method stub
		System.out.println("4000$");

	}

	@Override
	public void SpentMoney() {
		// TODO Auto-generated method stub
		System.out.println("1000$");
          
	}

	@Override
	public void KillPeople() {
		// TODO Auto-generated method stub
		System.out.println("At least 1");

	}

	@Override
	public void TakeBlood() {
		// TODO Auto-generated method stub
		System.out.println("max 5");
		

	}

}
