package codeWars;

import java.util.Scanner;

//CodeWars Instructions
/*Who remembers back to their time in the schoolyard, when girls would take a flower and tear its petals, 
saying each of the following phrases each time a petal was torn:

I love you
a little
a lot
passionately
madly
not at all


Your goal in this kata is to determine which phrase the girls would say for a flower of a given number of petals, where nb_petals > 0.*/


public class HowMuchILoveYou {


	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int nb_petals = scan.nextInt();
		
		HowMuchILoveYou heart = new HowMuchILoveYou();
		System.out.println(heart.howMuchILoveYou(nb_petals));
		
		

	}
	
	//MY SOLUTION 06/17/2021
	public static String howMuchILoveYou(int nb_petals) 
	 {
				
		 if(nb_petals > 6) {
			nb_petals = nb_petals%6;
		 }
		 
		 if(nb_petals == 1) return "I love you";
		 if(nb_petals == 2) return "a little";
		 if(nb_petals == 3) return "a lot";
		 if(nb_petals == 4) return "passionately";
		 if(nb_petals == 5) return "madly";
		
		   
		    return "not at all";
	}

}
