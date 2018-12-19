package main.Mockito.Domicile;

public class Flat extends Domicile {
	
	int floor;
	String apartment;
	int numberOfNeighbors;
	boolean hasAC = false;
	boolean hasWashing = false;
	boolean hasElevator = false;
	boolean hasBalcony = false;
	boolean hasIntercom = false;

	public Flat(int numberOfRooms, int size, String type, String location, int floor, String apartment) {
		super(numberOfRooms, size, type, location);
		this.floor = floor;
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
	
	void setWashing(boolean hasWashing) {
		this.hasWashing = hasWashing;
	}
	
	boolean getWashing() {
		return hasWashing;
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
	
	void setIntercom(boolean hasIntercom) {
		this.hasIntercom = hasIntercom;
	}
	
	boolean getIntercom() {
		return hasIntercom;
	}
}
