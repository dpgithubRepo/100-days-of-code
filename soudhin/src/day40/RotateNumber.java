package day40;

import java.util.Scanner;
/**
 * 
 * Given a positive integer n  and a number to rotate by, rotate the n by the rotate number
 * 
 * eg : n = 12345678 rotate by = 2
 * o/p = 78123456
 * 
 *  
 * n = 54321 rotate by = 1
 * o/p = 15432
 * 
 * 
 * n = 23456 rotate by = 0
 * o/p = 23456
 * 
 * @author Durga Prasad
 *
 */
public class RotateNumber {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int n = scanner.nextInt();
	int temp = n;
	int rotateBy = scanner.nextInt();
	scanner.close();
	int pow = 1;

	while(rotateBy > 0) {
		pow *= 10;
		rotateBy--;
		temp = temp/10;
	}
	
	int prefix = n % pow;
	 pow = 1;
	 int temp1 = temp;
	 while(temp1 > 0) {
		 pow *= 10;
		 temp1 /= 10;
	 }
	
	 System.out.println(prefix*pow +temp );
	
}
}
