package hackerRank;

import java.util.Scanner;

public class JavaPalindrome 
{

	public static void main(String[] args)
	{
		
		Scanner scan = new Scanner(System.in);
		
		String input = scan.nextLine();
		String[] word = input.split(" ");
		StringBuilder builder = new StringBuilder();
		String revWord = "";
		
		for(int i = word.length - 1; i >= 0; i--)
		{
			builder.append(word[i]).append(" ");
		}
		
		
		System.out.println(builder);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*for(int i = word.length() - 1; i >= 0; i--)
		{
			reversed += word.charAt(i);
		}
		
		
		if( reversed.equals(word))
		{
			
			System.out.println("Palindrome");
		}
		
		else System.out.println("Not a Palindrome");
		
		System.out.println(reversed);
		System.out.println(word);*/
	}

}


