package main.Mockito.Domicile;

public interface Domicile {
	public String getType();
	public void setBasicInformation(int numberOfRooms, int size, String location, int floor_s);
	public int getNumberOfRooms();
	public int getSize();
	public String getLocation();
}
