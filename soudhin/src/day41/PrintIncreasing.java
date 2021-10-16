package day41;
import java.util.Scanner;


/**
 * Given a positive integer n , print 0,1,2,3......n-2, n-1,n using recursion
 * @author Durga Prasad
 *
 */

public class PrintIncreasing {

	public static void printIncreasing(int n) {
		if(n == 0) return;
		
		printIncreasing(n-1);
		
		System.out.println(n);
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	    int n = scanner.nextInt();
	    scanner.close();
	    
	    printIncreasing(n);
	}
}
