package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.ConvertNameToAcronym;

class ConvertNameToAcronymTest {
	
	private ConvertNameToAcronym name = new ConvertNameToAcronym();
	
	@Test 
	void nameIsNotConvertedToNull() {
		String nameToConvert = "Heidi Müller";
		String actualAcronymResult = name.isConvertedToAcronym(nameToConvert);

		assertNotNull(actualAcronymResult);
	}
	
	@Test
	void acronymHasAllStartingLetters() {
		String nameToConvert = "Heidi Müller";
		String actualAcronymResult = name.isConvertedToAcronym(nameToConvert);		
		String expectedAcronymResult = "HM";
		
		assertEquals(expectedAcronymResult, actualAcronymResult);
	}

}
