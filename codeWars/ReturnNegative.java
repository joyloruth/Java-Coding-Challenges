package codeWars;

import java.util.Scanner;

public class ReturnNegative {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ReturnNegative n = new ReturnNegative();
		int x = 20;
		System.out.println(n.makeNegative(x));
	}
	
	public static int makeNegative(final int x)
	{
	    if(x < 0) {
	    	return x;
	    }
	    
		  int n =  x * -1;
		    return n; 
		    
		  }

}
