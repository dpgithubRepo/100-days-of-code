package day5;


/**
 * Given pow(x,y) print the valye of x raised to y through recursion but now with linear complexity but with log(n) complexity
 * @author Durga Prasad
 *
 */
public class RecursionRaiseToPowerLogNComplexity {
	
	
	public static int pow(int x, int y) {
		
		if(y==0) return 1;
		
		int val1 = pow(x,y/2);
		int val2 = val1*val1;
		if(y%2==1) {
			val2 = val2*x;
		}
		return val2;
	}
	
	
	public static void main(String[] args) {
		System.out.println(pow(2, 3));
		System.out.println(pow(5, 4));
		System.out.println(pow(3,8));
	}

}
