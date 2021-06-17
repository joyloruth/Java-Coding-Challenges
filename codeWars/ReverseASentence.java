package codeWars;

import java.util.Scanner;

public class ReverseASentence {

	public static void main(String[] args) {
		
		

		
		
		
	}
		
		
	/*	String word = "I love myself";
		
		String[] sentence =  word.split(" ");
		
		StringBuilder builder = new StringBuilder();
		
		
		for(int i = sentence.length -1; i >= 0; i--) {
			builder.append(sentence[i]).append(" ");
		}
		
		System.out.println(builder);*/
		
		
		
	
	
	public static String reverseWords(String str) {
		
	   
		
		String[] sentence =  str.split(" ");
		
		 String word = "";
		
		for(int i = sentence.length -1; i >= 0; i--) {
			word += sentence[i] + " ";
		}
		System.out.println(word);
		return word;
		
		
		
	}
	
	public static StringBuilder reverseTwo(String str) {
		
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
		return null;
	}

}
