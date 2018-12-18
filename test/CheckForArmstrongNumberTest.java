package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.ArmstrongNumber.CheckForArmstrongNumber;;

class CheckForArmstrongNumberTest {
	
	private static CheckForArmstrongNumber number = new CheckForArmstrongNumber(); 

	@Test
	void checkNoArmstrongNumber() {
		String enteredNumber = "657";
		String actualResult = number.check(enteredNumber);
		String opponentOfExpectedResult = "The number " + enteredNumber + " is an armstrong number!";
		
		assertNotEquals(opponentOfExpectedResult, actualResult);
	}
	
	@Test
	void checkArmstrongNumber() {
		String enteredNumber = "371";
		String actualResult = number.check(enteredNumber);
		String expectedResult = "The number " + enteredNumber + " is an armstrong number!";
		
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	void checkCalculation() {
		int[] digits = {6,5,7};
		int actualResult = number.calculateSumToCheck(digits);
		int expectedResult = 684;
		
		assertEquals(expectedResult, actualResult);
	}
}