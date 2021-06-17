package codeWars;

public class MeanOfArray {

	public static void main(String[] args) {
		
	MeanOfArray mean = new MeanOfArray();
	
		int[] marks = {2,2,2,2,2};
		
		System.out.println();mean.getAverage(marks);

	}
	
	public int getAverage(int[] marks) {
		
		
		int arrsize = marks.length;
		int total = 0;
		
		for(int i = 0; i < marks.length; i++) {
			total += marks[i];
			
		}
		int mean = total/arrsize;
		
		
		return mean;
	}
	
	

}
