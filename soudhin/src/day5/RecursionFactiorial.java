package day5;


/**
 * Given a number n , get factorial of n  = n*n-1*n-2....*1
 * @author Durga Prasad
 *
 */
public class RecursionFactiorial {
	
	public static int factorial(int n) {
		if(n==1) return 1;
		return n*factorial(n-1);
	}
	
	public static void main(String[] args) {
		System.out.println(factorial(5));
		System.out.println(factorial(6));
	}

}
