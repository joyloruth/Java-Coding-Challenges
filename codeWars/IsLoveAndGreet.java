package codeWars;

public class IsLoveAndGreet {

	public static void main(String[] args) 
	{
		
		
	 
		
	}
	
	
		
		
	static String greet(String name, String owner) {
		
        return name.equals(owner)? "Hello boss":"Hello guest";
    }
	
	
	public static boolean isLove(final int flower1, final int flower2) {
		
		
		return (flower1%2 == 0 && flower2 %2 == 1 || flower2%2 == 0 && flower1 %2 == 1 ) ? true:false;
	  }
	  

	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static int squarenSum(int[] arr)
	{
			int sum = 0;
			for(int i = 0; i < arr.length; i++)
			{
				sum += (int) Math.pow(arr[i], 2);
				 
			}
			return sum;
		}
		
			
	}
	
	


