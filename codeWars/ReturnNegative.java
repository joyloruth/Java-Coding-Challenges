package codeWars;

import java.util.Scanner;

public class ReturnNegative {

	public static void main(String[] args) {
		int num = 5;
		for(int i = 1;  i <= 10; i++) {
			String product = i + " * " +  num + " = " + i*num;
		}
		
		
		
		Scanner scan = new Scanner(System.in);
		ReturnNegative n = new ReturnNegative();
		int x = 20;
		//System.out.println(n.makeNegative(x));
		
		System.out.println(n.multiTable(num));
	}
	
	public static int makeNegative(final int x)
	{
	    if(x < 0) {
	    	return x;
	    }
	    
		  int n =  x * -1;
		    return n; 
		    
		  }
	
	 public static String multiTable(int num) {
		 String product = "";
		 
	        for(int i = 1;  i <= 10; i++) {
		    	System.out.println(product = i + " * " +  num + " = " + i*num);
	      return product;
	    }
			return product;
			
	 }

}
