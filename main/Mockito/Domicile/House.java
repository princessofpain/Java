package main.Mockito.Domicile;

public class House extends Domicile {

	private int floors;
	private boolean hasFireplace;
	private boolean hasPool;
	private boolean hasGarden;
	private int numberOfGarages;

	public House(int numberOfRooms, int size, String type, String location, int floors) {
		super(numberOfRooms, size, type, location);
		this.floors = floors;
	}
	
	public void setFloors(int floors) {
		this.floors = floors;
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
