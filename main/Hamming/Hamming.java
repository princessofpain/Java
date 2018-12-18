package main.Hamming;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/* program to compare two DNA strings and mark the differences
 * output via console and JOptionPane
 * input via JOption Pane
 * differences of the Strings are marked with a "^"
 * similarities are not marked
 * Strings for the dna:
 * dna1 = "GAGCCTACTAACGGGAT";
 * dna2 = "CATCGTAATGACGGCCT";
 * */
 
public class Hamming {	
	
	public static void main(String args[]) {
		String dna1 = JOptionPane.showInputDialog(null, "Enter the first DNA String:");
		String dna2 = JOptionPane.showInputDialog(null, "Enter the second DNA String:");
		
		Hamming dnaComparison = new Hamming();		
		String result = dnaComparison.compare(dna1, dna2);
		dnaComparison.showResultMessage(dna1, dna2, result);
	}
	
	public String compare(String dna1, String dna2) {
		if(handleErrors(dna1, dna2)) return null;
		
		StringBuilder result = new StringBuilder();
		
		for(int i = 0; i < dna1.length(); i++) {			
			if(dna1.charAt(i) == dna2.charAt(i)) {
				result.append("  ");
			} else {
				result.append("^ ");
			}
		}
		
		String resultString = result.toString();
		return resultString;
	}
	
	public boolean handleErrors(String dna1, String dna2) {
		if(dna1.length() != dna2.length()) {
			showErrorMessage();
			return true;
		} else {
			return false;	
		}
	}
	
	void showErrorMessage() {
		JFrame frame = new JFrame("JOptionPane");
		JOptionPane.showMessageDialog(frame, "The strings have different lengths!", "Error", 0);
	}
	
	void showResultMessage(String dna1, String dna2, String result) {
		JFrame frame = new JFrame();
		JOptionPane.showMessageDialog(frame, dna1 + "\n" + dna2 + "\n" + result);
	}
}

