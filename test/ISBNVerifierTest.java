package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import main.ISBNVerifier.ISBNVerifier;

public class ISBNVerifierTest {
	ISBNVerifier iv = new ISBNVerifier();
	
	@Test
	public void factorIsCorrect() {
		String isbn = "85-336-1340-7";
		int expected = 235;
		int actual = iv.calculateFactor(isbn);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void verificationDigitIsIdentified() {
		String isbn = "85-336-1340-7";
		int expected = 7;
		int actual = iv.assignVerificationDigit(isbn);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void nonDigitVerificationCodeIsAssigned() {
		String isbn = "85-336-1340-X";
		int expected = 10;
		int actual = iv.assignVerificationDigit(isbn);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void trueForValidISBN() {
		String isbn = "85-336-1340-7";
		boolean actual = iv.check(isbn);
		
		assertTrue(actual);
	}
	
	@Test
	public void falseForInvalidISBN() {
		String isbn = "85-336-1340-4";
		boolean actual = iv.check(isbn);
		
		assertFalse(actual);
	}
}
