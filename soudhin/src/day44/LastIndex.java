package day44;
import java.util.Scanner;


/**
 * Given an integer array, target element find last index of the target element if exists
 * else return -1 using recursion
 * 
 * @author Durga Prasad
 *
 */
public class LastIndex {
	
	public static int findLastIndex(int[] arr, int idx, int t) {
		
		if(arr[idx] == t) return idx;
		if(arr[idx] != t && idx == 0) return -1;
		
		return findLastIndex(arr, idx-1, t);
	}
	
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 int len = scanner.nextInt();
		 int[] arr = new  int[len];
		 int target = scanner.nextInt();
		 for(int i = 0; i < len; i++) {
			 arr[i] = scanner.nextInt();
		 }
		 
		 scanner.close();
		 
		 System.out.println(findLastIndex(arr, len-1, target));
	}

}
