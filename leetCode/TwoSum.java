package leetCode;

import java.util.HashMap;

public class TwoSum{
	
	
	
	
	
	
	public static void main(String args[]) 
	{
		int[] nums = {2,7,11,15};
		int target = 9; 
		
		
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		
		for(int i = 0; i < nums.length; i++) {
			map.put(nums[i], i);
			
			int complement = target - nums[i];
			
			if(map.containsKey(complement)) {
				
			}
			
			else System.out.println("no match");
		}
		
		
		
		
		/*for(int i = 0 ; i < nums.length; i++) 
		{
			for(int k = i +1 ; k < nums.length; k++)
			{
				if(nums[i] +  nums[k] == target)
					
				{
					int[] arr = new int[2];
					
					
					}
					
				}
				
			}
		}*/
	}

	
}