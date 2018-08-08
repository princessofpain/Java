package main;

import javax.swing.JOptionPane;

/* program to check if a given number is an Armstrong number (a  number, which is the result of multiplying all digits like this: digit^index of the digit)
 * input is given
 * output via console
 */

public class CheckForArmstrongNumber {
	
	private static CheckForArmstrongNumber number = new CheckForArmstrongNumber();
	
	public String check(String enteredNumber) {
		int[] allDigits = number.splitNumberInSingleDigits(enteredNumber);
		int result = number.calculateSumToCheck(allDigits);
		String message = number.returnResultMessageOfCheck(result,enteredNumber);
		
		return message;
	}
	
	private int[] splitNumberInSingleDigits(String enteredNumber) {
		int digits[] = new int[enteredNumber.length()];
		
		for(int i = 0; i < digits.length; i++) {
			digits[i] = Integer.parseInt(enteredNumber.substring(i, i+1));
		}
		
		return digits;
	}
	
	public int calculateSumToCheck(int[] digits) {
		int result = 0;
		
		for(int i = 0; i < digits.length; i++) {
			result = result + (int) Math.pow((double) digits[i], (double) digits.length - 0);
		}
		
		return result;
	}
	
	private String returnResultMessageOfCheck(int result, String enteredNumber) {		
		if(result == Integer.parseInt(enteredNumber)) {
			return "The number " + enteredNumber + " is an armstrong number!";
		} else {
			return "The number " + enteredNumber + " is not armstrong number, the result is: " + result + ".";
		}
	}
	
	public static void main(String[] args) {	
		String enteredNumber = JOptionPane.showInputDialog("Enter a number to check if it is an Armstrong Number:");
		String resultMessage = number.check(enteredNumber);
		
		JOptionPane.showMessageDialog(null, resultMessage);
	}

}
