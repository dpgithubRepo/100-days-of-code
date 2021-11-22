package day47;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Given an array of the unique integers, and a target value. print all the pairs which sum up to the target
 * 
 * @author Durga Prasad
 *
 */
public class TargetSumPairs {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int target = scanner.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}
		scanner.close();
		
		int left  = 0;
		int right = arr.length-1;
		
		// sort and meet in middle approach 
		
		//sort the array nlogn
		Arrays.sort(arr);
		
		while(left < right) { //until they meet  n
			int curVal = arr[left] +arr[right];
			if(curVal == target) {
				System.out.println("["+arr[left] + "," +arr[right] + "]");
				left++;
				right--;
			}else if(curVal < target) {
				left++;
			}else if (curVal > target){
				right--;
			}
		}
		
		//total complexity => nlogn +n => nlogn
		
	}

}
