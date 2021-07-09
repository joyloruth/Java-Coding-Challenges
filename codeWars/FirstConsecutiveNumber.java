package codeWars;

public class FirstConsecutiveNumber {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,7,8};
		
		for(int i = 0; i < arr.length; i++) {
			
			int nextIndex = i +1; 
		 if(nextIndex == arr[i + 1]) {
			 System.out.println("consec");
		 }
		 
		 else System.out.println(arr[i]);
			}
			
			

	}

}
