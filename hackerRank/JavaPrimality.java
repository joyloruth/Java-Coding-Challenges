package hackerRank;
import java.math.BigInteger;
import java.util.Scanner;

public class JavaPrimality {

	public static void main(String[] args)
	{
		
		Scanner scan = new Scanner(System.in);
		JavaPrimality prime = new JavaPrimality();
		
		BigInteger number = new BigInteger(scan.next()); 
		scan.close();
		
		System.out.println(number.isProbablePrime(1)?"TRUE":"NOT PRIME");
		
		

	}
	
	
	 
	 
		
	 
	
}
