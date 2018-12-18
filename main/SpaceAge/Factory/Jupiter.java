package main.SpaceAge.Factory;

public class Jupiter implements Planet {
	
	int ageOnJupiter;
	
	@Override
	public int calculateAge(int age) {
		ageOnJupiter = (int) (age * 11.862615);
		return ageOnJupiter;
	}
	
	@Override
	public String createResultMessage() {
		return "On Jupiter you would be " + ageOnJupiter + " years old!";
	}
}
