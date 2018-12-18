package main.Proverbs;

import java.util.Scanner;

public class ProverbsLogic {
	public String[] separate(String words) {
		int numberOfTokens = countTokens(words);
		
		if(isOdd(numberOfTokens)) {
			String[] noEvenInput = new String[0];
			return noEvenInput;
		}
		
		String[] allTokens = buildArray(words, numberOfTokens);
		return allTokens;
	}
	
	String displayResultOf(String[] allWords) {
		String oddNumberMessage = "Please enter an even number of words!";
		
		if(allWords.length == 0) {
			return oddNumberMessage;
		} else {
			return processWordsToProverbs(allWords);
		}
	}
	
	public int countTokens(String words) {
		Scanner scan = new Scanner(words);
		int howManyWords = 0;
		
		for(int i = 0; i < words.length(); i++) {
			if(scan.hasNext())  {
				howManyWords++;
				// scanner has to be moved to the next token
				scan.next();
			}
		}
		// scanner has to be closed or to be reset
		scan.close();
		
		return howManyWords;
	}

	boolean isOdd(int numberOfTokens) {
		if(numberOfTokens % 2 != 0) {
			return true;
		} else {
			return false;
		}
	}
	
	String[] buildArray(String words, int numberOfTokens) {
		Scanner scan2 = new Scanner(words);
		String allWords[] = new String[numberOfTokens];
		
		for(int i = 0; i < numberOfTokens; i++) {
			if(scan2.hasNext()) {
				allWords[i] = scan2.next().toString();
			}
		}
		
		scan2.close();
		return allWords;
	}
	
	public String processWordsToProverbs(String[] allWords) {
		String[] proverb = buildProverb(allWords);
		StringBuilder allProverbs = new StringBuilder();
		
		for(int i = 0; i < allWords.length; i += 2) {
			allProverbs.append(proverb[i]);
		}
		
		return allProverbs.toString();
	}
	
	String[] buildProverb(String[] str) {
		String[] proverbsArray = new String[str.length];
		
		for(int i = 0; i < str.length; i+= 2) {
			StringBuilder proverbs = new StringBuilder();
			String word1 = str[i];
			String word2 = str[i+1];
			
			proverbs.append("For want of a " + word1 + " the " + word2 + " was lost.\r\n");
			proverbsArray[i] = proverbs.toString();
		}
		
		return proverbsArray;
	}
}
