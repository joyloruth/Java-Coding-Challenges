package codeWars;

import java.util.HashMap;

public class ComplementaryDNA {

	public static void main(String[] args) {
		String dna = "TATCCGG";
		
		
	}
	
	 public static String makeComplement(String dna) {
		 
		 String complement = "";
		 for(int i = 0; i < dna.length(); i++) {
			 if(dna.charAt(i) == 'A') {
				 complement+="T";
			 }
			 if(dna.charAt(i) == 'T') {
				 complement+="A";
			 }
			 
			 if(dna.charAt(i) == 'C') {
				 complement+="G";
			 }
			 
			 if(dna.charAt(i) == 'G') {
				 complement+="C";
			 }
		 }
		 
		 return complement;
	}

}
