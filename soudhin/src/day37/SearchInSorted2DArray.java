package day37;

import java.util.Scanner;

/**
 * 1. You are given a number n, representing the number of rows and columns of a
 * square matrix. 
 * 
 * 2. You are given n * n numbers, representing elements of 2d
 * array a. Note - Each row and column is sorted in increasing order. 
 * 
 * 3. You are given a number x. 4. You are required to find x in the matrix and print it's
 * location int (row, col) 
 * 
 *  5. In case element is not found, print " Target Not Found".
 * 
 * @author Durga Prasad
 *
 */
public class SearchInSorted2DArray {

	public static void search(int[][] arr, int target) {

		int rowLen = arr.length;
		int colLen = arr[0].length;

		for (int i = 0; i < rowLen; i++) {
			if (arr[i][colLen - 1] == target) {
				System.out
						.println("Target " + arr[i][colLen - 1] + " is found at row " + i + ", column " + (colLen - 1));
				return;
			}
			if (arr[i][colLen - 1] < target) {
				continue;
			} else if (arr[i][colLen - 1] > target) {
				for (int j = colLen - 1; j >= 0; j--) {
					if (arr[i][j] == target) {
						System.out.println("Target " + arr[i][j] + " is found at row " + i + ", column " + j);
						return;
					}
				}
			}
		}
		System.out.println("Target not found....");
	}

	public static void display(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the number of rows");
		int rows = scanner.nextInt();

		System.out.println("Enter the number of columns");
		int cols = scanner.nextInt();

		int[][] arr = new int[rows][cols];

		System.out.println("Enter the elements of the matrix");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				arr[i][j] = scanner.nextInt();
			}
		}

		System.out.println("Displaying the input matrix");
		display(arr);

		System.out.println("Enter the Target to Search");
		int target = scanner.nextInt();
		scanner.close();

		search(arr, target);
	}

}
