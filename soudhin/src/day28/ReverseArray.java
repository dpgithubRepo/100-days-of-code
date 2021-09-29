package day28;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Given an array reverse it
 * 
 * @author Durga Prasad
 *
 */
public class ReverseArray {
	
	
	public static void reverse(int[] arr) {
		
		int left = 0;
		
		int right = arr.length-1;
		
		while(left < right) {
			
			int temp = arr[left];
			
			arr[left] = arr[right];
			
			arr[right] = temp;
			
			right--;
			left++;
		}
		
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the size of the array");
		int n = scanner.nextInt();
		System.out.println("Enter the elments of the array");

		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {

			arr[i] = scanner.nextInt();
		}
		scanner.close();
		
		System.out.print("reverse of " + Arrays.toString(arr) + " is " );
		
		reverse(arr); 
		
		System.out.print(Arrays.toString(arr));
	}
}
