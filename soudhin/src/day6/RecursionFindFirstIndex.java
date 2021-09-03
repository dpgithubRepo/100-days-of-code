package day6;
/**
 * 
 * 
 * @author Durga Prasad
 *
 *Given an array and a value, find the first index of the value
 */
public class RecursionFindFirstIndex {

	
	public static int findFirstIndex(int[] arr, int n, int val) {
		
		//base case
		if(n==arr.length) return -1;
		
		if(arr[n]==val) return n;
		return findFirstIndex(arr, n+1, val);
	}
	
	public static void main(String[] args) {
		System.out.println(findFirstIndex(new int[] {10,20, 30,56,30,78,30}, 0, 30));
		
		System.out.println(findFirstIndex(new int[] {10,20, 30,56,30,78,30}, 0, 300));
		
		System.out.println(findFirstIndex(new int[] {10,20, 30,56,30,78,300}, 0, 300));
		
		System.out.println(findFirstIndex(new int[] {300,10,20, 30,56,30,78,30}, 0, 300));
	}
}
