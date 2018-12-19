package test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

import main.SumOfMultiples.Multiples;

class SumOfMultiplesTest {
	
	Multiples multiples = new Multiples(5, 25);

	@Test
	void multiplesAreCorrect() {
		ArrayList<Integer> expected = new ArrayList<Integer>();
		expected.addAll(Arrays.asList(5, 10, 15, 20, 25));
		ArrayList<Integer> actual = multiples.findMultiples();
		
		assertEquals(expected, actual);
	}
	
	@Test
	void sumIsCorrect() {
		int expected = 75;
		int actual = multiples.findMultiplesAndSumUp();
		
		assertEquals(expected, actual);
	}
}
