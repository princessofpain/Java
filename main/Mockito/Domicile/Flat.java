package main.Mockito.Domicile;

public class Flat implements Domicile {
	
	private String type = "flat";
	private int numberOfRooms;
	private int size;
	private String location;
	int floor;
	String apartment;
	int numberOfNeighbors;
	boolean hasAC = false;
	boolean hasElevator = false;
	boolean hasBalcony = false;

	public void setBasicInformation(int numberOfRooms, int size, String location, int floor) {
		this.numberOfRooms = numberOfRooms;
		this.size = size;
		this.location = location;
		this.floor = floor;
	}
	
	public String getType() {
		return type;
	}

	public int getNumberOfRooms() {
		return numberOfRooms;
	}

	public int getSize() {
		return size;
	}
	
	public String getLocation() {
		return location;
	}
	
	public int getFloor() {
		return floor;
	}
	
	public String getApartment() {
		return apartment;
	}

	public void setApartment(String apartment) {
		this.apartment = apartment;
	}

	void setNeighbors(int numberOfNeighbors) {
		this.numberOfNeighbors = numberOfNeighbors; 
	}
	
	int getNumberOfNeighbors() {
		return numberOfNeighbors;
	}
	
	void setAC(boolean hasAC) {
		this.hasAC = hasAC;
	}
	
	boolean getAC() {
		return hasAC;
	}
	
	void setElevator(boolean hasElevator) {
		this.hasElevator = hasElevator;
	}
	
	boolean getElevator() {
		return hasElevator;
	}
	
	void setBalcony(boolean hasBalcony) {
		this.hasBalcony = hasBalcony;
	}
	
	boolean getBalcony() {
		return hasBalcony;
	}
}
