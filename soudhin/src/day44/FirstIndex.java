package day44;

import java.util.Scanner;
/**
 * Given an integer array, target element find first index of the target element if exists
 * else return -1 using recursion
 * 
 * @author Durga Prasad
 *
 */
public class FirstIndex {
	
	public static int findFirstIndex(int[]arr, int t, int idx) {
		if(arr[idx] == t) return idx;
		if(idx == arr.length-1) return -1;
		
		return findFirstIndex(arr, t, idx+1);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int len = scanner.nextInt();
		int target = scanner.nextInt();
		int[] arr = new int[len];
		for (int i = 0; i < len; i++) {
			arr[i] = scanner.nextInt();
		}
		
		scanner.close();
		
		
		System.out.println(findFirstIndex(arr, target, 0));
	}

}
