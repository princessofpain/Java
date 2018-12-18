package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.DifferenceOfSquares.DifferenceOfSquares;

public class DifferenceOfSquaresTest {
	DifferenceOfSquares difference = new DifferenceOfSquares();
	int number = 18;
	
	@Test
	public void squareOfSumIsCorrect() {
		int expected = 29241;
		int actual = difference.calculateSquareOfSum(number);
		
		assertEquals(expected, actual);
	}
	
	@Test 
	public void sumOfSquaresIsCorrect() {
		int expected = 2109;
		int actual = difference.calculateSumOfSquares(number);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void differenceIsCorrect() {
		int expected = 27132;
		int actual = difference.differenceOfResults(number);
		
		assertEquals(expected, actual);
	}
}
