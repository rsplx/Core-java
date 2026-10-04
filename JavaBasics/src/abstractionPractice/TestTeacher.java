package abstractionPractice;

public class TestTeacher {
	public static void main(String[] args) {

		Richman r = new Principle();

		r.earnMoney();
		r.investMoney();
		r.spendMoney();

		System.out.println("-------------------");

		Teacher t = new Principle();

		t.teach();

		System.out.println("---------------");

		Principle p = new Principle();

		p.earnMoney();
		p.investMoney();
		p.spendMoney();
		p.teach();

	}

}
