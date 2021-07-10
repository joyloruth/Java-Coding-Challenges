package hackerRank.dataStructures;

public class LeftRotation 
{

	public static void main(String[] args) 
	{
		
		int[] arr = {1,2,3,4,5};
		int[] newArr = new int[arr.length];
		int n = 5; 
		int rotation = 4;
		
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] == 5) {
				newArr[i] = arr[i + 1];
			}
		}
			
		for(int i :arr) {
			System.out.println(i);
		}
		
		String word = "word";
		
		word.toLowerCase();
		
	}

}


