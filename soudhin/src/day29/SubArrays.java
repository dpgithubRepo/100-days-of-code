package day29;

import java.util.Scanner;




/**
 *  Given, an array print all sub arrays.
 *  
 * @author Durga Prasad
 *
 */
public class SubArrays {

	
	// note array of length will have (n * (n+1))/2
	
	public static void printAllSubArrays(int[] arr) {
		int len = arr.length;
		
		for(int i = 0; i < len; i++) {
			
			for(int j = i; j < len; j++) {
				
				for(int k = i; k <= j; k++) {
					
					System.out.print(arr[k] + "\t");
				}
				
				System.out.println();
			}
			
		
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Enter the size of the array");
		
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] arr = new int[n];
		
		System.out.println("Enter the array Elements");
		for(int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}
		scanner.close();
		
		System.out.println("sub arrays as follows");
		printAllSubArrays(arr);
	}
}