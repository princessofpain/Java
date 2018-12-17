package test;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import main.StringReverseLogic;
import main.StringReverseLogic;

public class StringReverseTest {
	
	@Test
	void stringReverseWorks() {
		StringReverseLogic test = new StringReverseLogic();
		String str = "This is a string.";
		String expected =".gnirts a si sihT";
		String actual = test.reverseString(str);
		
		assertEquals(expected, actual);
	}
	
	@Test
	void stringReverse2Works() {
		StringReverseLogic test = new StringReverseLogic();
		String str = "This is a string.";
		String expected =".gnirts a si sihT";
		String actual = test.reverseString(str);
		
		assertEquals(expected, actual);
	}
}
