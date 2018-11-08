package main;

import javax.swing.JOptionPane;

/*	Program to check if a number is valid with the Luhn Algorithm (credit cards, some account numbers of banks or social security numbers of Canada)
 * 	Output and input with JOptionPane
 */

public class LuhnAlgorithm {
	
	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("Please enter your credit card number:");
		LuhnAlgorithm number = new LuhnAlgorithm();
		String resultMessage = number.resultOfLuhnCheck(input);

		JOptionPane.showMessageDialog(null, input + resultMessage);
	}
	
	public String resultOfLuhnCheck(String input) {
		String parsedInput = cleanUpAndCheckLengthOf(input);
		String resultMessage;
		
		if(parsedInput == "error") {
			resultMessage = "This number is too short. Please enter a number with at least 2 digits.";
			return resultMessage;
		}
		
		String preparedInput = exchangeDigitsOf(parsedInput);
		boolean restIsZero = sumUpAndCheckModuloOf(preparedInput);		
		resultMessage = createResultMessage(restIsZero);
		
		return resultMessage;
	}
	
	private String cleanUpAndCheckLengthOf(String input) {
		String parsedInput = parse(input);
		
		if(!lengthIsCorrect(parsedInput)) {
			parsedInput = "error";
		};
		
		return parsedInput;
	}
	
	private String exchangeDigitsOf(String input) {
		StringBuilder digitsExchanged = new StringBuilder(input);
		int result = 0;
		
		for(int i = input.length() - 2; i >= 0; i -= 2) {
			int digit = Character.getNumericValue(input.charAt(i));
			result = digit + digit;
			result = addCrossNumber(result);
			digitsExchanged.replace(i, i + 1, Integer.toString(result));
		}
		
		return digitsExchanged.toString();
	}
	
	private boolean sumUpAndCheckModuloOf(String preparedInput) {
		int result = 0;
		
		for(int i = 0; i < preparedInput.length(); i++) {
			int digitToSum = Character.getNumericValue(preparedInput.charAt(i));
			result += digitToSum;
		}
		
		boolean isValid = checkModuloOf(result);
		return isValid;
	}
	
	private String createResultMessage(boolean restIsZero) {
		String resultMessage;
		
		if(restIsZero) {
			resultMessage = " is a valid number.";
		} else {
			resultMessage = " is not a valid number!";
		}
		
		return resultMessage;
	}
	
	private String parse(String input) {
		StringBuilder cleanedInput = new StringBuilder();
		
		for(int i = 0; i < input.length(); i++) {
			if(input.charAt(i) >= '0' && input.charAt(i) <= '9') 
				cleanedInput.append(input.charAt(i));
		}
		
		return cleanedInput.toString();
	}
	
	private boolean lengthIsCorrect(String parsedString) {
		if(parsedString.length() > 1) {
			return true;
		} else {
			return false;
		}
	}
	
	private int addCrossNumber(int result) {
		if(result > 9) {
			return calculateCrossNumber(result);
		} else {
			return result;	
		}
	}
	
	private boolean checkModuloOf(int result) {
		if(result % 10 == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	private int calculateCrossNumber(int result) {
		String digits = Integer.toString(result);
		result = 0;
		
		for(int a = 0; a < digits.length(); a++) {
			int digitNew = Character.getNumericValue(digits.charAt(a));
			result += digitNew;
		}
		
		return result;
	}
}
