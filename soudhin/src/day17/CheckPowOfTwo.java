package day17;

/**
 * Given a non negative integer find if n is power of 2.
 *
 * @author Durga Prasad
 */

public class CheckPowOfTwo {
	
	/**
	 * Checks if is pow of two.
	 *
	 * @param n the n
	 * @return true, if is pow of two
	 */
	public static boolean isPowOfTwo(int n) {
		if (n==0) return false;
		while(n!=1) {    //run loop until n=1
			if(n%2 !=0) return false;    // keep dividing by 2 and if any odd number is the result return false
			n = n/2;  
		}
		
		return true;
	}
	
	
	/**
	 * Checks if is pow of two 2.
	 *
	 * @param n the n
	 * @return true, if is pow of two 2
	 */
	public static boolean isPowOfTwo_2(int n) {
		
		if (n==0) return false;
		return ((n & (n-1))==0);    // 4  =>  4 & 3 =   (0100 & 0011) = 0   // pow of 2 true
		                           //6    =>   6 & 5 = (0110 & 0101)  != 0  // pow of 2 false
		
	}
	
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		System.out.println(isPowOfTwo(8));
		System.out.println(isPowOfTwo(18));
		System.out.println(isPowOfTwo(32));
		System.out.println(isPowOfTwo(6));
		
		
		System.out.println(isPowOfTwo_2(8));
		System.out.println(isPowOfTwo_2(18));
		System.out.println(isPowOfTwo_2(32));
		System.out.println(isPowOfTwo_2(6));
	}

}
