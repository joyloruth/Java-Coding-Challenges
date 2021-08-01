package hackerRank;





public class JavaIterator {

	public static void main(String[] args)
	{
		
		
		int[] arr = {1, -2, 4, -5, 1};
		// int num = 5;
		
		for(int i = 0; i < arr.length; i++) 
		{
			for(int j = i; j < arr.length; j++ ) 
			{
				int currentSum = arr[i] + arr[j];
				
				for(int k = i; k <=j; k++) {
					System.out.println(arr[k]);
				}
			}
		}
		
		
		

	}

}
