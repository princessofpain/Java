package main.ISBNVerifier;

import javax.swing.JOptionPane;

/* Program to check if a ISBN number is a valid ISBN-10
 * Input and output with JOptionPane
 */

public class ISBNVerifier {
	
	public static void main(String args[]) {
		String str = JOptionPane.showInputDialog("Enter an ISBN-10 number to check if it´s valid:");
		ISBNVerifier isbn = new ISBNVerifier();
		boolean isValidISBN = isbn.check(str);
		
		if(isValidISBN) {
			JOptionPane.showMessageDialog(null, str + " is a valid ISBN-10 number.");
		} else {
			JOptionPane.showMessageDialog(null, str + " is not a valid ISBN-10  number!");
		}
	}
	
	public boolean check(String isbn) {		
		int factor = calculateFactor(isbn);
		int verificationDigit = assignVerificationDigit(isbn);
		int total = factor + verificationDigit;
		System.out.println(factor);
		boolean isValidISBN = validate(total);
		
		return isValidISBN;
	}
	
	public int calculateFactor(String isbn) {
		int result = 0;
		
		for(int i = 0, b = 10; i < isbn.length() - 1; i++) {
			char a = isbn.charAt(i); 
			int digit = Character.getNumericValue(a);
			
			if(digit < 0) {
				result += 0;
			} else if (digit >= 0 || digit <= 10) {
				result += digit * b;
				b--;
			}
		}
		
		return result;
	}
	
	public int assignVerificationDigit(String isbn) {
		char verificationChar = isbn.charAt(isbn.length()-1);
		int verificationDigit;
		
		if(verificationChar == 'X') {
			verificationDigit = 10;
		} else {
			verificationDigit = Character.getNumericValue(verificationChar);
		}
		
		return verificationDigit;
	}
	
	boolean validate(int total) {
		if(total % 11 == 0) {
			return true;
		} else {
			return false;
		}
	}
}
