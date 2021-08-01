package hackerRank.dataStructures;

public class SubArray {

	public static void main(String[] args) {
		int[] a = {1,-2,4,5,1};
		int sum = 0;
		
		for(int i = 0; i < a.length; i++) {
			for(int j = i+1; j < a.length; j++) 
			{
				sum = a[i] + a[j];
				System.out.println(a[i] +" "+ a[j] +  " = " + sum);
				
			}
		}

	}

}
