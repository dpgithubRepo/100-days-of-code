package day26;

import java.util.Scanner;

/**
 * Given a number and it's source base also input target base. The input number n would be converted to target base
 * @author Durga Prasad
 *
 */

public class GenericNumberConverter {
	
	public static int convertFromSrcBaseToTgtBase(int n, int _srcBase, int _tgtBase) {
		
		int ans = 0;
		
		int pow = 1;
		
		while( n > 0 ) {
			int rem = n % _tgtBase;
			
			n = n / _tgtBase;
			
			ans = ans + rem * pow;
			
			pow = pow * _srcBase;
					
		}
		
		return ans;
	}

	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Source number");
		int n = scanner.nextInt();
		
		System.out.println("Enter Source base");
		int _srcBase = scanner.nextInt();
		
		System.out.println("Enter the target base");
		int _tgtBase = scanner.nextInt();
		
		scanner.close();
		
		System.out.println("Conversion of " +  n + " from base " + _srcBase +" to " +_tgtBase +" = " + convertFromSrcBaseToTgtBase(n, _srcBase, _tgtBase));
	}
}
