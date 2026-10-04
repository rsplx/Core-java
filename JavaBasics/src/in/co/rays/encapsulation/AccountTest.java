package in.co.rays.encapsulation;

import java.text.ParseException;

public class AccountTest {
	public static void main(String[] args) throws ParseException {

	   Account a = new Account ();

		a.setNumber("593998390");
		a.setAccountType("current");
		a.setBalance(56789);

		System.out.println("Number is =" + a.getNumber());
		System.out.println("Accounttype is =" + a.getAccountType());
		System.out.println("Balance is =" + a.getBalance());

	}

}