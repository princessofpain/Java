package main;

/* Program to convert RNA to DNA
 * input is give
 * output via console
 */

public class RNATranscription {
	
	public static void main(String args[]) {
		RNATranscription rnaToDna = new RNATranscription();
		String rna = "G C A T G C G C A T G C";		
		String dna = rnaToDna.transcript(rna);	
		
		rnaToDna.printResult(rna, dna);
	}
	
	public String transcript(String rna) {
		StringBuilder dna = new StringBuilder("");
		
		for(int i = 0; i < rna.length(); i++) {
			char letter = rna.charAt(i);
			
			switch(letter) {
				case 'G': 
					dna.append('C' + " ");
					break;	
				case 'C': 
					dna.append('G' + " ");
					break;	
				case 'T': 
					dna.append('A' + " ");
					break;	
				case 'A': 
					dna.append('U' + " ");
					break;	
			}
		}
		
		return dna.toString();
	}
	
	public void printResult(String rna, String dna) {
		System.out.println("This is the rna: " + rna);
		System.out.println("This is the dna: " + dna);
	}
}
