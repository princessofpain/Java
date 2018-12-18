package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.AliquotSum.AliquotSum;

class AliquotSumTest {

	private AliquotSum guess = new AliquotSum();
	
	@Test
	void numberIsNatural() {
		int number = 15;
		String actualBehaviorNumberIsNatural = guess.showNumberTypeOf(number, guess);
		String expectedBehaviorNumberIsNatural = number + " is a deficient number.";	
		
		assertEquals(expectedBehaviorNumberIsNatural, actualBehaviorNumberIsNatural);
	}
	
	@Test
	void numberIsNotNatural() {
		int number = 0;
		String actualBehaviorNumberIsNotNatural = guess.showNumberTypeOf(number, guess);
		String expectedBehaviorIsNotNatural = number + " is not a natural number";	
		
		assertEquals(expectedBehaviorIsNotNatural, actualBehaviorNumberIsNotNatural);
	}
	
	@Test
	void aliquotSumIsCorrect() {
		int actualSum = guess.calculateResult(69);
		int expectedSum = 27;	
		
		assertEquals(expectedSum, actualSum);
	}
	
	@Test
	void numberIsPerfect() {
		int numToCheckAgainst = 15;		
		int aliquotSum = 15;
		String expectedResultPerfectNumber = numToCheckAgainst + " is a perfect number!";
		String actualResultPerfectNumber = guess.checkAliquotSumOf(numToCheckAgainst, aliquotSum);	
		
		assertEquals(expectedResultPerfectNumber, actualResultPerfectNumber);
	}
	
	@Test
	void numberIsAbundant() {
		int numToCheckAgainst = 15;	
		int aliquotSum = 20;
		String expectedResultAbundantNumber = numToCheckAgainst + " is an abundant number.";
		String actualResultAbundantNumber = guess.checkAliquotSumOf(numToCheckAgainst, aliquotSum);
		
		assertEquals(expectedResultAbundantNumber, actualResultAbundantNumber);
	}
	
	@Test
	void numberIsDeficient() {
		int numToCheckAgainst = 15;	
		int aliquotSum = 10;
		String expectedResultDeficientNumber = numToCheckAgainst + " is a deficient number.";
		String actualResultDeficientNumber = guess.checkAliquotSumOf(numToCheckAgainst, aliquotSum);
		
		assertEquals(expectedResultDeficientNumber, actualResultDeficientNumber);
	}	
}
