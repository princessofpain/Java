package main;

import javax.swing.JOptionPane;

/* Program to calculate the difference in the square of the sum and the sum of the squares of n natural numbers 
 * input and output via JOptionPane
 */

public class DifferenceOfSquares {
	
	public int calculateSquareOfSum(int num) {
		int result = 0;
		
		for(int i = 1; i <= num; i++) {
			result += i;
			
			if(i == num) 
				result = (int) Math.pow(result, 2);
		}
		
		return result;
	}
	
	public int calculateSumOfSquares(int num) {
		int result = 0;
		
		for(int i = 1; i <= num; i++) {
			result += Math.pow(i, 2);
		}
		
		return result;
	}
	
	public int differenceOfResults(int num) {
		int squareOfSum = calculateSquareOfSum(num);
		int sumOfSquares = calculateSumOfSquares(num);
		int result;
		
		if(squareOfSum > sumOfSquares) {
			result = squareOfSum - sumOfSquares;
		} else {
			result = sumOfSquares - squareOfSum;
		}
		System.out.println(result);
		
		return result;
	}

	public static void main(String[] args) {
		DifferenceOfSquares num1 = new DifferenceOfSquares();		
		String input = JOptionPane.showInputDialog("Enter a number to calculate the differences of the Squares:");
		int number = Integer.parseInt(input);
		
		JOptionPane.showMessageDialog(null, "The result is: " + num1.differenceOfResults(number));
	}

}
