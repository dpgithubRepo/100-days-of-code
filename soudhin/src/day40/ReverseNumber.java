package day40;
import java.util.Scanner;

/**
 * 
 * Given a number, print in reverse order.
 * 
 * ex: 12345 output: 54321
 * 
 * @author Durga Prasad
 *
 */
public class ReverseNumber {

	public static void main(String[] args) {
		Scanner scanner  = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.close();
		
		int ans = 0;
		scanner.close();
		int temp = n;
		int pow = 1;
		while(temp > 10) {
			temp /= 10;
			pow *= 10;
		}
		 temp = n;
		while(pow > 0) {
			int rem = temp % 10;
			temp = temp / 10;
			ans = ans + rem * pow;
			pow = pow/10;
		}
		
		System.out.println(ans);
	}
}
