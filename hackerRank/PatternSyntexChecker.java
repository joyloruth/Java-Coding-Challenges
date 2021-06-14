package hackerRank;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class PatternSyntexChecker {

	public static void main(String[] args)
	
	{
		
		// ORACLE DOCUMENT 
		// https://docs.oracle.com/javase/6/docs/api/java/util/regex/Pattern.html#compile%28java.lang.String%29
		
		//For each test case, print Valid if the syntax of the given pattern is correct. Otherwise, print Invalid. Do not print the quotes.
		
		Scanner scan = new Scanner(System.in);
		int testCases = scan.nextInt();
		
		for(int i = 0; i < testCases; i++) {
			
			String pattern = scan.nextLine();
			
			try
			{
				Pattern.compile(pattern);
				System.out.println("Valid");
			}
			
			catch(PatternSyntaxException e) 
			{
				System.out.println("Invalid");
			}
			
		}
		
	}

}
