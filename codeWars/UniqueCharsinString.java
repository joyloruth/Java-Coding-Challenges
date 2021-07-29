package codeWars;

public class UniqueCharsinString {

	public static void main(String[] args) {
		int target = 5;
		int rotatedIndex = 4;
		int startIndex;
		int[] array = {1,2,3,4,5};
		
		int size = array.length;
		
		int[] newArray = new int[size];
		
		while( rotatedIndex < size) {
			
		}
		
		
		
		}
	
	
	public static boolean uniqueLetters(String[] word) {
		
		for(int i = 0 ; i < word.length; i++) 
		{
			for(int j = i + 1; i < word.length; i++) 
			{
				if(word[j] == word[i]) 
				{
					return true;
				}
				
				return false;
			}
		}
		return false;
	}
	
}
	


