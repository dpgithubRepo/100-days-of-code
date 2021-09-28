package day27;

import java.util.Scanner;

/**
 * Any base addition
 * @author Durga Prasad
 *
 */

public class AnyBaseAddition {

	
	public static int add(int n1, int n2, int base) {
		int ans = 0;
		
		int carry = 0;
		int pow = 1;
		
		while(n1 > 0 || n2 > 0  || carry > 0) {
			
			int d1 = n1 % 10;
			int d2 = n2 % 10;
			
			n1 = n1/10;
			n2 = n2/10;
			
			int d = d1 + d2 + carry;
			
			if(d >= base) {
				 carry = 1;
				 d = d - base;
			}else {
				 carry = 0;
			}
			
			ans = ans + d * pow;
			pow = pow * 10;
		}
		
		return ans;
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number 1");
		
		int n1 = scanner.nextInt();
		
		System.out.println("Enter number 2");
		
		int n2 = scanner.nextInt();
		
		System.out.println("Enter base");
		
		int base = scanner.nextInt();
		
		scanner.close();
		
		System.out.println("Adding " + n1 +" and " +  n2 +" of base " + base+ " = " +add(n1, n2, base));
		
		
	}
}
