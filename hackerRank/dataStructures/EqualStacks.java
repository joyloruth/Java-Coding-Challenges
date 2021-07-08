package hackerRank.dataStructures;

import java.util.Stack;

public class EqualStacks {

	public static void main(String[] args) {
		int[] h1 = {3,2,1,1,1};
		int[] h2 = {4,3,2};
		int[] h3 = {1,1,4,1};
		
		int Asum = 0;
		int Bsum = 0;
		int Csum = 0;
		
		Stack<Integer> a = new Stack<Integer>();
		Stack<Integer> b = new Stack<Integer>();
		Stack<Integer> c = new Stack<Integer>();
		
		for(int i = h1.length -1; i >= 0; i--) {
			a.push(h1[i]);
			Asum = Asum + h1[i];
		}
		
		for(int i = h2.length -1; i >= 0; i--) {
			b.push(h2[i]);
			Bsum = Bsum + h2[i];
		}
		
		for(int i = h3.length -1; i >= 0; i--) {
			c.push(h3[i]);
			Csum = Csum + h3[i];
		}
		
		
		
		System.out.println(a.pop());
		System.out.println(b);
		System.out.println(c);
		
		System.out.println(Asum);
		System.out.println(Bsum);
		System.out.println(Csum);
		
		
		while(true) {
		if(a.isEmpty() || b.isEmpty() || c.isEmpty()) {
			System.out.println(0);}
			
		if(Asum == Bsum && Bsum == Csum) {
			a.pop();
		}

		if(Asum < Bsum) {
			b.pop();
		}
		
		if(Csum > Bsum) {
			c.pop();
		}

		if(Asum < Csum) {
			a.pop();
		}
		break;
		
		}
		
		

	}

}
