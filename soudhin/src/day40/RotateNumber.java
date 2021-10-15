package day40;

import java.util.Scanner;
/**
 * 
 * 1. You are given two numbers n and k. You are required to rotate n, k times to the right. If k is positive, rotate to the right i.e. remove rightmost digit and 
 * make it leftmost. Do the reverse for negative value of k. 
 * Also k can have an absolute value larger than number of digits in n
 * 
 * 
 * 2. Take as input n and k.
 *  
 * 3. Print the rotated number.
 *  
 *  
 * example 1 :
 *  
 * n =  56789123
 * k = 3
 * output =  12356789
 * 
 * 
 * n =  56789123
 * k = 0
 * output =  56789123
 *  
 *  
 * n =  56789123
 * k = -2
 * output = 78912356
 *  
 * @author Durga Prasad
 *
 */
public class RotateNumber {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int n = scanner.nextInt();
	int k = scanner.nextInt();
	scanner.close();
	
	int temp = n;
	int div = 1;
	int mul = 1;
	int nod = 0;
	
	 while(temp > 0) {
		nod++;
		temp = temp/10;
	}
	 
	 k = k % nod;
	 
	 if(k < 0) {
		 k = k + nod;
	 }
	 
	 for(int i = 1; i <= nod; i++) {
		 if(i <= k) {
			 div *= 10;
		 }else {
			 mul *= 10;
		 }
	 }
	
	 int q = n / div;
	 
	 int r = n % div;
	 
	 System.out.println(r * mul + q);
	
}
}
