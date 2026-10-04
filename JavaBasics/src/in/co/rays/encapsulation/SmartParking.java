package in.co.rays.encapsulation;

public class SmartParking {

	public int id;
	public String vehicleNumber;
	public String vehicleType;
	public String entryTime;
	public boolean occupied;

	public void setId(int id) {
		this.id = id;

	}

	public int getId() {
		return id;
	}

	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}

	public String getVehicleNumber() {
		return vehicleNumber;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	public String getVehicleType() {
		return vehicleType;
	}

	public void setEntryTime(String entryTime) {
		this.entryTime = entryTime;
	}

	public String getEntryTime() {
		return entryTime;
	}

	public void setOccupied(boolean occupied) {
		this.occupied = occupied;
	}

	public boolean getOccupied() {
		return occupied;
	}

}
