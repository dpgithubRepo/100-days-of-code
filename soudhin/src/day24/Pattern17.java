package day24;
import java.util.*;

public class Pattern17 {

	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.close();
		int star = n/2+1;	
		for(int i = 1; i <=n ; i++) {
			
			for(int j = 1; j <= n/2; j++) {
				
				if(i == n/2+1) {
					System.out.print("*\t");
				}else {
					System.out.print("\t");
				}
			}
			
			for(int j = n/2+1; j <= star; j++) {
				System.out.print("*\t");
			}
			
			if(i <= n/2) {
				star++;
			}else {
				star--;
			}
			System.out.println();
		}
		
		
	}
	
}
