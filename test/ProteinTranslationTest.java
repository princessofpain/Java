package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.ProteinTranslation;

public class ProteinTranslationTest {
	
	ProteinTranslation sequence = new ProteinTranslation();
	
	@Test
	public void sequencesAndStopAreIdentified() {
		String str = "UCAUGGUUUUCCUAUUGA";
		String expected = "Serine, Tryptophan, Phenylalanine, Serine, Tyrosine, STOP";
		String actual = sequence.toProteins(str);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void firstProteinIsIsolated() {
		String str = "UCAUGGUUUUCCUAUUGA";
		int index = 0;
		String expected = "UCA";
		String actual = sequence.isolateSingleProtein(str, index).toString();
				
		assertEquals(expected, actual);
	}
	
	@Test
	public void secondProteinIsIsolated() {
		String str = "UCAUGGUUUUCCUAUUGA";
		int index = 3;
		String expected = "UGG";
		String actual = sequence.isolateSingleProtein(str, index).toString();
				
		assertEquals(expected, actual);
	}
}
