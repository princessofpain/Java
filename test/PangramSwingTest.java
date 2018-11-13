package test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import main.PangramSwing;

public class PangramSwingTest {
	
	PangramSwing p = new PangramSwing();
	
	@Test
	public void pangramIsIdentified() {
		char[] allLetters = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
		boolean actual = p.checkString(allLetters);
		
		assertTrue(actual);
	}

	@Test
	public void nonPangramIsIdentified() {
		char[] allLetters = new char[26];
		allLetters[0] = 'a';
		allLetters[1] = 'z';
		boolean actual = p.checkString(allLetters);
		
		assertFalse(actual);
	}
}
