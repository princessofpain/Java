package main;

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

public class Proverbs extends JFrame {

	private JPanel contentPane;
	private JTextField words;


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Proverbs frame = new Proverbs();
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
	public Proverbs() {
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
				String[] args = separate(words.getText());			
				result.setText(displayResultOf(args));
			}
		});
		btnGo.setMargin(new Insets(2, 7, 2, 7));
		btnGo.setFont(new Font("Dialog", Font.BOLD, 10));
		btnGo.setBounds(374, 107, 37, 20);
		contentPane.add(btnGo);
	}
	
	String[] separate(String words) {
		int numberOfTokens = countTokens(words);
		
		if(isOdd(numberOfTokens)) {
			String[] noEvenInput = new String[0];
			return noEvenInput;
		}
		
		String[] allTokens = buildArray(words, numberOfTokens);
		return allTokens;
	}
	
	String displayResultOf(String[] allWords) {
		String oddNumberMessage = "Please enter an even number of words!";
		
		if(allWords.length == 0) {
			return oddNumberMessage;
		} else {
			String result = processWordsToProverbs(allWords);
			return result;
		}
	}
	
	int countTokens(String words) {
		Scanner scan = new Scanner(words);
		int howManyWords = 0;
		
		for(int i = 0; i < words.length(); i++) {
			if(scan.hasNext())  {
				howManyWords++;
				// scanner has to be moved to the next token
				scan.next();
			}
		}
		// scanner has to be closed or to be reset
		scan.close();
		
		return howManyWords;
	}

	boolean isOdd(int numberOfTokens) {
		if(numberOfTokens % 2 != 0) {
			return true;
		} else {
			return false;
		}
	}
	
	String[] buildArray(String words, int numberOfTokens) {
		Scanner scan2 = new Scanner(words);
		String allWords[] = new String[numberOfTokens];
		
		for(int i = 0; i < numberOfTokens; i++) {
			if(scan2.hasNext()) {
				allWords[i] = scan2.next().toString();
			}
		}
		
		scan2.close();
		return allWords;
	}
	
	String processWordsToProverbs(String[] allWords) {
		String[] proverb = buildProverb(allWords);
		StringBuilder allProverbs = new StringBuilder();
		
		for(int i = 0; i < allWords.length; i += 2) {
			allProverbs.append(proverb[i]);
		}
		
		return allProverbs.toString();
	}
	
	String[] buildProverb(String[] str) {
		String[] proverbsArray = new String[str.length];
		
		for(int i = 0; i < str.length; i+= 2) {
			StringBuilder proverbs = new StringBuilder();
			String word1 = str[i];
			String word2 = str[i+1];
			
			proverbs.append("For want of a " + word1 + " the " + word2 + " was lost.\r\n");
			proverbsArray[i] = proverbs.toString();
		}
		
		return proverbsArray;
	}
}
