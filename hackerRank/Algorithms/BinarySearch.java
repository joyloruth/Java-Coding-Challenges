package hackerRank.Algorithms;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("N");
		int N = scan.nextInt();
		
		int[] arr = new int[N];
		
		System.out.println("write array");
		for(int i = 0; i < arr.length; i++ )
		{
		arr[i] = scan.nextInt();
		}
		
		System.out.println("target");
		int target = scan.nextInt();
			
		
		Arrays.sort(arr);

		for(int i : arr) {
			System.out.println(i);
		}
		
		
		System.out.println( Arrays.binarySearch(arr, target));
		
	}
	
	
	
	

}
