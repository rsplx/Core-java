package in.co.rays.encapsulation;

public class OnlineVoting {

	private int id;
	private String name;
	private int age;
	private String constituency;
	private boolean hasVoted;

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setConstituency(String constituency) {
		this.constituency = constituency;
	}

	public String getConstituency() {
		return constituency;
	}

	public void setHasVoted(boolean hasVoted) {
		this.hasVoted = hasVoted;
	}

	public boolean getHasVoted() {
		return hasVoted;
	}

}
