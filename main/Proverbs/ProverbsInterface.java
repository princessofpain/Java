package main.Proverbs;

import java.awt.EventQueue;

import java.awt.Font;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

/* Program to genereate a fixed proverb with the given input
 * Input is organized in single words by using the class Scanner
 */

public class ProverbsInterface extends JFrame {

	private JPanel contentPane;
	private JTextField words;
	ProverbsLogic logic = new ProverbsLogic();

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProverbsInterface frame = new ProverbsInterface();
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
	public ProverbsInterface() {
		String message = "Do you know the proverb \"For a horseshoe nail, a kingdom was lost\"? Go on and generate your own proverbs."
				+ " Just enter a list of words you want to combine.\nFor each proverb you need 2 words!";

		setTitle("Generate proverbs");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea txtrDoYouKnow = new JTextArea();
		txtrDoYouKnow.setEditable(false);
		txtrDoYouKnow.setFont(new Font("Dialog", Font.BOLD, 11));
		txtrDoYouKnow.setBackground(UIManager.getColor("Button.background"));
		txtrDoYouKnow.setLineWrap(true);
		txtrDoYouKnow.setWrapStyleWord(true);
		txtrDoYouKnow.setText(message);
		txtrDoYouKnow.setBounds(10, 21, 386, 74);
		contentPane.add(txtrDoYouKnow);
		
		words = new JTextField();
		words.setToolTipText("");
		words.setBounds(10, 107, 354, 20);
		contentPane.add(words);
		words.setColumns(10);
		
		JTextArea result = new JTextArea();
		result.setEditable(false);
		result.setBackground(UIManager.getColor("Button.background"));
		result.setLineWrap(true);
		result.setWrapStyleWord(true);
		result.setBounds(10, 139, 401, 111);
		contentPane.add(result);
		
		JButton btnGo = new JButton("Go!");
		btnGo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String[] args = logic.separate(words.getText());			
				result.setText(logic.displayResultOf(args));
			}
		});
		btnGo.setMargin(new Insets(2, 7, 2, 7));
		btnGo.setFont(new Font("Dialog", Font.BOLD, 10));
		btnGo.setBounds(374, 107, 37, 20);
		contentPane.add(btnGo);
	}
}