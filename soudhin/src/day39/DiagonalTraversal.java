package day39;

import java.util.Scanner;

/**
 * Given a 2d array/ matrix of size n * n , traverse the array diagonally and print elements
 * 
 *  example : input 2d array
 *  1	2	3	4	
 *  5	6	7	8	
 *  9	10	11	12	
 *  13	14	15	16
 *  
 *  output : 	1->6->11->16
 *              2->7-12
 *              3->8
 *              4
 * 
 * @author Durga Prasad
 *
 */
public class DiagonalTraversal {

	public static void display(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[][] arr = new int[n][n];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = scanner.nextInt();
			}
		}
		scanner.close();

		display(arr);

		for(int g = 0; g < arr.length; g++) {
			for(int i = 0, j = g; j < arr.length; i++,j++) {
				System.out.println(arr[i][j]);
			}
		}

	}

}
