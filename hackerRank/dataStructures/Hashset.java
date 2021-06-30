/**
 * 
 */
package hackerRank.dataStructures;

import java.util.HashSet;
import java.util.Scanner;

/**
 * @author Joy LoRuth
 *
 */
public class Hashset {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner scan  = new Scanner(System.in);
		int t = 5;
		HashSet<String> set = new HashSet<String>();
		
		String[] right = {"john","john", "john", "mary", "mary" };
		String[] left = {"tom","mary", "tom", "anna", "anna"};
		
		
		
		for(int i = 0; i < t ; i++) {
			set.add(right[i] + " "+ left[i] );
			System.out.println(set.size());
		}
		
		
		
		
		
		
		
		
			
		
	

}
}
