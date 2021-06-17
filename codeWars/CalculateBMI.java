package codeWars;

public class CalculateBMI {

	public static void main(String[] args) {
		
		double weight = 180;
		double height = 1.80;
		
		CalculateBMI bmi = new CalculateBMI();
		
		System.out.println(bmi.calculateBMI(weight, height));
		System.out.println(bmi.bmi(weight, height));

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
