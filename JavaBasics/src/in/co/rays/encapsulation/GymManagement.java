package in.co.rays.encapsulation;

public class GymManagement {
	
	private int id;
	private String name;
	private String membershipType;
	private String joiningDate;
	private String trainerName;
	
	public void setId(int id) {
		this.id=id;
	}
	public int getId() {
		return id;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setMemberShipType(String membershipType) {
		this.membershipType=membershipType;
	}
	public String getMemberShipType() {
		return membershipType;
	}
	public void setJoiningDate(String joiningDate) {
		this.joiningDate=joiningDate;
	}
	public String getJoiningDate() {
		return joiningDate;
	}
	public void setTrainerName(String trainerName) {
		this.trainerName=trainerName;
	}
	public String getTrainerName() {
		return trainerName;
		
	
	}

}
