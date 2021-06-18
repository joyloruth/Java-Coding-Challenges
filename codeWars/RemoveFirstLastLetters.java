package codeWars;


/*Your goal is to create a function that removes the first and last characters of a string. 
  You're given one parameter, the original string. */


public class RemoveFirstLastLetters 
{
	

	public static void main(String[] args) 
	{
		String str = "eloquent";
		System.out.println(RemoveFirstLastLetters.remove(str));
		System.out.println(RemoveFirstLastLetters.removeLetters(str));

	}
	
	//my original solution 06/18/2021
	 static String remove(String str) 
	{
		String word = "";
		
			for(int i = 1; i < str.length() - 1; i++) 
			{
				word+= str.charAt(i);
			}
			
			return word;
	}
	 
	 
	//refactored solution
	static String removeLetters(String str) {
			return str.substring(1, str.length()-1);
		}
	 

}
