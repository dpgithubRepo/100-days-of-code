package day15;


/**
 * Given a decimal number and kth bit check if the kth bit is set(=1) or not
 * @author Durga Prasad
 * 
 * binary of 5 ->   0101
 * 
 * binary of 1 -->  0001
 * 
 * (k-1) that is 3-1 = 2 left shift of 1 => 0100  (only kth bit will be 1 and others 0)
 * 
 * 5 & (k-1) shift of 5   0101 & 0100  the result will be 0 if kth bit of 5 is 0 else 1
 * 
 *
 */
public class CheckKBitSetByLeftShift {
	
	public static boolean isKthBitSet(int n, int k) {
		return (n & (1 <<(k-1))) != 0;
	}

	public static void main(String[] args) {
		System.out.println(isKthBitSet(5, 3));
		System.out.println(isKthBitSet(0, 2));
		System.out.println(isKthBitSet(8, 4));
	}
}
