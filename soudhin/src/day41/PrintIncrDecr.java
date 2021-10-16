package day41;
import java.util.Scanner;

/**
 * Given a number n print decreasing and increasing (n, n-1, n-2, n-3....1,1,2,3,4,...n-2,n-1,n)
 *  if n= 5; print 5 4 3 2 1 1 2 3 4 5
 * 
 * @author Durga Prasad
 *
 */
public class PrintIncrDecr {
	
	public static void printDecrIncr(int n) {
		if(n==0) return;
		System.out.println(n);
		printDecrIncr(n-1);
		System.out.println(n);
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.close();
		printDecrIncr(n);
	}

}
