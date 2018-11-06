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
		String acronym = name.pickStartingLettersForAcronym(enteredName);	
		
		return acronym;
	}
	
	private String pickStartingLettersForAcronym(String enteredName) {
		StringBuilder buildAcronym = new StringBuilder();
		
		for(int i = 0; i < enteredName.length(); i++) {
			char letter = enteredName.charAt(i);		
			
			if(i == 0 || enteredName.charAt(i-1) == ' ') {
				buildAcronym.append(letter);
			}	
		}
		
		return buildAcronym.toString();
	}
	
	public static void main(String args[]) {
		String enteredName;
		
			enteredName = JOptionPane.showInputDialog(null, "Enter a name:");
		
		JOptionPane.showMessageDialog(null, "Your acronym is: " + name.convert(enteredName));	
	}
}