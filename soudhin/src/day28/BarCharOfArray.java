package day28;

import java.util.Scanner;

/**
 * Given an array represent the bar chart of that array
 * @author Durga Prasad
 *
 */

public class BarCharOfArray {

	public static void drawBarChart(int[] arr) {
		int max = findMax(arr);
		for (int i = max; i >= 0; i--) {

			for (int j = 0; j < arr.length; j++) {

				if (arr[j] >= i) {
					System.out.print("*\t");
				} else {
					System.out.print("\t");
				}
			}

			System.out.println();
		}

	}

	private static int findMax(int[] arr) {
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			max = max < arr[i] ? arr[i] : max;
		}

		return max;
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the size of the array");
		int n = scanner.nextInt();
		System.out.println("Enter the elements of the array");

		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {

			arr[i] = scanner.nextInt();
		}
		scanner.close();

		drawBarChart(arr);
	}

}
