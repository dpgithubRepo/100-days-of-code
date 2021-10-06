package day34;

import java.util.Scanner;


/**
 * 
 * Given a 2d array, print the elements in the spiral format. Refer the image
 * 
 * @author Durga Prasad
 *
 */
public class SpiralDisplay {
	
	
	/**
	 * @param args
	 */
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
		
		
		int minr = 0;
		int maxr = arr.length - 1;
		int minc = 0;
		int maxc = arr[0].length -1;
		int maxCount =  m * n;
		int count = 1;
		
		while(count <= maxCount) {
			
			for(int i = minr, j = minc; i <= maxr && count <= maxCount;i++) {
				System.out.println(arr[i][j]);
				count++;
			}
			
			minc++;
			
			for(int i = maxr, j = minc; j <= maxc && count <= maxCount;j++) {
				System.out.println(arr[i][j]);
				count++;
			}
			
			maxr--;
			
			for(int i = maxr, j = maxc; i >= minr && count <= maxCount;i--) {
				System.out.println(arr[i][j]);
				count++;
			}
			maxc--;
			

			for(int i = minr, j = maxc; j >= minc && count <= maxCount;j--) {
				System.out.println(arr[i][j]);
				count++;
			}
			minr++;
		}
		
	}

}
