package day5;

/**
 * Given a number n, then print 1,2,3,....n-1,n
 * @author Durga Prasad
 *
 */

public class RecursionPrintIncreasing {
	
	public static void recursivePrinting(int n ) {
		if(n==0) return; //base case
		recursivePrinting(n-1);
		System.out.println(n);
	}
	
	public static void main(String[] args) {
		recursivePrinting(10);
	}

}
