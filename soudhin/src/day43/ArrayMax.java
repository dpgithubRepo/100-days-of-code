package day43;

import java.util.Scanner;
/**
 * Given an array, find the max of the array using recursion
 * @author Durga Prasad
 *
 */
public class ArrayMax {

	public static int maxOfArray(int [] arr, int idx) {
		if(idx == arr.length-1)
			return arr[arr.length-1];
		
		int current = arr[idx]; 
		int maxOfRem = maxOfArray(arr, idx+1);   //maxOfRem is max from idx+1 to end
		int max = current > maxOfRem ? current : maxOfRem;
		return max;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int len = scanner.nextInt();
		int[] arr = new int[len];
		for (int i = 0; i < len; i++) {
			arr[i] = scanner.nextInt();
		}
		scanner.close();
		System.out.println(maxOfArray(arr, 0));
	}
}
