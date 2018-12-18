package main.AliquotSum;

import javax.swing.JOptionPane;

/* Program to check if a number is perfect, abundant or deficient based on its aliquot sum (Nicomachus classification scheme for natural numbers)
 * input and output with JOptionPane
 */

public class AliquotSum {
		
	public String showNumberTypeOf(int num, AliquotSum guess) {		
		if(guess.isANaturalNumber(num)) {
			int result = guess.calculateResult(num);
			return guess.checkAliquotSumOf(num, result);
		} else {
			return guess.isAnError(num);
		}		
	}
	
	private boolean isANaturalNumber(int num) {
		if(num < 1) {
			return false;
		} else {
			return true;
		}
	}
	
	public int calculateResult(int num) {	
		int result = 0;
		
		for(int i = 1; i < num; i++) {
			if(num % i == 0) {
				result += i;
			}
		}
		return result;
	}
	
	public String checkAliquotSumOf(int num, int result) {
		String perfect = num + " is a perfect number!";
		String abundant = num + " is an abundant number.";
		String deficient = num + " is a deficient number.";
		
		if(result == num) {
			return perfect;
		} else if(result > num) {
			return abundant;
		} else {
			return deficient;
		}
	}
	
	private String isAnError(int num) {
		String error = num + " is not a natural number";
		return error;
	}
	
	public static void main(String args[]) {
		int number = Integer.parseInt(JOptionPane.showInputDialog("Enter a natural number to check if it´s a perfect number:"));
		AliquotSum thisGuess = new AliquotSum();
		String numberType = thisGuess.showNumberTypeOf(number, thisGuess);

		JOptionPane.showMessageDialog(null, numberType);
	}
}