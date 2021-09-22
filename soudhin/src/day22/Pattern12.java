package day22;
import java.util.*;


public class Pattern12 {

	public static void main(String[] args) {
		
		System.out.println("Enter a number");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.close();
		
		int a = 0;
		int b = 1;
		for(int i = 1; i<=n ;i++) {
			
			for(int j = 1; j<=i; j++) {
				int c = a+b;
				System.out.print(a+"\t");
				a = b;
				b = c;
			}
			
			System.out.println();
		}
		
	}
}
