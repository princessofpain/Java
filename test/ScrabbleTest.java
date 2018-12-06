package test;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import main.Scrabble;

public class ScrabbleTest {
	
	Scrabble game = new Scrabble();
	String input = "test";
	final ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());

	@Before
	public void setUpInputStream() {
		System.setIn(in);
	}
	
	@After
	public void restoreInputStream() {
		System.setIn(System.in);
	}
	
	@Test
	public void consoleInputIsCorrect() {
		String expected = "test";
		String actual = game.enterWordWithConsoleInput();
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void scoreCalculationIsCorrect() {
		String input = "testword";
		int expected = 12;
		int actual = game.calculateScoreOf(input);
		
		assertEquals(expected, actual);
	}
}
