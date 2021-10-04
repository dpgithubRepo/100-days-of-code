package day26;

import java.util.Scanner;

/**
 * Given a number n and it's base _srcBase also input target base _tgtBase . 
 * 
 * The input number n  would be converted from _srcBase to _tgtBase
 * @author Durga Prasad
 *
 */

public class GenericNumberConverter {
	
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
