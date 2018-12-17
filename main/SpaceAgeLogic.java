package main;

import java.text.DecimalFormat;

public class SpaceAgeLogic {
	
	public String calculateOnePlanetAndCreateMessage(String planet, int ageInYears) {
		String calculatedAge = calculateAge(planet, ageInYears);
		String result = "On " + planet + " you would be " + calculatedAge + " years old!";
		return result;
	}
	
	public String calculateAge(String planet, int ageInYears) {
		double result = 0;
		
		switch(planet) {
			case "Mercury": result = ageInYears * 0.2408467;
					break;
			case "Venus": result = ageInYears * 0.61519726;
					break;
			case "Mars": result = ageInYears * 1.8808158;
					break;
			case "Jupiter": result = ageInYears * 11.862615;
					break;
			case "Saturn": result = ageInYears * 29.447498;
					break;
			case "Uranus": result = ageInYears * 84.016846;
					break;		
			case "Neptune": result = ageInYears * 164.79132;
					break;
		}
		
		DecimalFormat df = new DecimalFormat("0.00");
		
		return df.format(result);
	}
}
