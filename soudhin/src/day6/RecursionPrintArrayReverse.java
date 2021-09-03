package day6;


/**
 * Given an array print it in reverse order using recursion
 * @author Durga Prasad
 *
 */
public class RecursionPrintArrayReverse {
	
	
	public static void printReverse(int[] arr, int n) {
		
		if(n<0) return;  //base case
		
		System.out.println(arr[n]);
		
		printReverse(arr, n-1);
	}

	public static void main(String[] args) {
		printReverse(new int[] {5,6,7,8}, 3);
	}
	
}
