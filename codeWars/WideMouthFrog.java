package codeWars;

import java.util.Scanner;

public class WideMouthFrog {
	
//The wide mouth frog is particularly interested in the eating habits of other creatures.
//He just can't stop asking the creatures he encounters what they like to eat. But then he meet the alligator who just LOVES to eat wide-mouthed frogs!
//When he meets the alligator, it then makes a tiny mouth.
//Your goal in this kata is to create complete the mouth_size method this method take one argument animal which corresponds to the animal encountered by frog. 
//If this one is an alligator (case insensitive) return small otherwise return wide.

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String animal = scan.next();
		
		WideMouthFrog frog = new WideMouthFrog();
		System.out.println(mouthSize(animal));
		
		String word = "word";
		

	}
	
	 public static String mouthSize(String animal){
		   animal = animal.toLowerCase();
		    if(animal.equals("alligator")) return "small";
		    else return "wide";
		    	
		   
		  }
	 
	 //Refactored solution
	 public  String mouthSizes(String animal) {
		    return "alligator".equals(animal.toLowerCase()) ? "small" : "wide";
		  }
	 

}
