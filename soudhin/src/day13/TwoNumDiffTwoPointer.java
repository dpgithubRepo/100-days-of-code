package day13;


/**
 *  * Given a sorted array arr, check if there exists a pair(i,j) such that
 * arr[i]-arr[j] = k.
 *
 * @author Durga Prasad
 */
public class TwoNumDiffTwoPointer {

	/**
	 * Diff pair exists.
	 *
	 * @param arr the arr
	 * @param k the k
	 * @return true, if successful
	 */
	public static boolean diffPairExists(int[] arr, int k) {
		int p1=0;
		int p2 =1;
		int n = arr.length;
		while(p2<n) {
			
			if(arr[p1]-arr[p2]>k) {
				p1++;
			}if(arr[p1]-arr[p2]<k) {
				p2++;
			}else {
				return true;
			}
			
			if(p1==p2)p2++;
		}
		
		return false;
		
	}
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		System.out.println(diffPairExists(new int[] {-3,0,1,3,6,8,11,14,18,25}, 2));
		System.out.println(diffPairExists(new int[] {-3,0,1,3,6,8,11,14,18,25}, -4));
		System.out.println(diffPairExists(new int[] {-3,0,1,3,6,8,11,14,18,25}, -28));
		System.out.println(diffPairExists(new int[] {-3,0,1,3,6,8,11,14,18,25}, -3));
	}
	
}
