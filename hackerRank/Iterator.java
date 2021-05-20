package hackerRank;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Iterator
{
	
	
	
	
	public static void main(String[] args)

	
	{
		
		Scanner scan = new Scanner(System.in);
		
		int number = scan.nextInt();
		
		BigDecimal[] list = new BigDecimal[number];
		
		for(int i = 0; i < list.length; i++)
		{
			list[i] = scan.nextBigDecimal();			
		}
		
		Arrays.sort(list);
		
		for(int i = 0; i < list.length; i++) {
			System.out.println(list);
		}
			
	
	
	}

}






