package day33;
import java.util.Scanner;

/**
 * 1. You are given a decimal number n. 
 * 2. You are given a base b. 
 * 3. You are required to convert the number n into its corresponding value in base b.
 * 
 * @author Durga Prasad
 *
 */
public class DecimalToAnyBase {
	
	 public static int getValueInBase(int n, int b){
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
	public static void main(String[] args) {
	      Scanner scn = new Scanner(System.in);
	      int n = scn.nextInt();
	      int b = scn.nextInt();
	      scn.close();
	      int dn = getValueInBase(n, b);
	      System.out.println(dn);
	   }
	  
	  
}
