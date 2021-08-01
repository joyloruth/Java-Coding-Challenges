package codeWars;

public class IsLoveAndGreet {

	public static void main(String[] args) 
	{
		System.out.println(solution(1));
	}
	
	public static String solution(int n ) {
		
		n = 1990;
		String encode = null;
		
		if(n%1000 == 0) {
			encode+="M";
		}
		
		
		if ( n == 1) {return "I";}
		if ( n == 5) {return "V";}
		if ( n == 10) {return "X";}
		if ( n == 50) {return "L";}
		if ( n == 100) {return "C";}
		if ( n == 500) {return "D";}
		return "M";
		
	}
	
	//Will you make it? distance to pump challenge
	public static boolean zeroFuel(double distanceToPump, double mpg, double fuelLeft) {
		    if(distanceToPump == 0 && mpg == 0 && fuelLeft == 0) return false;
		    return (distanceToPump / mpg == fuelLeft)? true:false;
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
	
	


