package codeWars;

public class SumArray {

	public static void main(String[] args) {
		int[] arr = {5,3,2,1,7};
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		
		System.out.println(sum);

	}

}
