package day36;

import java.util.Scanner;
/**
 * 
 * 
 * Inplace rotate square matrix by 90 degrees | Set 1
Difficulty Level : Hard
Last Updated : 25 Sep, 2021
Given a square matrix, turn it by 90 degrees in anti-clockwise direction without using any extra space.
Examples : 
 

Input:
Matrix:
 1  2  3
 4  5  6
 7  8  9
Output:
 3  6  9 
 2  5  8 
 1  4  7 
The given matrix is rotated by 90 degree 
in anti-clockwise direction.

Input:
 1  2  3  4 
 5  6  7  8 
 9 10 11 12 
13 14 15 16 
Output:
 4  8 12 16 
 3  7 11 15 
 2  6 10 14 
 1  5  9 13
The given matrix is rotated by 90 degree 
in anti-clockwise direction.
 

 * 
 * 
 * @author Durga Prasad
 *
 */
public class RotateBy90AntiClockWise {

	// note to rotate by 90 anti clock wise first reverse the elements row wise &
	// then transpose
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();

		int[][] arr = new int[m][n];

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = scanner.nextInt();
			}
		}

		scanner.close();

		for (int i = 0; i < arr.length; i++) {

			int left = 0;
			int right = arr[i].length - 1;

			while (left < right) {
				int temp = arr[i][left];
				arr[i][left] = arr[i][right];
				arr[i][right] = temp;

				left++;
				right--;
			}

		}

		// first reverse the matrix
		for (int i = 0; i < n; i++) {
			for (int j = i; j < m; j++) { // j = i to avoid double swaps 1,2 with 2,1 and again 2,1 with 1,2
				int temp = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = temp;
			}
		}

		// reverse is done, now transpose the elements

		display(arr);
	}

	public static void display(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

}
