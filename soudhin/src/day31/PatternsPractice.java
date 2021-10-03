package day31;

import java.util.Scanner;

public class PatternsPractice {

	public static void pattern15(int n) {
		int space = n / 2;
		int star = 1;
		int val = 1;
		for (int i = 1; i <= n; i++) {
			int col = val;
			for (int j = 1; j <= space; j++) {
				System.out.print("\t");
			}
			for (int j = 1; j <= star; j++) {
				System.out.print(col + "\t");
				if (j <= star / 2)
					col++;
				else
					col--;

			}

			if (i <= n / 2) {
				star += 2;
				space--;
				val++;
			} else {
				star -= 2;
				space++;
				val--;
			}

			System.out.println();
		}

	}

	public static void pattern16(int n) {
		int cols = 2 * n - 1;
		for (int i = 1; i <= n; i++) {
			int val = 1;
			for (int j = 1; j <= cols / 2 + 1; j++) {
				if (j <= i) {
					System.out.print(val++ + "\t");
				} else {
					System.out.print("\t");
				}
			}

			if (i == n)
				val--;
			for (int k = cols / 2 + 2; k <= cols; k++) {
				if (k <= cols - i) {
					System.out.print("\t");
				} else {
					System.out.print(--val + "\t");
				}

			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.close();

	}

}
