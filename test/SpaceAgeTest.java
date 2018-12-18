package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.SpaceAge.Factory.Planet;
import main.SpaceAge.Factory.PlanetFactory;

public class SpaceAgeTest {
	PlanetFactory factory = new PlanetFactory();
	int age = 35;
	
	@Test
	public void ageOnMercuryIsCorrect() {
		String planetType = "Mercury";
		int expected = 8;
		Planet mercury = factory.getPlanet(planetType);
		int actual = mercury.calculateAge(age);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void ageOnVenusIsCorrect() {
		String planetType = "Venus";
		int expected = 21;
		Planet venus = factory.getPlanet(planetType);
		int actual = venus.calculateAge(age);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void ageOnMarsIsCorrect() {
		String planetType = "Mars";
		int expected = 65;
		Planet mars = factory.getPlanet(planetType);
		int actual = mars.calculateAge(age);
		
		assertEquals(expected, actual);;
	}
	
	@Test
	public void ageOnJupiterIsCorrect() {
		String planetType = "Jupiter";
		int expected = 415;
		Planet jupiter = factory.getPlanet(planetType);
		int actual = jupiter.calculateAge(age);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void ageOnSaturnIsCorrect() {
		String planetType = "Saturn";
		int expected = 1030;
		Planet saturn = factory.getPlanet(planetType);
		int actual = saturn.calculateAge(age);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void ageOnUranusIsCorrect() {
		String planetType = "Uranus";
		int expected = 2940;
		Planet uranus = factory.getPlanet(planetType);
		int actual = uranus.calculateAge(age);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void ageOnNeptuneIsCorrect() {
		String planetType = "Neptune";
		int expected = 5767;
		Planet neptune = factory.getPlanet(planetType);
		int actual = neptune.calculateAge(age);
		
		assertEquals(expected, actual);
	}
}
