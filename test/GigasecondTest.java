package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.Gigasecond;

public class GigasecondTest {
	
	Gigasecond my = new Gigasecond();
	
	@Test
	public void minutesAreCorrect() {
		double expected = 16666666.666666666666666666666667;
		double actual = my.liveForAGigasecodInMinutes();
		
		assertEquals(expected, actual, 0);
	}
	
	@Test
	public void hoursAreCorrect() {
		double expected = 277777.77777777777777777777777778;
		double actual = my.liveForAGigasecodInHours();
		
		assertEquals(expected, actual, 0);
	}
	
	@Test
	public void daysAreCorrect() {
		double expected = 11574.074074074074074074074074074;
		double actual = my.liveForAGigasecodInDays();
		
		assertEquals(expected, actual, 0);
	}
	
	@Test
	public void yearsAreCorrect() {
		double expected = 964.50617283950617283950617283951;
		double actual = my.liveForAGigasecodInYears();
		
		assertEquals(expected, actual, 0);
	}
}
