package main.SpaceAge.Factory;

public class Neptune implements Planet {
	
	int ageOnNeptune;
	
	@Override
	public int calculateAge(int age) {
		ageOnNeptune = (int) (age * 164.79132);
		return ageOnNeptune;
	}
	
	@Override
	public String createResultMessage() {
		return "On Neptune you would be " + ageOnNeptune + " years old!";
	}
}
