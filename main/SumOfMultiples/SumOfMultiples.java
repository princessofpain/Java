package main.SumOfMultiples;

import javax.swing.JOptionPane;

/* Program to calculate all multiples of a number and sum up all of them
 * Input and output with JOptionPane
 * Usage of ArrayList
 */

public class SumOfMultiples {
	
	public static void main(String[] args) {
		int number = Integer.parseInt(JOptionPane.showInputDialog("Enter a number to check it´s multiples and their sum:"));
		
		Multiples input = new Multiples(number);
		int sumOfMultiples = input.findMultiplesAndSumUp();
			
		JOptionPane.showMessageDialog(null, input.buildMessage(sumOfMultiples));
	}
}
