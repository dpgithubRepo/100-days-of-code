package day48;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {

	public static int[] merge2SortedArrays(int[] a, int[] b) {
		int len = a.length + b.length;
		int[] res = new int[len];
		int i = 0, j = 0, k= 0;
		while(i < a.length && j < b.length) {
			if(a[i] == b[i]) {
				res[k] = a[i];
				k++; i++;
				res[k] = b[j];
				j++; k++;
			
			}else if(a[i] < b[j]) {
				res[k] = a[i];
				k++; i++;
				
			}else if(b[j] < a[i]) {
				res[k] = b[j];
				j++; k++;
			}
		}
		for(int x = i; x < a.length; x++) {
			res[k] = a[x];
			k++;
		}
		for(int x = j; x < b.length; x++) {
			res[k] = b[x];
			k++;
		}
		return res;
	}
	
	public static int[] mergeSort(int [] a, int low, int  high) {
		if(low == high) {
			int[] res = new int[1];
			res[0] = a[low];
			return res;
		}
		int mid = (low + high) / 2;
		int[] firstSortedArray = mergeSort(a, low, mid);
		int[] secondSortedArray = mergeSort(a, mid+1, high);
		int[] res = merge2SortedArrays(firstSortedArray, secondSortedArray);
		return res;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n ; i++) {
			arr[i] = scanner.nextInt();
		}
		scanner.close();
		System.out.println(Arrays.toString(mergeSort(arr, 0, arr.length-1)));
	}
}
