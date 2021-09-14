package day16;
/**
 * Given a non negative integer, count the number of bits set (meaning 1)
 * @author Durga Prasad
 *
 */
public class CountSetBitsNaive {
	
	public static int getSetBitsCountNaive(int n) {
		int count = 0;
		while(n>0) {
			if(n%2 !=0) count++;
			n=n/2;
		}
		
		return count;
	}

	public static void main(String[] args) {
		System.out.println(getSetBitsCountNaive(8));
		System.out.println(getSetBitsCountNaive(35));
		System.out.println(getSetBitsCountNaive(13));
		System.out.println(getSetBitsCountNaive(40));
		System.out.println(getSetBitsCountNaive(64));
		
	}
}
