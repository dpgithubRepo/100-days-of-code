package day47;

import java.util.Arrays;
import java.util.Scanner;

public class TargetSumTriplets {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int n = scanner.nextInt();
	int target = scanner.nextInt();
	int[] arr = new int[n];
	for(int i = 0; i < n; i++) {
		arr[i] = scanner.nextInt();
	}
	scanner.close();
	
	//sort the array
	Arrays.sort(arr); //nlogn
	
	for(int i = 0; i < arr.length; i++) {
		
		int temp = target - arr[i];
		int left = i+1;
		int right = arr.length-1;
		
		
		//meet  in middle for the next two elements
		while(left < right) {
			int curVal = arr[left] + arr[right];
			if(curVal == temp) {
				System.out.println("["+arr[i] +","+ arr[left] +","+arr[right]+"]");
				left++;
				right++;
			}else if(curVal < temp) {
				left++;
			}else if(curVal > temp) {
				right--;
			}
			
		}
	}
}
}
