package codeWars;

import java.util.Arrays;

public class CalculateBMI {

	public static void main(String[] args) {
		
	
		int[] args1 = {-34, 3450, -501, 10, 3000, 9000, -800, -75};
		System.out.println(findSmallestInt(args1));
		
	}
	
	
	public static int findSmallestInt(int[] args) {
		Arrays.sort(args);
		int min = args[0];
	      return min;
	      

    }
	 
	
	//original solution
	String calculateBMI(double weight, double height) {
		
		double bmi = weight/Math.pow(height, 2);
		
		String num = "";
		
		if(bmi <= 18.5 ) num = "Underweight";
		if(bmi > 18.5 && bmi <= 25.0) num = "Normal";
		if(bmi > 25.0 && bmi <= 30.0) num = "Overweight";
		if(bmi > 30) num = "Obese";
		return num;
		
	}
	
	
	
	//Refactored solution
	public static String bmi(double weight, double height) {
	    
	      double bmi = weight / (height * height);

	      if ( bmi <= 18.5) return "Underweight";
	      if ( bmi <= 25) return "Normal";
	      if ( bmi <= 30) return "Overweight";
	      return "Obese";

	  }

}
