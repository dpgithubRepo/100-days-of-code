package day6;


/**
 * Given an array print it contents using recursion
 * @author Durga Prasad
 *
 */
public class RecursionPrintArray {

	public static void print(int[] arr, int n) {
		
		if(n==(arr.length))return; //base case
		
		System.out.println(arr[n]);
		
		print(arr,n+1);
	
	}
	
	public static void main(String[] args) {
		print(new int[]{5,6,7,8},0);
	}
}
