package main.SpaceAge.Factory;

public class Saturn implements Planet {
	
	int ageOnSaturn;
	
	@Override
	public int calculateAge(int age) {
		ageOnSaturn = (int) (age * 29.447498);
		return ageOnSaturn;
	}
	
	@Override
	public String createResultMessage() {
		return "On Saturn you would be " + ageOnSaturn + " years old!";
	}
}
