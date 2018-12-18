package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.FactorRaindrops.FactorRaindrops;

public class FactorRaindropsTest {
	
	FactorRaindrops fr = new FactorRaindrops();
	
	@Test
	public void factorsAreCorrect() {
		int number = 15;
		String expected = "1, 3, 5, 15";
		String actual = fr.calculateFactor(number);
		
		assertEquals(expected, actual);
	}
}
