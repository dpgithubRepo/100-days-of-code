package day26;
import java.util.Scanner;


public class ConvertFromAnyBaseToDecimal {
	
	
	public static int convertToDecimalFromBase(int n, int base ) {
		
		int ans = 0;
		
		int pow = 1;
		
		while( n > 0) {
			
			int rem = n % 10;
			
			n = n / 10;
			
			ans = ans + rem * pow;
			
			pow  = pow * base;
		}
		
		return ans;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number and it's base");
		int n = scanner.nextInt();
		int base = scanner.nextInt();
		scanner.close();
		
		System.out.println(convertToDecimalFromBase(n, base));
	}

}
