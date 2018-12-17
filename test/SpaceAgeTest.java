package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.SpaceAgeLogic;

public class SpaceAgeTest {
	SpaceAgeLogic spaceAge = new SpaceAgeLogic();
	int age = 35;
	
	@Test
	public void ageOnMercuryIsCorrect() {
		String planet = "Mercury";
		String expected = "8,43";
		String actual = spaceAge.calculateAge(planet,age);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void ageOnVenusIsCorrect() {
		String planet = "Venus";
		String expected = "21,53";
		String actual = spaceAge.calculateAge(planet,age);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void ageOnMarsIsCorrect() {
		String planet = "Mars";
		String expected = "65,83";
		String actual = spaceAge.calculateAge(planet,age);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void ageOnJupiterIsCorrect() {
		String planet = "Jupiter";
		String expected = "415,19";
		String actual = spaceAge.calculateAge(planet,age);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void ageOnSaturnIsCorrect() {
		String planet = "Saturn";
		String expected = "1030,66";
		String actual = spaceAge.calculateAge(planet,age);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void ageOnUranusIsCorrect() {
		String planet = "Uranus";
		String expected = "2940,59";
		String actual = spaceAge.calculateAge(planet,age);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void ageOnNeptuneIsCorrect() {
		String planet = "Neptune";
		String expected = "5767,70";
		String actual = spaceAge.calculateAge(planet,age);
		
		assertEquals(expected, actual);
	}
}
