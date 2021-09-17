package day18;


// TODO: Auto-generated Javadoc
/**
 * Given a number n >1  find if it is prime or not.
 *
 * @author Durga Prasad
 */
public class CheckPrime {
	
	/**
	 * Checks if is prime naive 1.
	 *
	 * @param n the n
	 * @return true, if is prime naive 1
	 */
	//naive
	public static boolean isPrimeNaive1(int n) {
		for(int i=2;i<n;i++) {
			if(n%i==0)  return false;
		}
		return true;
	}
	
	/**
	 * Checks if is prime naive 2.
	 *
	 * @param n the n
	 * @return true, if is prime naive 2
	 */
	public static boolean isPrimeNaive2(int n) {
		
		int nf = 0;
		for(int i=1;i<n;i++) {
			if(n%i==0) nf++;
		}
		return !(nf >2);
	}
	
	
	/**
	 * Checks if is prime using sq root.
	 *
	 * @param n the n
	 * @return true, if is prime using sq root
	 */
	public static boolean isPrimeUsingSqRoot(int n) {
		for(int i=2;i*i<=n;i++) {  //run loop until sqrt(n)
			if(n%i==0)  return false;
		}
		return true;
	}
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		System.out.println(isPrimeNaive1(11)); //true
		System.out.println(isPrimeNaive1(8)); //false
		System.out.println(isPrimeNaive1(2)); //true
		System.out.println(isPrimeNaive1(9));//false
		System.out.println(isPrimeNaive1(49));//false
		System.out.println("-----------------");
		System.out.println(isPrimeNaive2(11)); //true
		System.out.println(isPrimeNaive2(8)); //false
		System.out.println(isPrimeNaive2(2)); //true
		System.out.println(isPrimeNaive1(9)); //false
		System.out.println(isPrimeNaive1(49)); //false
		System.out.println("-----------------");
		System.out.println(isPrimeUsingSqRoot(11)); //true
		System.out.println(isPrimeUsingSqRoot(8));  //false
		System.out.println(isPrimeUsingSqRoot(2));  //true
		System.out.println(isPrimeUsingSqRoot(9)); //false
		System.out.println(isPrimeUsingSqRoot(49)); //false
	}

}
