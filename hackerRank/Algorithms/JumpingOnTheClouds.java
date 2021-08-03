package hackerRank.Algorithms;

import java.util.Scanner;

public class JumpingOnTheClouds {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int[] c = new int[n];
		
		
		
		for(int i = 0; i < n; i++) {
			c[i] = scan.nextInt();
		}
		
		int count = 0; 
		
		int i = 0 ; 
		while( i < c.length - 1) {
			if(c[i + 2] == 1) {
				i++;
				count++;
			}
		
		}
		
		System.out.println(count);
		}

	}


