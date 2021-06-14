package hackerRank.Algorithms;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class StairCase
{
	public static void main(String[] args)
	
	{
		Scanner in = new Scanner(System.in);
		
        
		int testCases = Integer.parseInt(in.nextLine());
		
        
		for(int i = 0; i < testCases; i++)
        {
            
			String pattern = in.nextLine();
            
			try 
			{
				Pattern.compile(pattern);
				System.out.println("Valid");
			}
			
			catch(PatternSyntaxException e) 
			{
				System.out.println("Invalid");
			}
            
			
          	
		}
		
		
	}
}
	






















/*{
		int[][] hourGlass = 
				
			{
				{2,4,5},
				{6,7,8},
				{9,3,2}
			};	
		
		int rows = hourGlass.length;
		int columns = hourGlass[0].length;
		
		int max_Sum = Integer.MIN_VALUE;
		
		
		for(int i = 0; i <= rows; i++ )
		{
			for(int k = 0; k <= columns; k++)
			{
				int currentHourGlass = hourGlass[i][k] + hourGlass[i][k + 1]  +  + hourGlass[i][k + 2] +
					hourGlass[i + 1][k + 1] + hourGlass[i + 2][k] + hourGlass[i + 2][k + 1] + hourGlass[i + 2][k + 2];
				if(currentHourGlass == max_Sum) {
					
				}
			}
			
			
		}

		
	}	*/
	
				
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		





