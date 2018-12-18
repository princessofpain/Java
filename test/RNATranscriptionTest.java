package test;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import main.RNATranscription.RNATranscription;

public class RNATranscriptionTest {
	
	RNATranscription rnaToDna = new RNATranscription();
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private final PrintStream originalOut = System.out;
	private String rna = "A C T G G A T C G T T A"; 
	private String dna = "U G A C C U A G C A A U ";
	
	@Before
	public void setUpStream() {
		System.setOut(new PrintStream(outContent));
	}
	
	@After
	public void restoreStream() {
		System.setOut(originalOut);
	}
	
	@Test
	public void rnaIsTranscripted() {
		String expected = dna;
		String actual = rnaToDna.transcript(rna);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void resultMessageIsPrinted() {
		rnaToDna.printResult(rna, dna);		
		String expected = "This is the rna: A C T G G A T C G T T A\r\nThis is the dna: U G A C C U A G C A A U \r\n";
		String actual = outContent.toString();
		
		assertEquals(expected, actual);
	}
}
