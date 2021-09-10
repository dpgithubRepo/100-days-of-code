package day12;

/**
 * Given a sorted array arr, check if there exists a pair(i,j) such that
 * arr[i]+arr[j] = k
 * 
 * 
 * @author Durga Prasad
 *
 */
public class TwoSumWithTwoPointer {
	public static boolean twoSumPairExisits(int[] arr, int k) {
		int i = 0; // pointer 1
		int j = arr.length-1; //pointer 2
		while(i < j){
			if(arr[i]+arr[j] < k) {  // if sum greater than k increment pointer 1
				i++;
			}else if(arr[i]+arr[j] > k) { //if sum less than k decrememnt pointer 2
				j--;
			}else {
				System.out.println("pair for target "+ k +" is (" + i +","+j+")" );  //if sum equal to k return true
				return true;
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
