package main.SumOfMultiples;

import java.util.ArrayList;

public class Multiples {
	int num = 0;
	int limit;
	ArrayList<Integer> multiples;
	
	public Multiples(int num, int limit) {
		this.num = num;
		this.limit = limit;
	}
	
	public int findMultiplesAndSumUp() {
		multiples = findMultiples();
		return calculateSum();
	}
	
	public ArrayList<Integer> findMultiples() {
		ArrayList<Integer> allMultiples = new ArrayList<Integer>();
		
		for(int i = num; i <= limit; i++) {
			if(i % num == 0) {
				allMultiples.add(i);	
			}
		}	
		
		return allMultiples;
	}
	
	int calculateSum() {
		int result = 0;
		
		for (int multiple : multiples) {
			result += multiple;
		}
		
		return result;
	}
	
	String buildMessage(int sumOfMultiples) {
		StringBuilder message = new StringBuilder("The multiples of " + num + " are:\n");
		int counter = 0;
		
		for(int multiple : multiples) {
			message.append(multiple + " ");
			checkLengthForLineBreak(message, counter);
			counter++;
		}
		
		message.append("\n\nThe sum of all multiples is:\n" + sumOfMultiples);		
		return message.toString();
	}
	
	StringBuilder checkLengthForLineBreak(StringBuilder message, int counter) {
		if(counter % 20 == 0 && counter > 0) {
			message.append("\n");
		}
		
		return message;
	}
}
