package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.ProteinTranslation;

public class ProteinTranslationTest {
	
	ProteinTranslation sequence = new ProteinTranslation();
	
	@Test
	public void sequencesAndStopAreIdentified() {
		String str = "";
		String expected = "";
		String actual = sequence.RNAToProteins(str);
		
		assertEquals(expected, actual);
	}
}
