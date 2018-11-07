package main;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

/* Program to calculate all factors of a number
 * input and output via Swing
 */

public class FactorRaindrops extends JFrame {

	private JPanel contentPane;
	private JTextField number;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FactorRaindrops frame = new FactorRaindrops();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FactorRaindrops() {
		setTitle("Factors of a number");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 243);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEnterANumber = new JLabel("Enter a number:");
		lblEnterANumber.setBounds(10, 33, 97, 14);
		contentPane.add(lblEnterANumber);
		
		number = new JTextField();
		number.setBounds(105, 30, 55, 20);
		contentPane.add(number);
		number.setColumns(10);
		
		JTextArea result = new JTextArea();
		result.setWrapStyleWord(true);
		result.setLineWrap(true);
		result.setBackground(UIManager.getColor("Button.background"));
		result.setEditable(false);
		result.setBounds(10, 72, 412, 121);
		contentPane.add(result);
		
		JButton btnCalculateFactors = new JButton("Calculate factors");
		btnCalculateFactors.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num = Integer.parseInt(number.getText());
				
				result.setText("The factors of " + num + " are: " + calculateFactor(num));
			}
		});
		btnCalculateFactors.setFont(new Font("Dialog", Font.BOLD, 11));
		btnCalculateFactors.setBounds(196, 27, 126, 26);
		contentPane.add(btnCalculateFactors);
	}
	
	public String calculateFactor(int num) {
		StringBuilder allNums = new StringBuilder();
		
		for(int i = 1; i <= num; i++) {
			if(i == num) {
				allNums.append(i);
			} else if(num % i == 0) {
				allNums.append(i + ", ");
			}
		}
		
		return allNums.toString();
	}
}
