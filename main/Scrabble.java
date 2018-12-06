package main;

import java.util.Scanner;

/* Program to calculate the Scrabble Score of a word
 * input and output with JOptionPane
 */

public class Scrabble {
	
	public static void main(String args[]) {
		Scrabble game = new Scrabble();
		String input = game.enterWordWithConsoleInput().toLowerCase();
		int score = game.calculateScoreOf(input);
		
		game.showResultMessage(score, input);
	}
	
	// System.console().readLine() doesn´t work here because this method exclusively works outside of the IDE
	public String enterWordWithConsoleInput() {
		System.out.println("Enter a word to check its score for Scrabble:"); 
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		in.close();
		
		return input;
	}
	
	public int calculateScoreOf(String input) {
		int score = 0;
			
		for(int i = 0; i < input.length(); i++) {
			char letter = input.charAt(i);
	
			switch(letter) {
				case 'a':
				case 'e':
				case 'i':
				case 'o':
				case 'u':
				case 'l':
				case 'n':
				case 'r':
				case 's':
				case 't': score += 1;
						  break;
				case 'd':
				case 'g': score += 2;
						  break;
				case 'b':
				case 'c':
				case 'm':
				case 'p': score += 3;
						  break;
				case 'f':
				case 'h':
				case 'v':
				case 'w':
				case 'y': score += 4;
						  break;
				case 'k': score += 5;
						  break;
				case 'j':
				case 'x': score += 8;
						  break;
				case 'q':
				case 'z': score += 10;
						  break;
			}
		}	
		return score;
	}
	
	void showResultMessage(int score, String input) {
		System.out.println("The word \"" + input + "\" has the score " + score + ".");
	}
}
