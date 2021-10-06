package day35;

import java.util.Scanner;

public class SpiralDislay2 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int m = scanner.nextInt();
		int n = scanner.nextInt();
		
		int[][] arr = new int[m][n];
		
		for(int i = 0; i < m; i++ ) {
			for(int j = 0; j < n; j++) {
				arr[i][j]= scanner.nextInt();
			}
		}
		
		scanner.close();
		
		int minR = 0;
		int minC = 0;
		
		int maxR = arr.length - 1;
		int maxC = arr[0].length - 1;
		
		int total = m * n;
		int count = 1;
		
		while(count <= total) {
			
			for(int i = minR, j = minC; j <= maxC && count <= total; j++ ) {
				System.out.println(arr[i][j]);
				count++;
			}
			minR++;
			
			for(int i = minR, j = maxC; i <= maxR && count <= total; i++) {
				System.out.println(arr[i][j]);
				count++;
			}
			maxC--;
			
			for(int i = maxR, j = maxC; j >= minC; j--) {
				System.out.println(arr[i][j]);
				count++;
			}
			maxR--;
			
			for(int i = maxR, j = minC; i >= minR && count <= total; i--) {
				System.out.println(arr[i][j]);
				count++;
			}
			minC++;
		}
				
	}

}
