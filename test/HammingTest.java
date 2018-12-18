package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.Hamming.Hamming;

public class HammingTest {
	Hamming h = new Hamming();
	
	@Test
	public void dnaIsNotTheSame() {
		String dna1 = "ABC";
		String dna2 = "EFG";
		
		String expected = "^ ^ ^ ";
		String actual = h.compare(dna1, dna2);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void dnaIsTheSame() {
		String dna1 = "ABC";
		String dna2 = "ABC";
		
		String expected = "      ";
		String actual = h.compare(dna1, dna2);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void stringsHaveDifferentLength() {
		String dna1 = "ABC";
		String dna2 = "DEFGHI";
		
		String expected = null;
		String actual = h.compare(dna1, dna2);
		
		assertEquals(expected, actual);
	}
}
