package day32;

import java.util.Scanner;

public class PatternPractice {
	
	public static void pattern17(int n) {
		int star = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				
				if (j <= n / 2 && i != n / 2 + 1) {
					System.out.print("\t");
				} else if (j <= n / 2  && i == n / 2 + 1) {
					System.out.print("*\t");
				} 
				
			}
			
			for(int k = 1; k <= star; k++) {
				System.out.print("*\t");
			}
			
			if(i<=n/2) {
				star++;
			}else {
				star--;
			}
			System.out.println();
		}

	}
	
	public static void pattern18(int n) {
		int space = 0;
		int star = n;
		
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= space ; j++) {
				System.out.print("\t");
			}
			for(int j = 1; j <= star ; j++) {
				
				if(i <= n/2 && j!=1 && j!= star & i!=1) {
					System.out.print("\t");
				}else {
					System.out.print("*\t");
				}
			}
			if( i< n/2+1) {
				space++;
				star -= 2;
			}else {
				space--;
				star += 2;
			}
			System.out.println();
		}
	
	}
	
	public static void pattern19(int n) {
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n; j++) {
				if(i ==1 ) {
					if(j <= n/2+1) {
						System.out.print("*\t");
					}
					else if(j > n/2+1 && j != n) {
						System.out.print("\t");
					}else {
						System.out.print("*\t");
					}
				}else if(i == n/2+1){
					System.out.print("*\t");
				}else if(i < n/2+1) {
					if(j==n ||  j ==n/2+1) {
						System.out.print("*\t");
					}else {
						System.out.print("\t");
					}
				}else if(i > n/2+1) {
					if(j == 1  || j == n/2+1) {
						System.out.print("*\t");
					}else {
						if(i ==n & j > n/2+1) {
							System.out.print("*\t");
						}else {
						System.out.print("\t");
						}
					}
				}
				
			}
			System.out.println();
		}
	}
	public static void main(String... args) {
		System.out.print("Enter the number");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.close();

		
		
	}
}
