/**
 * 
 */
package hackerRank.Algorithms;

/**
 * @author Joy LoRuth
 *
 */
public class FindMiddleIndex {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int[] array = {19,2,3,40,59,6,7,90,101,20};
		
		int end = array.length;
		
		int start = array[0];
		
		int mid = array[end/2];
		
		int[] leftSide = new int[mid];
		int[] rightSide = new int[mid];
		
		for(int i = 0; i < mid; i ++) {
			 leftSide[i] = array[i];
		}
		
		for(int i = mid +1 ; i < array.length; i ++) {
			 rightSide[i] = array[i];
		}
		
		for(int i: leftSide) {
			System.out.println("left: " + i);
		}
		
		for(int i: rightSide) {
			System.out.println("right:" + i);
		}
		
	}

}
