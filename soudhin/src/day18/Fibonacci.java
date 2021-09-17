package day18;

import java.util.Scanner;
/**
 * Given a number n, print fibonacci until n.
 *
 * @author Durga Prasad
 */

public class Fibonacci {
	
	/**
	 * Prints the fibonacci.
	 *
	 * @param n the n
	 */
	public static void printFibonacci(int n) {
		int a = 0;
		int b = 1;
		for(int i=1;i<=n;i++) {
			System.out.println(a);
			int c = a+b;
			a=b;
			b=c;
		}
	}
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = scanner.nextInt();
		printFibonacci(n);
	}
	
	/**
	 * output
	 * ======
	 * Enter the number 
	 * 10
	 * 0
	 * 1
	 * 1
	 * 2
	 * 3
	 * 5
	 * 8
	 * 13
	 * 21
	 * 34
	 */
}
