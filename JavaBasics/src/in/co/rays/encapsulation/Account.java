package in.co.rays.encapsulation;
public class Account {

	private String number;
	private String accountType;
	private double balance;

	public void setNumber(String number){
		this.number = number;
	}

	public String getNumber(){
		return number;
	}

	public String getAccountType(){
		return accountType;
	}
		
		public void setAccountType(String accountType){
			this.accountType = accountType;
		}

	public double getBalance(){
		return balance;
	}
	public void setBalance(double balance){
		this.balance = balance;
}
}