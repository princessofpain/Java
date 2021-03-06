package test;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import main.NumberReverse.NumberReverse;

public class NumberReverseTest {
	
	NumberReverse number = new NumberReverse();
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
	public void stringIsReversed() {
		String str = "0123456";
		String expected = "6543210";
		String actual = number.reverseString(str);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void informationIsPrinted() {
		int num = 123;
		number.reverseStringAndPrintInformation(num);
		
		String expected = "String before: 123\r\nThe original String has 3 letters.\r\n\r\nString afterwards: 321\r\nThe reversed String has 3 letters.";
		String actual = outContent.toString();
		
		assertEquals(expected, actual);
	}
}
