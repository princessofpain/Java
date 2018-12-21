package main.Mockito.Domicile;

public class House implements Domicile {
	
	private String type = "house";
	private int numberOfRooms;
	private int size;
	private String location;
	private int floors;
	private boolean hasFireplace;
	private boolean hasPool;
	private boolean hasGarden;
	private int numberOfGarages;
	
	public void setBasicInformation(int numberOfRooms, int size, String location, int floors) {
		this.numberOfRooms = numberOfRooms;
		this.size = size;
		this.location = location;
		this.floors = floors;
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

	public int getFloors() {
		return floors;
	}
	
	public void setFireplace(boolean hasFireplace) {
		this.hasFireplace = hasFireplace;
	}
	
	public boolean getFireplace() {
		return hasFireplace;
	}
	
	public void setPool(boolean hasPool) {
		this.hasPool = hasPool;
	}
	
	public boolean getPool() {
		return hasPool;
	}
	
	public void setGarden(boolean hasGarden) {
		this.hasGarden = hasGarden;
	}
	
	public boolean getGarden() {
		return hasGarden;
	}
	
	public void setGarages(int numberOfGarages) {
		this.numberOfGarages = numberOfGarages;
	}
	
	public int getGarages() {
		return numberOfGarages;
	}
}