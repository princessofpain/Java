package main.SpaceAge.Factory;

public class Mars implements Planet {
	
	int ageOnMars;
	
	@Override
	public int calculateAge(int age) {
		ageOnMars = (int) (age * 1.8808158);
		return ageOnMars;
	}
	
	@Override
	public String createResultMessage() {
		return "On Mars you would be " + ageOnMars + " years old!";
	}
}
