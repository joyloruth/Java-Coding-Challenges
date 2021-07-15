package codeWars;

import java.util.HashMap;

public class ComplementaryDNA {

	public static void main(String[] args) {
		String dna = "TATCCGG";
		HashMap<String,String> map = new HashMap<String,String>();
		map.put("A", "T");
		map.put("T", "A");
		map.put("C", "G");
		map.put("G", "C");
		for(int i = 0 ; i < dna.length(); i++) {
			
		}
		
	
		
		
		
		System.out.println(makeComplement(dna));
		
		 

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
