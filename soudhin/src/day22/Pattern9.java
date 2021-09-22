package day22;
import java.util.Scanner;
public class Pattern9 {

	public static void main(String args[]) {
		System.out.println("Enter a number");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.close();
		
		for(int i = 1; i <= n; i++) {
			
			for(int j = 1; j <= n; j++) {
				
				if(i == j || (i+j == n+1)) {
					
					System.out.print("*\t");
				
				}else {
					
					System.out.print("\t");
				}
				
			}
			
			System.out.print("\n");
		}
	}
	
}
