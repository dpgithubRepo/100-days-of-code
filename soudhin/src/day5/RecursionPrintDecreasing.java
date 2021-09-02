package day5;

/**
 * 
 * given a number n print n, n-1, n-2,......1,0;
 * @author Durga Prasad
 *
 */

public class RecursionPrintDecreasing {

	public static void recursivePrint(int n) {
		//base case 
		if(n<0) return;
		System.out.println(n);
		recursivePrint(n-1);
	}
	
	public static void main(String[] args) {
		recursivePrint(10);
	}

}
