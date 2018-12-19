package main.SumOfMultiples;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/* Program to calculate all multiples of a number and sum up all of them
 * Input and output with JOptionPane
 * Usage of ArrayList
 */

public class SumOfMultiples {
	
	public static void main(String[] args) {
		JTextField numberTxt = new JTextField();
		JTextField limitTxt = new JTextField();
		Object[] message = { "Enter a number",
							 numberTxt,
							 "Enter a limit",
							 limitTxt };
		JOptionPane pane = new JOptionPane(message, JOptionPane.PLAIN_MESSAGE);
		pane.createDialog(null, "Find Multiples and their sum").setVisible(true);
		
		int number = Integer.parseInt(numberTxt.getText());
		int limit = Integer.parseInt(limitTxt.getText());
		
		Multiples input = new Multiples(number, limit);
		int sumOfMultiples = input.findMultiplesAndSumUp();

		JTextArea txtArea = new JTextArea(15,50);
		txtArea.setText(input.buildMessage(sumOfMultiples));
		txtArea.setEditable(false);
		JScrollPane scrollPane = new JScrollPane(txtArea);
		JOptionPane.showMessageDialog(null, scrollPane);
	}
}
