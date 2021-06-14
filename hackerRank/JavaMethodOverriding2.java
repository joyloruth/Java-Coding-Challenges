package hackerRank;

import java.util.Scanner;
import java.util.regex.Pattern;

public class JavaMethodOverriding2 {

	
	
	
		
		
	public static void main(String[] args)
	{
		
	}
	
		
	class Bicycle
	{
		String define_me()
		{
			return "a vechicle with pedals";
		}	
	}
		
	public class Motorcycle extends Bicycle{
		
		String define_me()
		{
			return "a cycle with an engine";
		}
		
		Motorcycle()
		{
			String temp = super.define_me();
			System.out.println("motor sport");
		}
		
		
	}
	
	

}
