package day18;

import java.util.Scanner;

/**
 * Given a number print the digits.
 *
 * @author Durga Prasad
 */
public class PrintDigits {
	
	/**
	 * Prints the digits.
	 *
	 * @param n the n
	 */
		public static void printDigits(int n) {
			while(n>0) {
				int rem = n%10;
				n = n/10;
				System.out.println(rem);
			}
		}
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter  the number");
		int n = scanner.nextInt();
		printDigits(n);
		scanner.close();
		
		/**
		 * output
		 * =====
		 * 
		 * enter  the number
		 * 345765
		 * 5
		 * 6
		 * 7
		 * 5
		 * 4
		 * 3
		 */
	}

}
