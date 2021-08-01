package hackerRank.dataStructures;


import java.util.Stack;

public class PancakeStack {

	public static void main(String[] args) {
		
		
		 Stack<Integer> stack = new Stack<Integer>();
		 
		 
		 
		 stack.add(34);
		 stack.add(45);
		 stack.add(56);
		 stack.add(78);
		 stack.add(12);
		 stack.add(91);
		 
		for(int i = 0; i <stack.size(); i++)
		{
			System.out.println( i + 1  + ". " + stack.elementAt(i));
		}
		
		

	}
}
