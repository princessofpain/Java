package main;

import javax.swing.JOptionPane;

/* Program to generate the acronym of a given name
 * starting letters are detected by checking an empty space before them as condition (not case sensitive)
 * input and output via JOptionPane
 */

public class ConvertNameToAcronym {
	
	private static ConvertNameToAcronym name = new ConvertNameToAcronym();
	
	public String convert(String enteredName) {
		enteredName.toLowerCase();
		String acronym = name.pickStartingLettersForAcronym(enteredName).toUpperCase();
		
		return acronym;
	}
	
	String pickStartingLettersForAcronym(String enteredName) {
		StringBuilder buildAcronym = new StringBuilder();
		
		for(int i = 0; i < enteredName.length(); i++) {
			char letter = enteredName.charAt(i);		
			
			if(i == 0 || enteredName.charAt(i-1) == ' ') {
				buildAcronym.append(letter);
			}	
		}
		
		return buildAcronym.toString();
	}
	
	public String convertNameIfCheckIsPassed(String enteredName) {
		if(name.isNotNull(enteredName) && name.isLongerThanZero(enteredName) && name.isNotNumeric(enteredName)
				&& name.hasNameAndSurname(enteredName) && name.hasLessThanThreeSpaces(enteredName)) {
			return "Your acronym is: " + name.convert(enteredName);
		} else {
			return "This is not a correct name. Please enter a name and a surname. Leave out name suffixes.";
		}
	}
	
	private boolean isNotNull(String enteredName) {
		if(enteredName == null) {
			return false;
		} else {
			return true;
		}
	}
	
	private boolean isLongerThanZero(String enteredName) {
		if(enteredName.length() == 0) {
			return false;
		} else {
			return true;
		}
	}
	
	private boolean isNotNumeric(String enteredName) {
		for(int i = 0; i < enteredName.length(); i++) {
			if(enteredName.charAt(i) >= 0 && enteredName.charAt(i) <= 9) {
				return false;
			}
		}
		
		return true;
	}
	
	private boolean hasNameAndSurname(String enteredName) {
		for(int i = 0; i < enteredName.length(); i++) {
			if(enteredName.charAt(i) == ' ') {
				return true;
			}
		}
		
		return false;
	}
	
	private boolean hasLessThanThreeSpaces(String enteredName) {
		int numberOfSpaces = 0;
		
		for(int i = 0; i < enteredName.length(); i++) {
			if(enteredName.charAt(i) == ' ') {
				numberOfSpaces++;
			}
		}
		
		if(numberOfSpaces < 2) {
			return true;
		} else {
			return false;
		}
	}
	
	public static void main(String args[]) {
		String enteredName = JOptionPane.showInputDialog(null, "Enter a name:");
		String message = name.convertNameIfCheckIsPassed(enteredName);

		JOptionPane.showMessageDialog(null, message);				
	}
}