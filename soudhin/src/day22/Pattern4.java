package day22;
import java.util.Scanner;

public class Pattern4 {

	public static void main(String [] args) {
		System.out.println("Enter a number");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.close();
		
		for(int i = 1; i<=n; i++ ) {
			
			for(int j = 1 ; j<= i-1; j++) {
				System.out.print("\t");
			}
			
			for(int j = 1; j <= n-i+1 ; j++) {
				System.out.print("*\t");
			}
			
			System.out.println();
		}
	}
}
