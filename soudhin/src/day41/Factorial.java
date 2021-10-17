package day41;
import java.util.Scanner;

/**
 * 
 * Given a number n, find f! using recursion
 * 
 * @author Durga Prasad
 *
 */
public class Factorial {
	
	public static int fact(int n) {
		
		if(n == 1) return 1;
		
		return n * fact(n-1);
		
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.close();
		
		System.out.println(fact(n));
	}

}
