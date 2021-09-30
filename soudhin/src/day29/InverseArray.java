package day29;

import java.util.Arrays;
import java.util.Scanner;


/**
 * Inverse of an array;
 * 
 * Inverse of an array means if the array elements are swapped with their corresponding indices 
 * 
 * ex: input array = [2,4,1,0,3] inverse of this array is [3, 4, 2, 0, 1]
 * 
 * constraints : indexes and the values should be unique and in same range
 * 
 * @author Durga Prasad
 *
 */

public class InverseArray {

	
	public static int[] inverseArray(int[] arr) {
		
		int len = arr.length;
		
		int[] inverse = new int[len];
		
		for(int i = 0; i < len; i++) {
			
			int val = arr[i];
			
			inverse[val] = i;
		}
		
		return inverse;
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n = scanner.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the array elements");
		
		for(int i = 0; i < n ; i++) {
			arr[i]= scanner.nextInt();
		}
		
		scanner.close();
		
		System.out.println("inverse of " + Arrays.toString(arr) +" = "+Arrays.toString(inverseArray(arr)));
		
	}
}
