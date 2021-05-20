package hackerRank;

class Arithmetic
{
	public int add(int one, int two)
	{
		int sum = one + two; 
		return sum;
	}
}

class Adder extends Arithmetic{

	
}

public class Inheritance
{

	public static void main(String[] args)
	{
		//create a new adder object
		Adder a = new Adder();
		
		 System.out.println("My superclass is: " + a.getClass().getSuperclass().getName());
		 System.out.print(a.add(10, 32) + " " + a.add(10, 3) + " " + a.add(10, 10) );
		
		 
	}

}
