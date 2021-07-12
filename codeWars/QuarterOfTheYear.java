package codeWars;


public class QuarterOfTheYear 
{

	static int month  = 5;
	
	public static void main(String[] args)
	{
		System.out.println(month);
	}

    
	
	public static int quarterOfRefactored(int month)
	{
		return (int) Math.ceil(month/3);
	}
	
	
	public static int quarterOf(int month)
	{

		if(month <= 3) {
			return 1;
		}
		if(month >= 3 && month <= 6) 
		{
			return 2;
		}
		if(month >= 7 && month <= 9)
		{
			return 3;
		}
		if(month >= 10 && month <= 12) 
		{
			return 4;
		}
		return month;
		
	}



}