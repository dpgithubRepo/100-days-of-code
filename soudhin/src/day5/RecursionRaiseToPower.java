package day5;


/**
 * Given pow(x,y) print the valye of x raised to y through recursion
 * @author Durga Prasad
 *
 */
public class RecursionRaiseToPower {
	
	public static int pow(int x, int y) {
		if(y==0) return 1; // base case
		return x*pow(x,y-1); 
	}
	
	public static void main(String[] args) {
		System.out.println(pow(2,3));
		System.out.println(pow(5,4));
	}

}
