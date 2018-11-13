package main;

import javax.swing.JOptionPane;

/* Program to translate RNA sequences to proteins
 * the RNA is broken to codons and then translated to a polypeptide
 * example RNA to try out: AUGUUUUCUUAAAUG
 * this program doesn´t serve all possible cases of RNA translation, it was written to check the example
 */

public class ProteinTranslation {
	
	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("Enter a RNA sequence:");
		ProteinTranslation sequence = new ProteinTranslation();
		
		JOptionPane.showMessageDialog(null, "The proteins of the sequence " + input + " are:" + sequence.RNAToProteins(input));
	}
	
	public String RNAToProteins(String str) {
		StringBuilder allProteins = new StringBuilder(" ");
		boolean stop = false;
		
		for(int i = 0; i < str.length() && !stop; i += 3) {
			StringBuilder protein = isolateSingleProtein(str, i);
			allProteins = addProtein(allProteins, protein.toString());		
			stop = checkForStop(allProteins);
			allProteins = appendComma(allProteins, stop);
		}
		
		return allProteins.toString();
	}
	
	public StringBuilder isolateSingleProtein(String str, int i) {
		StringBuilder singleProtein = new StringBuilder();
		
		for(int a = 0; a < 3; a++) {
			singleProtein.append(str.charAt(i + a));
		}
		
		return singleProtein;
	}
	
	public StringBuilder addProtein(StringBuilder allProteins, String protein) {
		
		switch(protein) {
			case "AUG": allProteins.append("Methionine");
						break;
			case "UUU": 
			case "UUC": allProteins.append("Phenylalanine");
						break;
			case "UUA":
			case "UUG": allProteins.append("Leucine");
						break;
			case "UCU":
			case "UCC":
			case "UCA":
			case "UCG": allProteins.append("Serine");
						break;
			case "UAU":
			case "UAC": allProteins.append("Tyrosine");
						break;
			case "UGU":
			case "UGC": allProteins.append("Cysteine");
						break;
			case "UGG": allProteins.append("Tryptophan");
						break;
			case "UAA":
			case "UAG":
			case "UGA": allProteins.append("STOP");
						break;
			default: 	allProteins.append("STOP, this is not a valid RNA Sequence!");
						break;
		}
		
		return allProteins;
	}
	
	boolean checkForStop(StringBuilder allProteins) {
		if(allProteins.toString().contains("STOP")) {
			return true;
		} else {
			return false;
		}
	}
	
	StringBuilder appendComma(StringBuilder allProteins, boolean stop) {
		if(!stop) {
			allProteins.append(", ");	
		}
		
		return allProteins;
	}
}
