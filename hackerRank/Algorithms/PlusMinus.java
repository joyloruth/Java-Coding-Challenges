package hackerRank.Algorithms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PlusMinus {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int denom = scan.nextInt();
		int neg = 0;
		int pos = 0;
		int zero = 0;
		
		List<Integer> arr = new ArrayList<Integer>();
		
		for(int i = 0; i < denom; i++)
		{
			arr.add(scan.nextInt());
		}
		
		/*for(int i = 0; i < arr.size(); i++)
		{
			if(i > 0) {	++ pos;	}
			
			if(i == 0) {++zero;}
			
			else { ++neg;}
		}*/
			//System.out.println("neg: " + neg  + " pos: " + pos + " zero: " + zero);

			
			for(int num: arr) {
				System.out.println(num);
			}
		
		//PlusMinus minus = new PlusMinus();
		//minus.plusMinus(arr);
		
		

	}
	
	List<Integer> plusMinus(List<Integer> arr){
		return arr;
	}

}
