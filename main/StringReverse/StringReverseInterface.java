package main.StringReverse;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import javax.swing.border.EmptyBorder;

/* Reverse a String with StringBuilder method reverse()
 * input via Swing
 * output via Swing
 */

public class StringReverseInterface extends JFrame {

	private JPanel contentPane;
	private JTextField enteredString;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StringReverseInterface frame = new StringReverseInterface();
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
	public StringReverseInterface() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 517, 232);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		SpringLayout sl_contentPane = new SpringLayout();
		contentPane.setLayout(sl_contentPane);
		
		JLabel lblEnterAString = new JLabel("Enter a string:");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblEnterAString, 5, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblEnterAString, 5, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, lblEnterAString, 37, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, lblEnterAString, 429, SpringLayout.WEST, contentPane);
		lblEnterAString.setFont(new Font("Tahoma", Font.PLAIN, 12));
		contentPane.add(lblEnterAString);
		
		enteredString = new JTextField();
		sl_contentPane.putConstraint(SpringLayout.NORTH, enteredString, 6, SpringLayout.SOUTH, lblEnterAString);
		sl_contentPane.putConstraint(SpringLayout.WEST, enteredString, 5, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, enteredString, 68, SpringLayout.NORTH, contentPane);
		contentPane.add(enteredString);
		enteredString.setColumns(10);
		
		JLabel result = new JLabel("");
		sl_contentPane.putConstraint(SpringLayout.WEST, result, 10, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, result, -34, SpringLayout.SOUTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, result, 434, SpringLayout.WEST, contentPane);
		contentPane.add(result);
		
		JButton btnResetString = new JButton("Reset String");
		
		JButton btnNewButton = new JButton("Use String");
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnNewButton, 7, SpringLayout.SOUTH, enteredString);
		sl_contentPane.putConstraint(SpringLayout.NORTH, result, 11, SpringLayout.SOUTH, btnNewButton);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnNewButton, 0, SpringLayout.WEST, lblEnterAString);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnNewButton, 134, SpringLayout.WEST, contentPane);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btnResetString.setEnabled(true);
				StringReverseLogic myString = new StringReverseLogic();
				String resultMessage = myString.reverseStringAndCreateResultMessage(enteredString.getText());
				result.setText(resultMessage);
			}
		});
		contentPane.add(btnNewButton);
		
		btnResetString.setEnabled(false);
		sl_contentPane.putConstraint(SpringLayout.EAST, enteredString, 0, SpringLayout.EAST, btnResetString);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnResetString, 130, SpringLayout.EAST, btnNewButton);
		btnResetString.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				enteredString.setText("");
				result.setText("");
			}
		});
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnResetString, 0, SpringLayout.NORTH, btnNewButton);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnResetString, 16, SpringLayout.EAST, btnNewButton);
		contentPane.add(btnResetString);
	}
}
