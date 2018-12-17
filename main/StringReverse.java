package main;

/* Reverse a String
 * input is given
 * output via console
 */

public class StringReverse { 
	
	public static void main(String args[]) {
		String str = "This is a simple little algorithm.";
		
		System.out.println("String before: " + str);
		System.out.println("The String has " + str.length() + " letters.\n");
		
		StringReverseLogic test = new StringReverseLogic();
		String reversedString = test.reverseString(str);
		System.out.println("String afterwards: " + reversedString);
		System.out.println("The String afterwards has " + str.length() + " letters.\n");
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
}
