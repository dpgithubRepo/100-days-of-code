package day22;

import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {
		
		System.out.println("enter a  number");
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		scn.close();
		
		for(int i = 1;  i <= n; i++) {
			
			for(int j = 1; j<= n-i+1; j++) {
				
				System.out.print("*\t");
			}
			
			System.out.print("\n");
		}
		
	}
}
