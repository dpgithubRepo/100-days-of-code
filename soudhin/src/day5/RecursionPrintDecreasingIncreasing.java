package day5;


/**
 * Given a number print decreasing and increasing
 *  if n= 5; print 5 4 3 2 1 1 2 3 4 5
 * 
 * @author Durga Prasad
 *
 */
public class RecursionPrintDecreasingIncreasing {
	
	
	public static void printDecIncr(int n) {
		
		if(n==0) return; //base case
		
		System.out.println(n);
		printDecIncr(n-1);
		System.out.println(n);
		
	}
	
	public static void main(String[] args) {
		printDecIncr(5);
		printDecIncr(10);
	}

}
