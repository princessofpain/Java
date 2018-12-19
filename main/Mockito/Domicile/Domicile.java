package main.Mockito.Domicile;

public class Domicile {
	private int numberOfRooms;
	private int size;
	private String type;
	private String location;
	
	public Domicile(int numberOfRooms, int size, String type, String location) {
		this.numberOfRooms = numberOfRooms;
		this.size = size;
		this.type = type;
		this.location = location;
	}
	
	public void setNumberOfRooms(int rooms) {
		this.numberOfRooms = rooms;
	}
	
	public int getNumberOfRooms() {
		return numberOfRooms;
	}
	
	public void setSize(int size) {
		this.size = size;
	}
	
	public int getSize() {
		return size;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public String getType() {
		return type;
	}
	
	public void setLocation(String location) {
		this.location = location;
	}
	
	public String getLocation() {
		return location;
	}
}
