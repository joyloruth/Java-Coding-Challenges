package hackerRank.dataStructures;

import java.util.Iterator;
import java.util.Stack;

public class DeleteANode {
	static int sumA = 0;
	public static void main(String[] args) {
		
		Stack<Integer> a = new Stack<Integer>();
		a.push(3);
		a.push(2);
		a.push(1);
		a.push(1);
		a.push(1);
		
		Stack<Integer> b = new Stack<Integer>();
		b.push(4);
		b.push(3);
		b.push(2);
		
		Stack<Integer> c = new Stack<Integer>();
		c.push(1);
		c.push(1);
		c.push(4);
		c.push(1);
		
		
		//System.out.println(a);
		//System.out.println(b);
		//System.out.println(c);
		
		
		
		//while (a.size() > 0) {
			//sumA += a.pop();}
		
		
		Integer sumB = 0;
		int sumC = 0;
		
		//while (b.size() > 0) {
			//	sumB += b.pop();}
		
	
		
		

		//System.out.println(a);
		
		for(Integer i : a) {
			sumA +=i;}
		for(Integer i : b) {
			sumB +=i;}
		for(Integer i : c) {
			sumC +=i;}
		   
	

		System.out.println(sumA);
		System.out.println(sumB);
		System.out.println(sumC);
		
		if(sumA > sumB) {
			a.pop();
		}
		
		if(sumA < sumB) {
			b.pop();
		}
		
		if(sumB < sumC) {
			c.pop();
		}
		
		if(sumA > sumC) {
			a.pop();
		}
        
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		
		int sumAA = 0;
		for(Integer i : a) {
			sumAA +=i;}
		int sumBB = 0;
		for(Integer i : a) {
			sumBB +=i;}
		int sumCC = 0;
		for(Integer i : a) {
			sumCC +=i;}
		
		
		System.out.println(sumAA);
		System.out.println(sumBB);
		System.out.println(sumCC);
        
	}
}

