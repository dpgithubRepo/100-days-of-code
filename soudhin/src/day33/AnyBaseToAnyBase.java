package day33;
import java.util.Scanner;

/**
 * 1. You are given a number n.
 * 2. You are given a base b1. n is a number on base b. 
 * 3. You are given another base b2.
 * 4. You are required to convert the number n of base b1 to a number in base b2.
 * 
 * @author Durga Prasad
 *
 */
public class AnyBaseToAnyBase {
	
	public static int convertSrcBaseToDestBase(int n, int srcBase, int destBase) {
		int ans = getValueIndecimal(n, srcBase);
		ans = getValueInBaseFromDecimal(ans, destBase);
		return ans;
		
	}
	public static int getValueInBaseFromDecimal(int n, int b){
		 int ans = 0;
		 int pow = 1;
		 while(n > 0) {
			 int rem = n % b;
			 n = n / b;
			 ans = ans + (rem * pow);
			 pow = pow*10;
		 }
		 
		 return ans;
	   }
	 public static int getValueIndecimal(int n, int b){
	     int ans = 0;
	     int pow = 1;
	     while(n > 0) {
	    	 int rem = n % 10;
	    	 n = n / 10;
	    	 ans = ans + rem * pow;
	    	 pow = pow * b ;
	     }
	     return ans;
	   }
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int sourceBase = scn.nextInt();
		int destBase = scn.nextInt();
		scn.close();
		int ans = convertSrcBaseToDestBase(n, sourceBase, destBase);
		System.out.println(ans);
	}
}
