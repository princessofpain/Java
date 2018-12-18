package main.SumOfMultiples;

import java.util.ArrayList;

public class Multiples {
	int num = 0;
	ArrayList<Integer> multiples;
	
	public Multiples(int num) {
		this.num = num;
	}
	
	int findMultiplesAndSumUp() {
		multiples = findMultiples();
		return calculateSum();
	}
	
	public ArrayList<Integer> findMultiples() {
		ArrayList<Integer> allMultiples = new ArrayList<Integer>();
		
		if(num == 0) {
			return allMultiples;
		}
		
		for(int i = 2; i < num; i++) {
			if(num % i == 0) {
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
		
		for(int multiple : multiples) {
			message.append(multiple + " ");
		}
		
		message.append("\n\nThe sum of all multiples is:\n" + sumOfMultiples);		
		return message.toString();
	}
}
