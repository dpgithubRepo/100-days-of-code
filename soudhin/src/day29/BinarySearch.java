package day29;

import java.util.Scanner;


/**
 * Binary search in an array.
 * 
 * pre-requisite - array must be sorted 
 *   
 * @author Durga Prasad
 *
 */
public class BinarySearch {
	
	public static int binarySeach(int[] arr, int target) {
		
		int left = 0;
		int right = arr.length-1;
		
		while(left <= right) {
			
			int mid = (left + right)/2;
			
			if(arr[mid] == target) {
				return mid;
			}else if(arr[mid] > target) {
				right = mid - 1;
			}else {
				left = mid + 1;
			}
		}
		
		return -1;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the size of the array");
		int n = scanner.nextInt();
		int[] arr = new int[n];
		
		System.out.println("Enter the array elements");
		
		for(int i = 0; i <n ;i++) {
			arr[i] = scanner.nextInt();
		}
		
		
		System.out.println("Enter the target element");
		int target = scanner.nextInt();
		scanner.close();
		
		
		System.out.println(binarySeach(arr, target));
	}

}
