package codeWars;

import java.util.Scanner;

public class AbbreviateTwoNames {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in); 
		
		String name = scan.nextLine();
		
		AbbreviateTwoNames names = new AbbreviateTwoNames();
		
		System.out.println(names.AbbreviateTwoWords(name));
		
		

	}
	
	String AbbreviateTwoWords(String name)
	{
		
		char f = 0, l = 0;
		
		String[] nameArr= name.toUpperCase().split(" ");
		String init = "";
		
		for(String word: nameArr) 
		{
			init += word.charAt(0);
		}
		
		for(int i = 0; i < init.length(); i++)
		{
			f = init.charAt(0);
			l = init.charAt(1);
		}
		
		
		return  f + "." + l;
}


}
