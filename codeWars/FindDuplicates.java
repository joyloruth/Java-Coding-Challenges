package codeWars;

public class FindDuplicates {

	public static void main(String[] args) {
		
	System.out.println(findDuplicateLetters("I love you very mucho"));
		
		
		
		
		
		
		
	}
	
	//still working on solution
	static public String findFirstNonDuplicateLetter(String word) {
		
		word = word.toLowerCase();
		String newWord = "";
		String duplicates = "";
		String nondups = ""; 
		
		for(int i = 0; i < word.length(); i++) {
			String current = Character.toString(word.charAt(i));
			if(newWord.contains(current)) {
				if(!duplicates.contains(current))
					{
						duplicates+=current;
					}
			}
			else
				nondups+=current;
			
			newWord+=current;
		}
		
		return duplicates + "" + nondups;
		
	}
	
	
	
	static public String findDuplicateLetters(String sentence) {
		
		String newSentence = "";
		String current = "";
		String duplicates = "";
		
		for(int i = 0; i < sentence.length(); i++)
		{
			 current = Character.toString(sentence.charAt(i));
			 if(newSentence.contains(current)) {
				 if(!duplicates.contains(current)) {
					 duplicates+=current;
				 }
				
			 }
			
			 newSentence+=current;
		}
		
		return duplicates;
	}

}
