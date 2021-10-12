package day39;


/**
 * Given an array return equilibrium index k  such that sum of elements from 0 to k-1 = sum of elements from k+1 to n ( n = length of array), 
 * 
 * if no such index return -1
 * 
 * 
 * example {1,2,3}  => -1
 * 
 * example {12,0,2,3,9} => 2
 * 
 * {10,10,10,10,10,0,50} => 5
 * 
 * 
 * @author Durga Prasad
 *
 */
public class ArrayEquilibriumIndex {

	public static int getEquilibriumIndexBrutForce(int [] arr) {
		int index = -1;
		int len = arr.length;
		
		for(int i = 0; i < len; i++) {
			int ls = 0;
			int rs = 0;
			for(int j = 0; j < i; j++) {
				ls +=  arr[j];
			}
			
			for(int k = i+1; k < len; k++) {
				rs += arr[k];
			}
			
			if(ls == rs) return i;
		}
		
		return index;
	}
	
	public static int getEquilibriumIndexSlidingWindow(int [] arr) {
		int index = -1;
		int len = arr.length;
		int sum = 0;
		int rs = 0;
		int ls = 0;
		for(int i = 1; i < len; i++) {
			sum += arr[i];
		}
		
		for(int j = 1; j < len; j++) {
			ls += arr[j-1];
			rs = sum -  arr[j];
			
			if(ls == rs) return j;
		}
		
		return index;
	}
	
	public static void main(String[] args) {
		
		System.out.println("*** Following is Brut Force approach ***");
		System.out.println(getEquilibriumIndexBrutForce(new int[] {2,1,2}));
		System.out.println(getEquilibriumIndexBrutForce(new int[] {1,2,3}));
		System.out.println(getEquilibriumIndexBrutForce(new int[] {12,0,2,3,9}));
		System.out.println(getEquilibriumIndexBrutForce(new int[] {10,10,10,10,10,0,50}));
		
		
		System.out.println("*** Following is sliding window approach ***");
		System.out.println(getEquilibriumIndexSlidingWindow(new int[] {2,1,2}));
		System.out.println(getEquilibriumIndexSlidingWindow(new int[] {1,2,3}));
		System.out.println(getEquilibriumIndexSlidingWindow(new int[] {12,0,2,3,9}));
		System.out.println(getEquilibriumIndexBrutForce(new int[] {10,10,10,10,10,0,50}));
	}
}
