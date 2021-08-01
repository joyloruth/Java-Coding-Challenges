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
		scan.close();
		int p = scan.nextInt();
		scan.close();
		
		scan.close();
		
		try {
			System.out.println(calc.power(n, p));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
			
	}
}

	//Java Exception Handling
	// 05/20/2021
	class MyCalculator
	{
		
		long power(int n, int p) throws Exception
		{
			 if     (n <  0 || p <  0 ) throw new Exception("n or p should not be negative." );
			 else if(n == 0 && p == 0 ) throw new Exception("n and p should not be zero." );
			 else return (long)Math.pow(n, p);
			  
		}
			
				
	//Java Exception Handling (Try-Catch)
	// 05/20/2021
	public void math(){
		
		try{
			
			Scanner scan = new Scanner(System.in);
			
			int x = scan.nextInt();
			scan.close();
			int y = scan.nextInt();
			scan.close();
			
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
