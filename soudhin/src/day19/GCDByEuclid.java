package day19;

import java.util.*;

/**
 * 
 * given two numbers a & b (a>b) as per Euclid method gcd(a,b) is same as gcd(a-b,b)
 * 
 * @author Durga Prasad
 *
 */
public class GCDByEuclid {

	public static int findGCDNaive(int a, int  b) {
		int gcd = 1;
		int small = a>b?a:b;
		for(int i=1;i<small;i++) {
			if(a%i==0 && b%i==0) {
				gcd = i;
			}
		}
		return gcd;
	}
	
	// assuming a>b
	/**
	 * Euclid method is better than naive method but if one number is much larger than other this also performs slow	
	 * @param a
	 * @param b
	 * @return
	 */
	public static int findGCDEuclid(int a, int  b) {
		int gcd = findGCDNaive(a-b, b);
		return gcd;
	}
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first number");
		int a = scanner.nextInt();
		System.out.println("Enter the second number");
		int b = scanner.nextInt();
		scanner.close();
		
		
		System.out.println("GCD Calculated by Naive method "+findGCDNaive(a, b));
		System.out.println("GCD Calculated by Naive method "+findGCDEuclid(a, b));
	}
	
	
}
