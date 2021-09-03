package day5;


/**
 * steps to perform tower of hanoi with  disks and  towers
 * 
 * a,b,c towers and 3 disks
 * 
 * move all the disks from a to b using c
 * 
 * Rules for moving the disks
 * 
 * i) Only one disk can be moved at a time.
 * 
 * ii) Each move consists of taking the upper disk from one of the stacks and placing it on top of another stack i.e. a disk can only
 *  be moved if it is the uppermost disk on a stack.
 * 
 * iii) No disk may be placed on top of a smaller disk.
 * 
 * @author Durga Prasad
 *
 */
public class RecursionToweOfHanoi {

	public static void toh(int n, char a, char b, char c ) {
		
		//base case
		if(n==0) return;
		
		
		toh(n-1,a,c,b); // moves n-1 disks from a to c using b
		System.out.println(a + "-> " + b);
		toh(n-1,c,b,a);// moves n-1 disks from c to b using a
	}
	
	public static void main(String[] args) {
		System.out.println("steps to perform tower of hanoi with 3 disks and 3 poles");
		toh(3, 'a', 'b', 'c');
	}
	
}
