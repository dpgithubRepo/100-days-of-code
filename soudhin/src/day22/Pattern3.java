package day22;
import java.util.*;

public class Pattern3 {

	public static void main(String[] str) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = scanner.nextInt();
		scanner.close();
		
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <=n-i ; j++) {
				System.out.print("\t");
			}
			
			for(int j = 1; j<= i ; j++) {
				System.out.print("*\t");
			}
			
			System.out.print("\n");
		}
	}
}
