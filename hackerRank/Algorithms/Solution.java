package hackerRank.Algorithms;




import java.util.Scanner;

 class Result{


    public static int birthdayCakeCandles(int[] candles) {
    	
    	int max = 0;
    	int sum = 0;
		int answer = 0;
		
		for(int num : candles)
		{
			if(num == 0)
				sum += num;
				 answer = sum/num;			
		}
		
		return answer;
    }





	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		Result obj = new Result();
		
		int n = scan.nextInt();
		
		int[] candles = new int[n];
		
		
		
		for(int i = 0 ; i < n; i ++ ) {
			candles[i] = scan.nextInt();
		}
		
		int sum = 0;
		int answer = 0;
		
	/*	for(int num : candles){
			if(num == Collections.max(candles))
				sum += num;
				 answer = sum/num;
			
			
		}*/
		
		
	//	obj.birthdayCakeCandles(candles);
		
	//	System.out.println(max);
	}

	}
