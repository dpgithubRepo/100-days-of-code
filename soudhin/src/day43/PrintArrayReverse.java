package day43;

import java.util.Scanner;


/**
 * Given an array print the elements in reverse using recursion
 * 
 * @author Durga Prasad
 *
 */
public class PrintArrayReverse {
	
	public static void printReverse(int[] arr, int index) {
		if(index ==arr.length) return;
		printReverse(arr, index+1);
		System.out.println(arr[index]);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int len = scanner.nextInt();
		int [] arr = new int[len];
		for(int i = 0; i < len; i++) {
			arr[i] = scanner.nextInt();
		}
		scanner.close();
		printReverse(arr, 0);
	}
}
