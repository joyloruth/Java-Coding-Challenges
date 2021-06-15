package hackerRank;

import java.util.Scanner;

public class TwoDimensionArray {

	public static void main(String[] args) {
		
		int[] arr = {1, 2, 3, 4, 5};			
			
		
		int rotate_index = 0 ;
		int i = 0;
		int size = arr.length;
		int[] rotate_arr = 	new int[size];
		
		while(rotate_index < size) {
			rotate_arr[i] = arr[rotate_index];
			i++;
			rotate_index++;
		}
		
		 while(rotate_index < rotate_index)
		for(int h: rotate_arr) {
			System.out.println(h);
		}
	
	}
}
