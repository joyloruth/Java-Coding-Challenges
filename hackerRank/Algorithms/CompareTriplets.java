package hackerRank.Algorithms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CompareTriplets {

	//05/25/2021
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		List<Integer> a = new ArrayList<Integer>();
		List<Integer> b = new ArrayList<Integer>();
		
		int n = scan.nextInt();
		
		for(int i = 0; i < n; i++) {
			a.add(scan.nextInt());}
		
		for(int i = 0; i < n; i++) {
			b.add(scan.nextInt());}
		
		CompareTriplets trip = new CompareTriplets();
		
		trip.compare(a, b);
			
		}
		
	
	
	
	
		

	
	
	List<Integer>compare(List<Integer> a, List<Integer> b){
		
		int a_count = 0;
		int b_count = 0;
		
		if(a.get(0) > b.get(0)) {
			++a_count;}
		if(a.get(1) > b.get(1)) {
			++a_count;}
		if(a.get(2) > b.get(2)) {
			++a_count;}
		
		if(a.get(0) < b.get(0)) {
			++b_count;}
		if(a.get(1) < b.get(1)) {
			++b_count;}
		if(a.get(2) < b.get(2)) {
			++b_count;}
		
		List<Integer> c = new ArrayList<Integer>();
		c.add(a_count);
		c.add(b_count);
		
		
		return c;
		
	}

}
