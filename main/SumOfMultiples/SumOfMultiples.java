package main.SumOfMultiples;

import java.util.ArrayList;

import javax.swing.JOptionPane;

/* Program to calculate all multiples of a number and sum up all of them
 * Input and output with JOptionPane
 * Usage of ArrayList
 */

public class SumOfMultiples {
	
	public static void main(String[] args) {
		int number = Integer.parseInt(JOptionPane.showInputDialog("Enter a number to check it´s multiples and their sum:"));
		SumOfMultiples input = new SumOfMultiples();
		Integer[] multiples = input.findMultiples(number);
		int result = input.calculateSum(multiples);
			
		JOptionPane.showMessageDialog(null, input.buildMessage(multiples, result, number));
	}
	
	Integer[] findMultiples(int num) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		for(int i = 2; i < num; i++) {
			if(num % i == 0) 
				numbers.add(i);
		}	
		
		Integer[] allMultiples = new Integer[numbers.size()];
		allMultiples = numbers.toArray(allMultiples);
		return allMultiples;
	}
	
	int calculateSum(Integer[] multiples) {
		int result = 0;
		
		for (int number : multiples) {
			result += number;
		}
		
		return result;
	}
	
	String buildMessage(Integer[] multiples, int result, int number) {
		StringBuilder message = new StringBuilder("The multiples of " + number + " are:\n");
		
		for(int multiple : multiples) {
			message.append(multiple + ", ");
		}
		
		message.append("\n\nThe sum of all multiples is:\n" + result);		
		return message.toString();
	}

}
