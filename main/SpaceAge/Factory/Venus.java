package main.SpaceAge.Factory;

public class Venus implements Planet {
	
	int ageOnVenus;
	
	@Override
	public int calculateAge(int age) {
		ageOnVenus = (int) (age * 0.61519726);
		return ageOnVenus;
	}
	
	@Override
	public String createResultMessage() {
		return "On Venus you would be " + ageOnVenus + " years old!";
	}
}
