package test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import main.Pangram.Pangram;

public class PangramTest {
	
	Pangram test = new Pangram();
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private final PrintStream originalOut = System.out;
	
	@Before
	public void setUpStream() {
		System.setOut(new PrintStream(outContent));
	}
	
	@After
	public void restoreStream() {
		System.setOut(originalOut);
	}
	
	@Test
	public void pangramIsValid() {
		String str = "Sphinx of black quartz, judge my vow.";
		String expected = "Your sentence is: Sphinx of black quartz, judge my vow.\r\nThis is a Pangram!";
		
		test.checkForPangram(str);
		String actual = outContent.toString();
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void pangramIsNotValid() {
		String str = "This is a program to check a String for being a pangram.";
		String expected = "Your sentence is: This is a program to check a String for being a pangram.\r\nThis is not a Pangram, there are letters missing...";
		
		test.checkForPangram(str);
		String actual = outContent.toString();
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void nonLettersAreRemoved() {
		String str = "This sentence, that I wrote, has a lot of - how to call that... - Non-letters?";
		char[] expected = new char[26];
		expected[0] = 't';
		expected[1] = 'h';
		expected[2] = 'i';
		expected[3] = 's';
		expected[4] = 'e';
		expected[5] = 'n';
		expected[6] = 'c';
		expected[7] = 'a';
		expected[8] = 'w';
		expected[9] = 'r';
		expected[10] = 'o';
		expected[11] = 'l';
		expected[12] = 'f';		
		char[] actual = test.cleanUpStringAndBuildArray(str);
		
		assertArrayEquals(expected, actual);
	}
}
