package abstraction;

public class TestBusinessman {
	public static void main(String[] args) {
		
		Richman r = new Businessman();
		
		r.earnMoney();
		r.donation();
		r.party();
		
		System.out.println("                  ");
		
		SocialWorker s = new Businessman();
		
		s.helpToOthers();
		
		System.out.println("                     ");
		
		Businessman bu = new Businessman();
		
		bu.donation();
		bu.earnMoney();
		bu.helpToOthers();
		bu.party();
		
		
	}
	
	

}
