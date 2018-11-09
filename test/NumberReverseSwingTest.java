package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.NumberReverseSwing;

public class NumberReverseSwingTest {
	
	NumberReverseSwing nrs = new NumberReverseSwing();
	
	@Test
	public void stringIsReversed() {
		String str = "9876543210";
		String expected = "0123456789";
		String actual = nrs.reverse(str);
		
		assertEquals(expected, actual);
	}
}
