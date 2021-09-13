package day15;


/**
 * Given a decimal number and kth bit check if the kth bit is set(=1) or not
 * @author Durga Prasad
 *
 */
public class CheckKBitSet {
	
	public static boolean isKthBitSet(int n, int k) {
		return (n & (1 <<(k-1))) != 0;
	}

	public static void main(String[] args) {
		System.out.println(isKthBitSet(5, 3));
		System.out.println(isKthBitSet(0, 2));
		System.out.println(isKthBitSet(8, 4));
	}
}
