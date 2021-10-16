package day41;

import java.util.Scanner;


/**
 * Given a positive integer n , print n, n-1, n-2, n-3, ......3,2,1. using recursion
 * @author Durga Prasad
 *
 */
public class PrintDecreasing {

	public static void printDecreasing(int n) {
		if (n == 0)
			return;
		System.out.println(n);
		printDecreasing(n - 1);

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.close();
		printDecreasing(n);
	}
}
