package main;

/* Reverse a String
 * input is given
 * output is shown in the console
 * String is reversed by using StringBuilder.reverse()
 */

public class NumberReverse2 {
	
	public static void main (String args[]) {
		int num = 12345678;
		String str = Integer.toString(num);
		NumberReverse2 number = new NumberReverse2();
		
		number.reverseStringAndPrintInformation(str);
	}
	
	public void reverseStringAndPrintInformation(String str) {
		printOriginalInformation(str);
		
		String reversedString = reverseString(str);
		printReversedInformation(reversedString);
		
	}
	
	void printOriginalInformation(String str) {
		System.out.println("String before: " + str);
		System.out.println("The original String has " + str.length() + " letters.");
		System.out.println();
	}
	
	public String reverseString(String str) {
		StringBuilder reversedStr = new StringBuilder(str);	
		reversedStr.reverse();
		return reversedStr.toString();
	}
	
	void printReversedInformation(String str) {
		System.out.println("String afterwards: " + str);
		System.out.print("The reversed String has " + str.length() + " letters.");
	}
}
