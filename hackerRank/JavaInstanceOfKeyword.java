package hackerRank;

import java.util.ArrayList;
import java.util.Scanner;

public class JavaInstanceOfKeyword {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList();
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		int s = 0, r = 0, h = 0;
		
		
		for(int i = 0; i < n; i++) 
		{
		list.add(scan.next());
		}
		
		for(String word: list)
		{
			
			if(word.equals("Student")) 
			{
				s++;
			}
			

			if(word.equals("Hacker")) 
			{
				h++;
			}
			

			if(word.equals("Rockstar")) 
			{
				r++;
			}
		}
		 String count = s +  "" + r + "" + h;
		 
		 System.out.println(count);
		
		
	}
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		ArrayList words = new ArrayList();
		
		//String[] words = new String[n];
		
		for(int i = 0; i < n; i++) 
		{
			words.add(scan.nextLine());
		}
	
		
		System.out.println(words);
		//System.out.println(studentNum + "" + rockNum + "" + hackNum);
			
			
		}
	
	static String count(ArrayList mylist)
	{
		int rockNum = 0,studentNum = 0, hackNum = 0; 
		String count = rockNum + "" + studentNum + hackNum;
		
		for(Object word: mylist) 
			
		{
			if(word.equals("Rockstar")) {
				 rockNum++;
			}
			
			if(word.equals("Student")) {
				studentNum++;
			}
			
			if( word.equals("Hacker"))
				hackNum++;
			
		}
		
		return count;
		
	}*/

	}



