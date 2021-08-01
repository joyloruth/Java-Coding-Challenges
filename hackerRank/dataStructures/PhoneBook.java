package hackerRank.dataStructures;

import java.util.HashMap;
import java.util.Scanner;

public class PhoneBook {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		HashMap<String, Integer> phoneBook = new HashMap<String, Integer>();
		
		int n = 3;
		String name;
		Integer number;
		
		for(int i = 0; i < n; i++) {
			
			phoneBook.put(name = scan.nextLine(), number = scan.nextInt());
			
			scan.close();
		}
		
		
		HashMap<String, Integer> entries = new HashMap<String, Integer>();
		for(int i = 0; i < phoneBook.size(); i++)
		{
		
		entries.put(name = scan.nextLine(), number = scan.nextInt());
		}
	
		for(int i = 0; i < entries.size(); i++) 
		{
			
			if(entries.containsKey("sam") && entries.containsValue(123))
			{
				System.out.println("true");
			}
			
			else System.out.println("false");
		}
		
		
}
	
	

}
