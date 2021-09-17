package day18;

import java.util.Scanner;;

/**
 * Given range  lower and upper limit print all primes .
 *
 * @author Durga Prasad
 */
public class PrintPrimes {
	
	/**
	 * Checks if is prime using sq root.
	 *
	 * @param n the n
	 * @return true, if is prime using sq root
	 */
	public static boolean isPrimeUsingSqRoot(int n) {
		for(int i=2;i*i<=n;i++) { //run loop until sqrt(n)
			if(n%i==0)  return false;
		}
		return true;
	}
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter lower limit");
		int low = scanner.nextInt();
		System.out.println("Enter upper limit");
		int upper = scanner.nextInt();
		for(int i=low;i<=upper;i++) {
			if(isPrimeUsingSqRoot(i)) System.out.println(i);
		}
		scanner.close();
	}
	
	/**
	 * output  
	 * =======================
	 * Enter lower limit
	 * 4
	 * Enter upper limit
	 * 24
	 * 5
	 * 7
	 * 11
	 * 13
	 * 17
	 * 19
	 * 23
	 */
}
