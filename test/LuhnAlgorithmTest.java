package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.LuhnAlgorithm.LuhnAlgorithm;

public class LuhnAlgorithmTest {
	
	LuhnAlgorithm check = new LuhnAlgorithm();
	
	@Test
	public void inputIsDetectedAsTooShort() {
		String input = "1";
		String expected = "This number is too short. Please enter a number with at least 2 digits.";
		String actual = check.resultOfLuhnCheck(input);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void inputIsValid() {
		String input = "5610591081018250";
		String expected = " is a valid number.";
		String actual = check.resultOfLuhnCheck(input);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void inputIsNotValid() {
		String input = "56105910810147586";
		String expected = " is not a valid number!";
		String actual = check.resultOfLuhnCheck(input);
		
		assertEquals(expected, actual);
	}
}
