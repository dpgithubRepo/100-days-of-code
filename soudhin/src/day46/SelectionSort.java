package day46;

import java.util.Arrays;

public class SelectionSort {

	public static void sort(int[] arr) {
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = i+1; j < arr.length; j++) {
				if(arr[j] < arr[i]) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
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
