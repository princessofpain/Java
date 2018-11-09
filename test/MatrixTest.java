package test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import main.Matrix;

public class MatrixTest {
	
	Matrix ma = new Matrix();
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
	public void matrixArrayIsWrittenInTheConsole() {
		String str = "1 2 3456 7  8 9";
		ma.buildMatrixArray(str);
		String expected = "1 2 3\n4 5 6\n7 8 9\n";
		String actual = outContent.toString();
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void stringIsCleanedUp() {
		String str = "1 2 3456 7  8 9";
		String expected = "123456789";
		String actual = ma.removeAllUnecessaryCharacters(str).toString();
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void matrixArrayIsCreated() {
		StringBuilder input = new StringBuilder("123456789");
		char[][] expected = {
				{'1', '2', '3'},
				{'4', '5', '6'},
				{'7', '8', '9'},
		};
		char[][] actual = ma.createMatrixArray(input);
		
		assertArrayEquals(expected, actual);
	}
}
