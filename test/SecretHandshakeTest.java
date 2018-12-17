package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.SecretHandshakeLogic;

class SecretHandshakeTest {
	
	private SecretHandshakeLogic logic = new SecretHandshakeLogic();

	@Test
	void binaryIsCorrect() {
		String expected = "100110110";
		String actual = logic.decimalToBinary(294);
		
		assertEquals(expected, actual);
	}

}
