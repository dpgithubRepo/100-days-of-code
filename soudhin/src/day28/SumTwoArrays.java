package day28;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Given two arrays sum the elements of the array and print the result
 * @author Durga Prasad
 *
 */
public class SumTwoArrays {
	
	public static void sumTheArrays(int [] a1, int [] a2) {
		
		int [] result = new int[ a1.length > a2.length ? a1.length :a2.length ];  // declare result array with max size of either a1 or a2
		
		int i = a1.length - 1;
		
		int j = a2.length - 1;
		
		int k = result.length - 1;
		
		int c = 0 ; //for carry
		
		while(k >= 0) {
			
			int d = c;
			
			if(i >= 0 ) d += a1[i];
			
			if(j >= 0) d += a2[j];
			
			c = d/10;
			
			d = d % 10;
			
			result[k] = d;
			
			i--;
			j--;
			k--;
		}
		
		if(c > 0 ) System.out.print(c + " ");
		
		for(int res : result) {
			System.out.print( res + " ");
		}
		
	}

	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the size of the first array");
		int n = scanner.nextInt();
		System.out.println("Enter the elements of the first array");
		
		int[] arr1 = new int[n];
		
		for(int i = 0; i < n ; i++) {
			
			arr1[i] = scanner.nextInt();
		}
		
		
		System.out.println("enter the size of the second array");
		 n = scanner.nextInt();
		 
		System.out.println("Enter the elements of the second array");
		
		int[] arr2 = new int[n];
		
		for(int i = 0; i < n ; i++) {
			
			arr2[i] = scanner.nextInt();
		}
		
		scanner.close();
		
		System.out.print(Arrays.toString( arr1)  + " + " + Arrays.toString( arr2 ) + " = ");
		sumTheArrays(arr1, arr2);
	}
}
