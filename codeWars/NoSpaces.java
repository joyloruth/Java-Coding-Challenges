package codeWars;

public class NoSpaces {

	public static void main(String[] args) {
		//remove spaces from given word	
		System.out.println(noSpaces("W o od a r d"));
		System.out.println(noSpaces("So ftwar edeve lo pe r"));
		
		
	}

	public static String noSpaces(String x) {
		x = x.replaceAll(" ", "");
		return x;
	}
}
