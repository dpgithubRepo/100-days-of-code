package day16;


/**
 * Given a non-negative integer count set bits
 * @author Durga Prasad
 * 
 * 
 * https://www.geeksforgeeks.org/count-set-bits-in-an-integer/
 * 
 * Subtracting 1 from a decimal number flips all the bits after the rightmost set bit(which is 1) including the rightmost set bit. 
for example : 
10 in binary is 00001010 
9 in binary is 00001001 
8 in binary is 00001000 
7 in binary is 00000111 
So if we subtract a number by 1 and do it bitwise & with itself (n & (n-1)), we unset the rightmost set bit. If we do n & (n-1) in a loop and count the number of times the loop executes, we get the set bit count. 
The beauty of this solution is the number of times it loops is equal to the number of set bits in a given integer. 
 * 
 * 
 * 
 *
 */
public class CountSetBitBrianKerningamAlgo {

	
	public static int countSetBit(int n) {
		int count = 0;
		while(n>0) {
			count++;
			n = n &(n-1);
		}
		
		
		return count;
	}
	
	public static void main(String[] args) {
		System.out.println(countSetBit(8));
		System.out.println(countSetBit(35));
		System.out.println(countSetBit(13));
		System.out.println(countSetBit(40));
		System.out.println(countSetBit(64));
		
	}
}
