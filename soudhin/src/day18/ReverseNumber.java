package day18;

import java.util.Scanner;

/**
 * The Class ReverseNumber. Given the number, reverse it
 */
public class ReverseNumber {

	/**
	 * Prints the reverse.
	 *
	 * @param n the n
	 */
	public static void printReverse(int n) {
		String s = "";
		while(n > 0) {
			s+=  n % 10;
			n = n/10;
		}
		
		System.out.println(s);
	}
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number..");
		int n = scanner.nextInt();
		scanner.close();
		printReverse(n);
	}
	
	/**
	 * output
	 * =====
	 * Enter the number..
	 * 23654
	 * 45632
	 */
}
