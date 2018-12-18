package main.SpaceAge.Factory;

public class Mercury implements Planet {
	
	int ageOnMercury;
	
	@Override
	public int calculateAge(int age) {
		ageOnMercury = (int) (age * 0.2408467);
		return ageOnMercury;
	}
	
	@Override
	public String createResultMessage() {
		return "On Mercury you would be " + ageOnMercury + " years old!";
	}
}