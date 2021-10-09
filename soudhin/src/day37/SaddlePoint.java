package day37;

import java.util.Scanner;

/**
 * Given a matrix of n x n size, the task is to find the saddle point of the
 * matrix. A saddle point is an element of the matrix such that it is the
 * minimum element in its row and maximum in its column. Examples :
 * 
 * 
 * Input: Mat[3][3] = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9}} Output: 7
 *  7 is minimum
 * in its row and maximum in its column.
 * 
 * Input: Mat[3][3] = {{1, 2, 3}, {4, 5, 6}, {10, 18, 4}} Output: No saddle
 * point
 * 
 * 
 * Input: Mat[4][4] = {{11, 12, 13,14}, {21,22,23,24},{31,32,33,34},{41,42,43,44}} Output: 41
 * 
 * https://www.geeksforgeeks.org/saddle-point-matrix/#
 * 
 * 
 * @author Durga Prasad
 *
 */

public class SaddlePoint {
	
	public static void printSaddle(int[][]  arr) {
		int small = 0;
		for(int i = 0; i < arr.length; i++) {
			for(int j = 1; j < arr[0].length; j++) {
				if(arr[i][j] < arr[i][small]) {
					small = j;
				}
			}
			
			boolean flag = true;
			for(int k = 0; k < arr.length; k++) {
				if(arr[k][small]>arr[i][small]) {
					flag = false;
					break;
				}
			}
			
			if(flag) {
				System.out.println("Saddle value is " + arr[i][small]);
				return;
			}
		}
		
		System.out.println("No saddle point");
	}

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int m = scanner.nextInt();
		int n = scanner.nextInt();
		int arr[][] = new int[m][n];
		
		for(int i = 0; i < m ; i++) {
			for(int j = 0; j < n; j++) {
				arr[i][j] = scanner.nextInt();
			}
		}
		
		scanner.close();
		
		printSaddle(arr);
		
		
	}
}
