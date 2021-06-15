package hackerRank;

import java.util.Scanner;

public class JavaPalindrome 
{

	public static void main(String[] args)
	{


		Scanner scan = new Scanner(System.in);
		
		String word = scan.next();
		String reversed = "";
		
		
		for(int i = word.length() - 1; i >= 0; i--)
		{
			reversed += word.charAt(i);
		}
		
		
		if( reversed.equals(word))
		{
			System.out.println("Palindrome");
		}
		
		else System.out.println("not a Palindrome");
		
		
	}

}


