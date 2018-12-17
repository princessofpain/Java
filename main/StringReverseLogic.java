package main;

/* Reverse a String with StringBuilder method reverse()
 * input is given
 * output via console
 */

public class StringReverseLogic { 
	
	String reverseStringAndCreateResultMessage(String str) {
		String reversedString = reverseString(str);
		return "This is your reversed String: " + reversedString;
	}
	
	public String reverseString(String str) {
		StringBuilder strRev = new StringBuilder(str);
		strRev.reverse();
		
		return strRev.toString();
	}
}
