package hackerRank.Algorithms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//5/25/2021

public class SimpleArray {
	
	static Scanner scan = new Scanner(System.in);
	static SimpleArray simple = new SimpleArray();
	static int n = scan.nextInt();
	

	
	public static void main(String[] args) {
		
		List<Integer> ar = new ArrayList<Integer>();
		
		for(int i = 0; i <n; ++i) {
			ar.add(scan.nextInt());
		}
		
	
		
		
		simple.simpleArray(ar);
		
		

	}
	
	int simpleArray(List<Integer> ar){
		
		int count = 0;
		for(int number: ar) {
			count += number;
		}
		
		
		return count;
	}

}
