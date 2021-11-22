package day46;

import java.util.Arrays;

/**
 * 
 * @author Durga Prasad
 * 
 * O(n^2)
 *
 */
public class BubbleSort {
	
	
	public static void sort(int[] arr) {
		
		for(int i = 0; i < arr.length-1; i++) {
			for(int j = 0 ; j < arr.length-i-1; j++) {
				if(arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
	}
	
	public static void main(String[] args) {
		int [] arr = {-2,10,5,6,9,2,3,-1,-10};
		sort(arr);
		System.out.println(Arrays.toString(arr));
	}

}
