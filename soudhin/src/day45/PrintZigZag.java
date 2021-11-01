package day45;

import java.util.Scanner;

/**
 * Input 2 Output:  2 1 1 1 2 1 1 1 2 
 * Input 3 Output: 3 2 1 1 1 2 1 1 1 2 3 2 1 1 1 2 1 1 1 2 3 
 * Input 4 output: 4 3 2 1 1 1 2 1 1 1 2 3 2 1 1 1 2 1 1 1 2 3 4 3 2 1 1 1 2 1 1 1 2 3 2 1 1 1 2 1 1 1 2 3 4 
 * 
 * Use recursion
 * 
 * @author Durga Prasad
 *
 */
public class PrintZigZag {
	
	public static void printZZ(int n) {
		if(n == 0) return;
		
		System.out.print(n + " ");
		printZZ(n-1);
		System.out.print(n + " ");
		printZZ(n-1);
		System.out.print(n+ " ");
	}

	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.close();
		printZZ(n);
	}
}
