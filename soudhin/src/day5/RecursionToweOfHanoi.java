package day5;


/**
 * steps to perform tower of hanoi with 3 disks and 3 poles
 * 
 * a,b,c 
 * 
 * move all the disks from a to b using c
 * 
 * @author Durga Prasad
 *
 */
public class RecursionToweOfHanoi {

	public static void toh(int n, char a, char b, char c ) {
		
		if(n==0) {
			return;
		}
		
		toh(n-1,a,c,b);
		System.out.println(a + "-> " + b);
		toh(n-1,c,b,a);
	}
	
	public static void main(String[] args) {
		System.out.println("steps to perform tower of hanoi with 3 disks and 3 poles");
		toh(3, 'a', 'b', 'c');
	}
	
}
