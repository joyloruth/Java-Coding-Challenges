package codeWars;

import java.util.Scanner;
//
public class CreatePhoneNumber {
//Write a function that accepts an array of 10 integers (between 0 and 9), that returns a string of those numbers in the form of a phone number.

//Example:
//Kata.createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9})

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] numbers = new int[10];
		
		for(int i = 0; i < numbers.length; i++) {
			numbers[i] = scan.nextInt();
		}
		
		System.out.println(createPhoneNumberRefactored(numbers));
		
	}
	
	//refactored solution
	public static String createPhoneNumberRefactored(int[] numbers) {
		String phoneNumber = new String (("(XXX) XXX-XXXX"));
		
		for(int i: numbers) 
		{
		phoneNumber = phoneNumber.replaceFirst("X", Integer.toString(i));
		}
		return phoneNumber;
	}
	
	//original solution 
	public static String createPhoneNumber(int[] numbers) {
		String areaCode = "";
		String beg = "";
		String end = "";
		
		
		for(int i = 0; i < numbers.length -7; i++) 
		{
			areaCode+=numbers[i];
		}
		
		for(int i = 3; i < numbers.length -4; i++) 
		{
			beg+=numbers[i];
		}
		
		for(int i = 6; i < numbers.length; i++) 
		{
			end+=numbers[i];
		}
		
	    return "("+areaCode+") " + beg + "-"+  end;
	  }

}
