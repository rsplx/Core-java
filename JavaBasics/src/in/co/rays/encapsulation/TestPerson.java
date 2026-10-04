package in.co.rays.encapsulation;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TestPerson {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Person p = new Person();

		p.setName("Rishabh");
		p.setAdress("Ujjain");
		p.setDob(sdf.parse("2005-09-08"));

		System.out.println("Name is =" + p.getname());
		System.out.println("Address is=" + p.getAddress());
		System.out.println("Dob is =" + p.getDob());

	}
}
