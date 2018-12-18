package main.Pangram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* Check a String if it´s a Pangram (a sentence, that contains all letters of the alphabet at least one time)
 * Input manually
 * Output in the console
 */

public class Pangram {
	
	public static void main(String[] args) {
		String str = "This sentence, that I wrote, has a lot of - how to call that... - Non-letters?";
		Pangram p = new Pangram();
		p.checkForPangram(str);
	}
	
	public void checkForPangram(String str) {
		char[] strToArray = cleanUpStringAndBuildArray(str);
		checkResult(strToArray, str);
	}
	
	public char[] cleanUpStringAndBuildArray(String str) {
		char[] strToArray = new char[26];
		
		for(int i = 0, indexToAddChar = 0; i < str.length(); i++) {
			char letter = Character.toLowerCase(str.charAt(i));
			
			if(isValid(letter, strToArray)) {
				strToArray = addChar(strToArray, letter, indexToAddChar);
				indexToAddChar++;
			} 
		}		
		return strToArray;
	}
	
	void checkResult(char[] strToArray, String str) {
		System.out.println("Your sentence is: " + str);

		Arrays.sort(strToArray);
		printResult(strToArray);
	}
	
	boolean isValid(char letter, char[] allLetters) {
		List<String> list = buildList(allLetters);
		String letterObject = Character.toString(letter);
		
		if(letter >= 'a' && letter <= 'z' && !list.contains(letterObject)) {
			return true;
		} else {
			return false;
		}
	}
	
	char[] addChar(char[] strToArray, char letter, int i) {
		
		for(int a = 0, counter = 0; a < strToArray.length; a++) {
			
			if(letter != strToArray[a]) {
				if(counter == strToArray.length - 1) {
					strToArray[i] = letter;
				}
				counter++;
			}
		}
		return strToArray;
	}
	
	void printResult(char[] strToArray) {
		if(strToArray[25] == 'z' && strToArray[0] == 'a') {
			System.out.print("This is a Pangram!");
		} else {
			System.out.print("This is not a Pangram, there are letters missing...");
		}
	}
	
	List<String> buildList(char[] allLetters) {
		List<String> list = new ArrayList<String>();
		
		for(char singleLetter: allLetters) {
			list.add(Character.toString(singleLetter));
		}
		
		return list;
	}
}


