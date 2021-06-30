package hackerRank.dataStructures;

import java.util.Random;
import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		
		
		Stack<String> pancakes = new Stack<String>();
		
		pancakes.add("strawberry");
		pancakes.add("blueberry");
		pancakes.add("maple syrup");
		pancakes.add("buttery");
		pancakes.add("peach");
		pancakes.add("fluffy");
		
		String title = "      Denny's breakfast menu";
		
		
		
		System.out.println("_____________________________________");
		System.out.println("                                     ");
		System.out.println(              title.toUpperCase()            );
		System.out.println("_____________________________________");
		System.out.println();
		System.out.println("Welcome to Denny's Diner.");
		System.out.println("Please choose an item from the menu.");
		System.out.println();
		
		Random rando = new Random();
		;
		int count = 1; 
		
		
		
		
		for(String item : pancakes ){
			System.out.println( count++ + ". " + "Prices - $" + rando.nextInt(10) + "- " +  item.toUpperCase() + " pancakes.");
			
		}

		
	}

}
