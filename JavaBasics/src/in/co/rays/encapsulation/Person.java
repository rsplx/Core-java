package in.co.rays.encapsulation;

import java.util.Date;

public class Person {
	private String name;
	private Date dob;
	private String address;

	public void setName(String name) {
		this.name = name;
	}

	public String getname() {
		return name;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getAddress() {
		return address;
	}

	public void setAdress(String address) {
		this.address = address;

	}
}