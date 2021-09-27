package day26;

import java.util.*;

/**
 * 
 * @author Durga Prasad
 *
 *
 * Given a decimal and base b, convert the decimal to the base b number
 */
public class ConverFromDecimal {
	
	public static int convertDecimalToBase(int n, int base) {
		
		int ans = 0;
		
		int p = 1;
		
		while(n > 0) {
			
			int rem = n % base;
			
			n = n / base;
			
			ans = ans + rem * p;
			
			p = p * 10;
			
		}
		
		return ans;
		
	}
	
	public static void main(String[] args) {
		
		System.out.println("Enter a decimal  number and base to which it has to be converted");
		Scanner scanner = new Scanner(System.in);
		int decimalNum = scanner.nextInt();
		int base = scanner.nextInt();
		scanner.close();
		
		System.out.println(convertDecimalToBase(decimalNum, base));
	}

}
