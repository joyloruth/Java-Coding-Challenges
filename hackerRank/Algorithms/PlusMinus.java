package hackerRank.Algorithms;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PlusMinus {
	
	static Scanner scan = new Scanner(System.in);
	static float denom;
	
	public static void main(String[] args) {
		
		
		denom = scan.nextInt();
		
		
		
		List<Integer> arr = new ArrayList<Integer>();
		
		for(int i = 0; i < denom; i++)
		{
			arr.add(scan.nextInt());
		}
		
			
			
			
		PlusMinus minus = new PlusMinus();
		
		
		

	}
	
	List<Float> plusMinus(List<Float> arr){
		
		float neg = 0f;
		float pos = 0f;
		float zero = 0f;

		for(float num: arr)
		{
			if(num > 0) {	++ pos;	}
			
			if(num == 0) {++zero;}
			
			if(num < 0) { ++neg;}
		}
			
		
			float neg_occurence = neg / denom;
			float pos_occurence = pos/denom;
			float zero_occurence = zero/denom;
			
			
			DecimalFormat df = new DecimalFormat("0.000000");
			System.out.println(df.format(neg_occurence));
			System.out.println(df.format(pos_occurence));
			System.out.println(df.format(zero_occurence));
			
			
			
		return arr;
	}

}
