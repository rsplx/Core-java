package abstractionPractice;

public class Principle extends Person implements Richman, Teacher {

	@Override
	public void teach() {
		System.out.println("Teach = physics");

	}

	@Override
	public void earnMoney() {
		System.out.println("Earn Money = 50000");

	}

	@Override
	public void spendMoney() {
		System.out.println("Spend Money = 20000");

	}

	@Override
	public void investMoney() {
		System.out.println("Invest Money = 30000");

	}

}
