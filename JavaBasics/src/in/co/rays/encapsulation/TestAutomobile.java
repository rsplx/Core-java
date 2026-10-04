package in.co.rays.encapsulation;

import java.text.ParseException;

public class TestAutomobile {

	public static void main(String[] args) throws ParseException {

		Automobile a = new Automobile();

		a.setColour("red");
		a.setSpeed(60);
		a.setMake("bike");

		System.out.println("colour is = " + a.getColour());
		System.out.println("speed is = " + a.getSpeed());
		System.out.println("make is = " + a.getMake());

	}
}
