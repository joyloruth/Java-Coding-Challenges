package hackerRank;

import java.util.Scanner;

public class TwoDimensionArray {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		
		String[] colorList = new String[num];
		
		
		
	/*	for(String[] row: carLot) {
			System.out.println();
			//System.out.print(" | ");
			for(String column: row ){
				System.out.print(column);
				//System.out.print(" | ");
			}
			
		}*/
		
		
		for(int i = 0; i < num; i++) {
			System.out.println("");
			System.out.println("Print a color, please.");
			
			colorList[i] = scan.next();
			
				
			
		}
		
		System.out.println();
		for(String color: colorList) {
			System.out.print(color);
			System.out.print(" | ");
		}
		

	
	}
}
