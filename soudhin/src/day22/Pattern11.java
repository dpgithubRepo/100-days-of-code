package day22;
import java.util.Scanner;

public class Pattern11 {
	
	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.close();
		
		int count = 1;
		
		for(int i = 1; i <= n  ; i++) {
			
			for(int j =1; j <= i; j++) {
				
				System.out.print(count++ + "\t");
			}
			
			System.out.println();
		}
	}

}
