package main;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.awt.event.ActionEvent;

/* Check a String if it´s a Pangram (a sentence, that contains all letters of the alphabet at least once)
 * Input via Swing
 * Output via Swing
 */

public class PangramSwing extends JFrame {

	private JPanel contentPane;
	private JTextField enteredString;

	//Launch the application.
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PangramSwing frame = new PangramSwing();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	// Create the frame.
	public PangramSwing() {
		setTitle("Is it a Pangram?");
		setBackground(new Color(240, 240, 240));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 225);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEnterAString = new JLabel("Enter a String:");
		lblEnterAString.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblEnterAString.setForeground(new Color(0, 0, 0));
		lblEnterAString.setBounds(20, 24, 100, 20);
		contentPane.add(lblEnterAString);
		
		enteredString = new JTextField();
		enteredString.setBounds(20, 50, 247, 20);
		contentPane.add(enteredString);
		enteredString.setColumns(10);
		
		JLabel informationPangram = new JLabel("");
		informationPangram.setEnabled(false);
		informationPangram.setBounds(20, 130, 389, 46);
		contentPane.add(informationPangram);
		
		JButton btnUseString = new JButton("Use String");
		btnUseString.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Pangram pangram = new Pangram();
				String str = enteredString.getText();
				char[] allLetters = pangram.cleanUpStringAndBuildArray(str);;
				boolean isPangram = checkString(allLetters);
				
				if(isPangram) {
					informationPangram.setText("Your string is a pangram!");
				} else {
					informationPangram.setText("Your string is not a pangram, there are letters missing...");
				}
			}
		});
		btnUseString.setBounds(20, 81, 118, 23);
		contentPane.add(btnUseString);
	}
	
	public boolean checkString(char[] allLetters) {
		boolean isPangram = false;
		Arrays.sort(allLetters);
		
		if(allLetters[25] == 'z' && allLetters[0] == 'a') {
			isPangram = true;
		}
		
		return isPangram;
	}
}

