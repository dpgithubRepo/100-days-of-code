package day6;


/**
 * Given an array and a number print all the indexes whose value is the number with recursion
 * @author Durga Prasad
 *
 */
public class RecursionFindIndexes {

	
	public static void printAllIndexes(int[] arr, int val, int index) {
		if(index==arr.length) return;
		
		if(arr[index]==val) System.out.println(index);
		
		printAllIndexes(arr, val, index+1);
	}
	
	
	public static void main(String[] args) {
		printAllIndexes(new int[] {0,1,2,3,4,5,6,2,2,2},2,0);
		printAllIndexes(new int[] {0,1,2,3,4,5,6,2,2,2},22,0);
	}
}
