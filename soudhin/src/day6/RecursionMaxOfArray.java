package day6;


/**
 * Given a array, find the max in array using the recursion
 * @author Durga Prasad
 *
 */
public class RecursionMaxOfArray {

	public static int maxOfArray(int[] arr, int n) {
		//base case
		if(n==arr.length-1) {
			return arr[n];
		}
		
		int max = maxOfArray(arr, n+1);
		if(arr[n]>max) 
			return arr[n];
		else
			return max;
		
	}
	
	public static void main(String[] args) {
		System.out.println(maxOfArray(new int[] {10, 22,33,44,87,4,102,3,5}, 0));
		
		System.out.println(maxOfArray(new int[] {300,10, 22,33,44,87,4,102,3,5}, 0));
		
		System.out.println(maxOfArray(new int[] {300,10, 22,33,44,87,4,102,3,500}, 0));
	}
}
