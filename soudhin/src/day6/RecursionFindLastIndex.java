package day6;


/**
 * Given an array and a number print the last index of  the number if exists else return -1
 * 
 * @author Durga Prasad
 *
 */
public class RecursionFindLastIndex {

	public static int findLastIndex(int[] arr, int index,  int n) {
		
		if(index < 0) return -1;
		
		if(arr[index] ==n) return index;
		
		return findLastIndex(arr,index-1,n);
	}
	
	
	public static void main(String[] args) {
		int[] arr = {1,2,4,3,4,5,6,7};
		System.out.println(findLastIndex(arr,arr.length-1,2)); // find first index of 2  :: 1
		System.out.println(findLastIndex(arr,arr.length-1,12)); // find first index of 12 :: -1
		System.out.println(findLastIndex(arr,arr.length-1,4)); // find first index of 4 :: 4
		System.out.println(findLastIndex(arr,arr.length-1,1)); // find first index of 1 :: 0 
		System.out.println(findLastIndex(arr,arr.length-1,7)); // find first index of 7 :: 7
	}
}
