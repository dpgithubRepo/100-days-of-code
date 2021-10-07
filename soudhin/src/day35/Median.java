package day35;

import java.util.Arrays;

/**
 * 
 * https://leetcode.com/problems/median-of-two-sorted-arrays/
 * 
 * Given two sorted arrays nums1 and nums2 of size m and n respectively, return
 * the median of the two sorted arrays.
 * 
 * The overall run time complexity should be O(log (m+n)).
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: nums1 = [1,3], nums2 = [2] Output: 2.00000 Explanation: merged array =
 * [1,2,3] and median is 2.
 * 
 *  
 *  Example 2:
 * 
 * Input: nums1 = [1,2], nums2 = [3,4] Output: 2.50000 Explanation: merged array
 * = [1,2,3,4] and median is (2 + 3) / 2 = 2.5. 
 * 
 * Example 3:
 * 
 * Input: nums1 = [0,0], nums2 = [0,0] Output: 0.00000 
 * 
 * Example 4:
 * 
 * Input: nums1 = [], nums2 = [1] Output: 1.00000
 * 
 *  Example 5:
 * 
 * Input: nums1 = [2], nums2 = [] Output: 2.00000
 * 
 * 
 * Constraints:
 * 
 * nums1.length == m nums2.length == n 0 <= m <= 1000 0 <= n <= 1000 1 <= m + n
 * <= 2000 -106 <= nums1[i], nums2[i] <= 106
 * 
 * 
 * 
 * @author Durga Prasad
 *
 */
public class Median {
	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
		double median = 0.0;
		int len1 = nums1.length;
		int len2 = nums2.length;
		int count = len1+len2;
		int result[] = new int[count];
		int index = 0;
		
		
		for (int i = 0; i < len1; i++) {
			result[i] = nums1[i];
		}

		for (int i = len1 ; i < count; i++) {
			result[i] = nums2[index++];
		}
		
		Arrays.sort(result);
		
		if(count % 2 == 1) {
			median = result[count/2];
		}else {
			median = (result[count/2]+result[count/2-1])/2.0;
		}

		return median;
	}
	public static void main(String[] args) {
		System.out.println(findMedianSortedArrays(new int[] {1,2}, new int[] {3,4}));
	}
}
