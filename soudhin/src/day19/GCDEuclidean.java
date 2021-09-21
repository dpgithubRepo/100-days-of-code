package day19;
/**
 * 
 * 
 * 
 * @author Durga Prasad
 *
 */
public class GCDEuclidean {

	/**
	 * https://en.wikipedia.org/wiki/Greatest_common_divisor
	 * 
	 * A more efficient method is the Euclidean algorithm, a variant in which
	 *  the difference of the two numbers a and b is replaced by the remainder of 
	 *  the Euclidean division (also called division with remainder) of a by b.
	 *  
	 *  gcd(48,18) = gcd(48, 48%18) = gcd(18,12) = gcd(18, 18%12) = gcd(12, 6) = gcd(12,12%6) = gcd(6,0) = 6
	 *  
	 *  so gcd(48,18) = 6
	 */
	public static int GCDByEuclidean(int a, int b) {
		int temp1 = a;
		int temp2 = b;
		while( temp1 % temp2 > 0) {
			int rem = temp1 % temp2;
			temp1 = temp2;
			temp2 = rem;
		}
		
		return temp2;
	}
	
	public static void main(String[] args) {
		System.out.println(GCDByEuclidean(48, 18));
	}
}
