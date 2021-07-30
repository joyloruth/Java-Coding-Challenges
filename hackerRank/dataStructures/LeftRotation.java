package hackerRank.dataStructures;

import java.util.ArrayList;
import java.util.List;

public class LeftRotation 
{

	public static void main(String[] args) 
	{
		List<Integer> arr = new ArrayList<Integer>();
		
		List<Integer> temp= new ArrayList<Integer>();
		
		int size = arr.size();
		
		for(int i = 0; i < size; i++ ) {
			arr.add(10);
			arr.add(20);
			arr.add(30);
			arr.add(40);
			arr.add(50);
		}
		
			
		int target = 40;
		int left_rotation = 2;
		
		int[] begin = new int[size];
	

		
		for(int i = 0; i < left_rotation; i++) 
		{
			begin[i + left_rotation + 1] = arr.get(i);
		}
		
		for(int i = left_rotation; i < arr.size(); i++)
		{
			begin[i - left_rotation] = arr.get(i);
		}
		
		
		for(int i : begin) {
			System.out.println(i);
		}
		
		}
	
	public static int[] rotateArray() 
	{
		return null;
			
		
		
	}
	
	

}


