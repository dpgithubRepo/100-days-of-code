package day42;
import java.util.Scanner;


/**
 * Given a positive number n and  positive power p, calculate n raised to power p recursively
 * 
 * eg : n = 2; p = 5; o/p = 32
 * 
 * eg: n = 2; p = 0; o/p =1
 * 
 * @author Durga Prasad
 *
 */

public class PowerLinear {

	public static int power(int n , int p) {
		if(p == 0) return 1;
		return n * power(n,p-1);
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int p = scanner.nextInt();
		scanner.close();
		
		System.out.println(power(n, p));
	}
	

}
