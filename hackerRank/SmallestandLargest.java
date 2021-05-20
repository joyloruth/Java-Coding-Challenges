package hackerRank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SmallestandLargest {
	
	Scanner scan;

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

	}

	//Java Substring Comparisons//
	public static String getSmallestAndLargest(String s, int k)
	{
        ArrayList<String> list = new ArrayList<String>();
    	
        for(int i = 0; i <= s.length() - k; ++i) {
        	list.add(((s.substring(i, i + k)))); }
      
        Collections.sort(list);
      
        String smallest = (String) list.get(0);
        String largest = (String) list.get(list.size() - 1);
        
        return smallest + "\n"  +  largest;
        
	}
	

	//Java String Tokens
	 public void stringTokens()
	 {
		 
		 	scan = new Scanner(System.in);
	        
	        String s = scan.nextLine();
	        scan.close();
	        s = s.trim();
	        
	        if(s.length() == 0) {
	            System.out.println(0);
	            return;}
	            
	        String[] words = s.split("[^a-zA-Z]+");
	        System.out.println(words.length);
	        
	        for(String word: words)
	            System.out.println(word);
	 }
	 
	
}
