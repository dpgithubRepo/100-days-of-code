package day47;

import java.util.*;


/**
 * Given an array of positive integers, return duplicate element if exists else -1
 * @author Durga Prasad
 *
 */
public class CheckDuplicates {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}
		
		scanner.close();
		
		Arrays.sort(arr); //nlogn
		int dup = -1;
		for(int i = 0; i < arr.length-1; i++) {
			if(arr[i] == arr[i+1]) {
				dup =  arr[i];
						
			}
		}
		
		//total complexity nlogn + n (for above loop)  total nlogn
		System.out.println(dup);
		
		//other way try adding to set 
		
		Set<Integer> set = new HashSet<>();
		for(int i : arr) {
			if(!set.add(i)) {
				System.out.println(i);  // n complexity
				return;
			}
		}
	}

}
