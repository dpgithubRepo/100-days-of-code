package day19;


/**
 * GCD of two numbers a &b is c where c is the largest number which divides both the numbers a & b
 *    
 * @author Durga Prasad
 *
 */
public class GCD {

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
	
	public static void main(String[] args) {
		System.out.println(findGCDNaive(5, 10));
		System.out.println(findGCDNaive(6, 24));
		System.out.println(findGCDNaive(6, 23));
	}
}
