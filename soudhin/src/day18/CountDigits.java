package day18;

import java.util.*;


/**
 * Given a number count the number of digits.
 *
 * @author Durga Prasad
 */
public class CountDigits {
	
	/**
	 * Count digits.
	 *
	 * @param n the n
	 * @return the int
	 */
	public static int countDigits(int n) {
		int count = 0;
		while(n>0) {
			count++;
			n=n/10;
		}
		return count;
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
	  System.out.println(countDigits(n));
	  scanner.close();
	  
	  /**
	   * Output
	   * Enter the number
	   * 23467
	   * 5
	   */
	}
}
