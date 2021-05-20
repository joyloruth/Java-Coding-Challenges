package hackerRank;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args) {
		
		ExceptionHandling eh = new ExceptionHandling();
		//eh.math();
		
		MyCalculator calc = new MyCalculator();
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int p = scan.nextInt();
		
		calc.power(n, p);
			
	}
}

	class MyCalculator
	{
		
		 long power(int n, int p)
		{
			double d = Math.pow(n, p);
			long product = 0;
			try
			{
				System.out.println(product);
			}
			
			catch(Exception e)
			{
				System.out.println(e);
			}
			
			return product;
		}
		
	
	
	
	
	public void math(){
		
		try{
			
			Scanner scan = new Scanner(System.in);
			
			int x = scan.nextInt();
			int y = scan.nextInt();
			
			int difference = x/y;
			
			System.out.println(difference);
			
			}
		
		catch(InputMismatchException e){
			System.out.println(e.getClass().getName());
		}
		
		catch(ArithmeticException e){
			System.out.println(e);
		}
		
	}

}
