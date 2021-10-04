package day33;

import java.util.Scanner;

/**
 * 1. You are given a number n. 
 * 2. You are given a base b. n is a number on base b. 
 * 3. You are required to convert the number n into its corresponding value
 * in decimal number system.
 * 
 * @author Durga Prasad
 *
 */
public class AnyBaseToDecimal {
	
	
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
	      int b = scn.nextInt();
	      scn.close();
	      int d = getValueIndecimal(n, b);
	      System.out.println(d);
	   }
	  
	  }
