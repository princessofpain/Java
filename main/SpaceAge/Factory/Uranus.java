package main.SpaceAge.Factory;

public class Uranus implements Planet {
	
	int ageOnUranus;
	
	@Override
	public int calculateAge(int age) {
		ageOnUranus = (int) (age * 84.016846);
		return ageOnUranus;
	}
	
	@Override
	public String createResultMessage() {
		return "On Uranus you would be " + ageOnUranus + " years old!";
	}
}
