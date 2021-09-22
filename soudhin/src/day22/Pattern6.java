package day22;

import java.util.Scanner;

public class Pattern6 {

	public static void main(String[] args) {
		
		System.out.println("Enter a number");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.close();
		
		int star = n/2 + 1;
		int space = 1;
		
		for(int i = 1; i <=n ; i++) {
			
			for(int j = 1; j<= star; j++) {
				System.out.print("*\t");
			}
			
			for(int j = 1; j<= space; j++) {
				System.out.print("\t");
			}
			
			for(int j = 1; j<= star; j++) {
				System.out.print("*\t");
			}
			
			if(i<=n/2) {
				
				star--;
				space += 2;
				
			}else {
				
				star ++;
				space -= 2;
			}
			System.out.println();
		}
	}
	
}
