package codeWars;

public class NoSpaces {

	public static void main(String[] args) {
		
		System.out.println(noSpaces("W o od a r d"));
		System.out.println(noSpaces("So ftwar edeve lo pe r"));
		System.out.println(switcheroo("AbCbaca"));
		System.out.println(switcherooTwo("AbCbaca"));
	}
	
	
	
	
	/*Given a string made up of letters a, b, and/or c, switch the position of letters a and b (change a to b and vice versa). Leave any incidence of c untouched.
	Example:

	'acb' --> 'bca'
	'aabacbaa' --> 'bbabcabb'*/
	
	static public String switcheroo(String originalWord) {
		
		originalWord = originalWord.toLowerCase();
		
		String switched = "";
		
		for(int i = 0; i < originalWord.length(); i++) {
			if(originalWord.charAt(i) == 'a') {
				switched+= 'b';
			}
			
			else if(originalWord.charAt(i) == 'b') {
				switched+= 'a';
			}
			
			else {
				switched+= originalWord.charAt(i);
			}
	
		}
		return switched;
	}


	static String switcherooTwo(String word) {
		
		word = word.toLowerCase();
		word = word.replaceAll("a", "B");
		word = word.replaceAll("b", "A");
		word = word.toLowerCase();
		return word;
	}
	
	
	
	//Challenge is to remove all spaces from given word	
	public static String noSpaces(String x) {
		x = x.replaceAll(" ", "");
		return x;
	}
}
