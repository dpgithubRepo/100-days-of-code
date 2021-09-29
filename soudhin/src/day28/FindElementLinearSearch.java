package day28;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Given an element check if it is present in array and return index if present else -1
 * @author Durga Prasad
 *
 */
public class FindElementLinearSearch {
	
	public static int findElementIndex(int[] arr , int target) {
		
		for(int i = 0; i < arr.length; i++) {
			
			if(arr[i] == target) return i;
			
		}
		
		return -1;
	}
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the size of the array");
		int n = scanner.nextInt();
		System.out.println("Enter the elments of the array");
		
		int[] arr = new int[n];
		
		for(int i = 0; i < n ; i++) {
			
			arr[i] = scanner.nextInt();
		}
		
		
		System.out.println("Enter the target element to find in the array");
		
		int target = scanner.nextInt();
		
		scanner.close();
		
		System.out.println("index of "+  target+ " in the array " + Arrays.toString(arr) + " is " +  findElementIndex(arr, target));
	}

}
