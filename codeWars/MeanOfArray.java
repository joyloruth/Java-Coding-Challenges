package codeWars;

public class MeanOfArray {

	public static void main(String[] args) {
		
	MeanOfArray mean = new MeanOfArray();
	
		int[] marks = {2,2,2,2,2};
		
		System.out.println(mean.getAverage(marks));

	}
	
	public int getAverage(int[] marks) {
		
		
		
		int total = 0;
		
		for(int mark: marks )
		{
			total += mark;
			
		}
		
		
		
		return total/marks.length;
	}
	
	

}
