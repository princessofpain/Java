package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.Proverbs.ProverbsLogic;

class ProverbsTest {
	
	ProverbsLogic logic = new ProverbsLogic();
	
	@Test
	void tokensAreSeperated() {
		String words = "This is a test";
		String[] expected = { "This", "is", "a", "test" };
		String[] actual = logic.separate(words);
		
		assertArrayEquals(expected, actual);
	}
	
	@Test
	void arrayLengthIsZeroForOddNumberOfTokens() {
		String words = "This is an odd test";
		String[] expected = {};
		String[] actual = logic.separate(words);
		
		assertArrayEquals(expected, actual);
	}
	
	@Test
	void numberOfTokensIsCorrect() {
		String words = "This is an odd test";
		int expected = 5;
		int actual = logic.countTokens(words);
		
		assertEquals(expected, actual);
	}
	
	@Test
	void wordsAreProcessedToProverbs() {
		String[] allWords = { "1", "2", "3", "4", "5", "6" };
		String expected = "For want of a 1 the 2 was lost.\r\nFor want of a 3 the 4 was lost.\r\nFor want of a 5 the 6 was lost.\r\n";
		String actual = logic.processWordsToProverbs(allWords);
		
		assertEquals(expected, actual);
	}
}
