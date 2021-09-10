package day12;

import java.util.HashMap;
import java.util.Map;

/**
 * Given a sorted array arr, check if there exists a pair(i,j) such that
 * arr[i]+arr[j] = k
 * 
 * 
 * @author Durga Prasad
 *
 */
public class TwoSum {
	
	
	public static boolean twoSumPairExisits(int[] arr, int k) {
		Map<Integer, Integer> map = new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			int temp = arr[i];
			if(map.containsKey(k-arr[i])){
				System.out.println("pair for target "+ k +" is (" + i +","+ map.get(k-arr[i])+")" );
				return true;
			}else {
				map.put(temp, i);
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		System.out.println(twoSumPairExisits(new int[] {-3,0,1,3,6,8,11,14,18,25}, 17));
		System.out.println(twoSumPairExisits(new int[] {-3,0,1,3,6,8,11,14,18,25}, 19));
		System.out.println(twoSumPairExisits(new int[] {-3,0,1,3,6,8,11,14,18,25}, 10));
	}

}
