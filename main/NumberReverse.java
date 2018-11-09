package main;

/* Reverse an int
 * input is given
 * output is shown in the console
 *
 */

class NumberReverse {
	
	public static void main (String args[]) {
		int num = 123456;		
		NumberReverse number = new NumberReverse();
		
		number.reverseStringAndPrintInformation(num);
	}
	
	public void reverseStringAndPrintInformation(int num) {
		String str = Integer.toString(num);
		
		printOriginalStringInformation(str);
		String reversedStr = reverseString(str);
		printReversedStringInformation(reversedStr);
	}
	
	void printOriginalStringInformation(String str) {
		System.out.println("String before: " + str);
		System.out.println("The original String has " + str.length() + " letters.");
		System.out.println();
	}
	
	public String reverseString(String str) {
		StringBuilder strRev = new StringBuilder("");
		int offset = 0;
		
		for(int i = str.length()-1; i >= 0; i--) {
			strRev.insert(offset, str.charAt(i));
			offset++;
		}
		
		return strRev.toString();
	}
	
	void printReversedStringInformation(String reversedStr) {
		int numRev = Integer.parseInt(reversedStr.toString());		
		System.out.println("String afterwards: " + numRev);
		System.out.println("The reversed String has " + reversedStr.length() + " letters.");
	}
}
