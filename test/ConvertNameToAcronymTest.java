package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import main.StringToAcronym.ConvertNameToAcronym;

class ConvertNameToAcronymTest {
	
	private ConvertNameToAcronym name = new ConvertNameToAcronym();
	
	@Test 
	void nameIsNotConvertedToNull() {
		String nameToConvert = "Heidi Müller";
		String actualResult = name.convert(nameToConvert);

		assertNotNull(actualResult);
	}
	
	@Test
	void acronymHasAllStartingLetters() {
		String nameToConvert = "Heidi Müller";

		String actualResult = name.convert(nameToConvert);		
		String expectedResult = "HM";
		
		assertEquals(expectedResult, actualResult);
	}

	@Nested
	class checkInputValidity {
		
		@Test
		void isNull() {
			String nameToConvert = null;
			String actualResult = name.convertNameIfCheckIsPassed(nameToConvert);
			String expectedResult = "This is not a correct name. Please enter a name and a surname. Leave out name suffixes.";
			
			assertEquals(expectedResult, actualResult);
		}
		
		@Test
		void hasZeroLength() {
			String nameToConvert = "";
			String actualResult = name.convertNameIfCheckIsPassed(nameToConvert);
			String expectedResult = "This is not a correct name. Please enter a name and a surname. Leave out name suffixes.";
			
			assertEquals(expectedResult, actualResult);
		}
		
		@Test
		void isNotNumeric() {
			String nameToConvert = "123";
			String actualResult = name.convertNameIfCheckIsPassed(nameToConvert);
			String expectedResult = "This is not a correct name. Please enter a name and a surname. Leave out name suffixes.";
			
			assertEquals(expectedResult, actualResult);
		}
		
		@Test
		void hasNameAndSurname() {
			String nameToConvert = "";
			String actualResult = name.convertNameIfCheckIsPassed(nameToConvert);
			String expectedResult = "This is not a correct name. Please enter a name and a surname. Leave out name suffixes.";
			
			assertEquals(expectedResult, actualResult);
		}
		
		@Test
		void hasLessThanTwoSpaces() {
			String nameToConvert = "Barbara de Greus";
			String actualResult = name.convertNameIfCheckIsPassed(nameToConvert);
			String expectedResult = "This is not a correct name. Please enter a name and a surname. Leave out name suffixes.";
			
			assertEquals(expectedResult, actualResult);
		}
	}
}
