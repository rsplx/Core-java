package in.co.rays.AbstractionPractice;

public class TestBusinessmn {
	public static void main( String[] args) {
		
		Richman r = new Businessman();
		
		r.EarnMoney();
		r.InvestMoney();
		r.SpentMoney();
		
		System.out.println("---------------");
		
		Killer k = new Businessman();
		
		k.KillPeople();
		k.TakeBlood();
		
		System.out.println("--------------------");
		
		Businessman b = new Businessman();
		
		b.EarnMoney();
		b.InvestMoney();
		b.SpentMoney();
		b.KillPeople();
		b.TakeBlood();
		
		System.out.println("-------------------");
		
		
		
		
	}

}
