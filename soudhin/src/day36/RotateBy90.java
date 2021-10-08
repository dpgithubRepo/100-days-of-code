package day36;

import java.util.Scanner;


/**
 * 1. You are given a number n, representing the number of rows and number of
 * columns. 
 * 2. You are given n*n numbers, representing elements of 2d array a.
 * 3. You are required to rotate the matrix by 90 degree clockwise and then
 * display the contents using display function. 
 * 
 * Note - you are required to do it
 * in-place i.e. no extra space should be used to achieve it .*
 * 
 * @author Durga Prasad
 * 
 * 
 * https://www.geeksforgeeks.org/rotate-a-matrix-by-90-degree-in-clockwise-direction-without-using-any-extra-space/
 * 
 * 
 * Input:
1 2 3 
4 5 6
7 8 9  
Output:
7 4 1 
8 5 2
9 6 3

Input:
1 2
3 4
Output:
3 1
4 2 
Recommended: Please try your approach on {IDE} first, before moving on to the soluti
 * 
 * 
 * 
 *
 */
public class RotateBy90 {

	//note to rotate by 90 first transpose & then reverse the elements row wise
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		
		int[][] arr = new int[m][n];
		
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				arr[i][j] = scanner.nextInt();
			}
		}
		
		scanner.close();
		//display(arr);
		//1 2 3 
		//4 5 6 
		//7 8 9 
		
		//first transpose the matrix
		for(int i = 0; i < n; i++) {
			for(int j = i; j < m; j++) {  // j = i to avoid double swaps 1,2 with 2,1 and again 2,1 with 1,2
				int temp = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = temp;
			}
		}
		
		//display(arr);
		//1 4 7 
		//2 5 8 
		//3 6 9 
		
		//Transpose is done, now reverse the elements row wise
		
		for(int i = 0; i < arr.length; i++) {
			
			int left = 0;
			int right = arr[i].length-1;
			
			while(left < right) {
				int temp = arr[i][left];
				arr[i][left] = arr[i][right];
				arr[i][right] = temp;
				
				left++;
				right--;
			}
			
		}
		
		display(arr);
	}
	
	
	 public static void display(int[][] arr){
	        for(int i = 0; i < arr.length; i++){
	            for(int j = 0; j < arr[0].length; j++){
	                System.out.print(arr[i][j] + " ");
	            }
	            System.out.println();
	        }
	    }
}
