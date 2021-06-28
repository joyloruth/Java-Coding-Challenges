package codeWars;

public class StringRepeat {

	public static void main(String[] args) {
		int repeat = 5;
		String string = "I";
		
		System.out.println(repeatStr(repeat, string));

	}
	
	 public static String repeatStr(final int repeat, final String string) {
		 String word = "";
		 for(int i = 0; i < repeat; i++) {
			 word+=string;
		 }
		 return word;
	 }

}
