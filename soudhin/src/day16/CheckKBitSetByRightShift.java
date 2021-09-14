package day16;


/**
 * Given a decimal number and kth bit check if the kth bit is set(=1) or not
 * @author Durga Prasad
 * 
 * binary of 8 ->   1000
 * 
 * binary of 1 -->  0001
 * 
 * (k-1) that is 4-1 = 3 right  shift of 8 => 0001  (only 1st bit will be 1 and others 0)
 * 
 * 1 & (k-1) right shift of 8   0001 & 0001  the result will be 0 if kth bit of 8 is 0 else 1
 * 
 *
 */
public class CheckKBitSetByRightShift {
	
	public static boolean isKthBitSet(int n, int k) {
		return ((n>>(k-1)) & 1) != 0;
	}

	public static void main(String[] args) {
		System.out.println(isKthBitSet(8, 4));
		System.out.println(isKthBitSet(5, 4));  
		System.out.println(isKthBitSet(5, 1));  
		System.out.println(isKthBitSet(8, 1));
		System.out.println(isKthBitSet(13,3));
	}
}
