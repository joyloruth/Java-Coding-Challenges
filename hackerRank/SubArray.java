package hackerRank;

import java.util.ArrayList;
import java.util.Scanner;

public class SubArray {

	public static void main(String[] args) {
		
		String[] word = {"A","B","C","D" };
		
		int[] arr = {-1,-8,-2,4,-5, 0};
		
		int target = 0;
		
		
		/*for(int first: arr) 
		{
			for(int sec : arr) 
			{
				if(first + sec < 0)
				System.out.println(first + sec + " negative");
				else System.out.println("   positive");
			}
		}*/
		

		for(int i =0; i <arr.length; i++) {
			for(int j = i + 1  ; i <arr.length; i++) {
			System.out.println(arr[i] +  "" + arr[j]);
		}
		}
		
		 /* //allows user input
		Scanner scan = new Scanner(System.in);
		
		//takes integer input that will be used to determine the size of the array
		int num = scan.nextInt();
		
		//creates an integer array
		int[] arr = new int[num];
		
		
		// for loop adds user input of integers to the array
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = scan.nextInt();
			
		}
		 
			for(int i = 0; i < arr.length; i++)
			{
				for(int j = 1; j < arr.length; j++)
					
				{
					
					System.out.println( "I = " + i + " J = " + j);
				}
			} */
		
		}		

 }

