package day47;

import java.util.*;


/**
 * Given two sorted arrays, merged them into a sorted array.
 * 
 * @author Durga Prasad
 *
 */
public class MergeTwoSortedArrays {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n1 = scanner.nextInt();
		int n2 = scanner.nextInt();
		
		int[]arr1 = new int[n1];
		int[]arr2 = new int[n2];
		
		for(int i = 0; i < n1; i++) {
			arr1[i] = scanner.nextInt();
		}
		
		for(int i = 0; i < n2; i++) {
			arr2[i] = scanner.nextInt();
		}
		
		scanner.close();
		
		int len1 = arr1.length;
		int len2 = arr2.length;
		
		int len  = len1 + len2;
		
		int[] res = new int[len];
		
		int count = 0;
		int i = 0, j =0;
		while(count < len) {
			if(i < len1 && j < len2 && arr1[i] < arr2[j]) {
				res[count++] = arr1[i++];
			}else if(i < len1 && j < len2 && arr1[i]>arr2[j] ) {
				res[count++] = arr2[j++];
			}else if( i < len1 && j < len2 && arr1[i] == arr2[j] ) {
				res[count++] = arr2[j++];
				res[count++] = arr1[i++];
			}
			
			if(i==len1 || j  == len2)  break;
		}
		
		for(int k = i;k < len1; k++) {
			res[count++] = arr1[k];
		}
		
		for(int k = j;k < len2; k++) {
			res[count++] = arr2[k];
		}
		
		
	System.out.println(Arrays.toString(res));	
	}
}
