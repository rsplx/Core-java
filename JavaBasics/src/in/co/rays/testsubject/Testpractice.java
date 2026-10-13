package in.co.rays.testsubject;

import java.text.ParseException;

public class Testpractice {
	public static void main(String[] args) throws ParseException {

		practice p = new practice();

		p.setColour("purple");
		p.setName("rishabh singh parihar");
		p.setNumber(0);

		System.out.println("the colour is =" + p.getColour());
		System.out.println("my name is =" + p.getName());
		System.out.println("number is =" + p.getNumber());

	}

}
