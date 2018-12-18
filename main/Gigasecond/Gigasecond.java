package main.Gigasecond;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/* program to calculate the lifetime after 1 Gigasecond which is 10^9
 * output via JOptionPane
 * */

public class Gigasecond {
	
	public static void main(String args[]) {
		Gigasecond my = new Gigasecond();
		DecimalFormat df = new DecimalFormat("0.00");
		
		JOptionPane.showMessageDialog(null,"When your lifetime reaches one gigasecond you lived for: \n    " + df.format(my.liveForAGigasecodInMinutes()) + 
				" minutes or\n    " + df.format(my.liveForAGigasecodInHours()) + " hours or \n    " + df.format(my.liveForAGigasecodInDays()) + " days or \n    " + 
				df.format(my.liveForAGigasecodInYears()) + " years.");
	}
	
	public double liveForAGigasecodInMinutes() {
		double lifetime = Math.pow(10, 9) / 60;
		return lifetime;
	}
	
	public double liveForAGigasecodInHours() {
		double lifetime = Math.pow(10, 9) / (60 * 60);
		return lifetime;
	}
	
	public double liveForAGigasecodInDays() {
		double lifetime = Math.pow(10, 9) / (60 * 60 * 24);
		return lifetime;
	}
	
	public double liveForAGigasecodInYears() {
		double lifetime = Math.pow(10, 9) / (60 * 60 * 24 * 12);
		return lifetime;
	}
}
