package day25;

import java.util.Scanner;

public class Pattern19 {
	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.close();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
					if(i == 1) {
						if(j <= n/2 +1 || j == n) {
							System.out.print("*\t");	
						}else {
							System.out.print("\t");
						}
					}
					else if(i !=1 && i <n/2+1) {
						if(j == n/2 +1 || j == n) {
							System.out.print("*\t");	
						}else {
							System.out.print("\t");
						}
					}else if(i > n/2+1) {
						if(j == n/2 +1 || j == 1) {
							System.out.print("*\t");	
						}else if( i ==n && j >= n/2+1) {
							
							System.out.print("*\t");
						}
						else {
							System.out.print("\t");
						}
					}else
						System.out.print("*\t");	
					
			}
			System.out.println();
		}
	}

}
