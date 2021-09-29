package day28;
import java.util.Arrays;
import java.util.Scanner;



/**
 * Span of an array is  max value of array - min value of array
 * 
 * @author Durga Prasad
 *
 */
public class ArraySpan {
	
	
	public static int findArraySpan(int [] arr) {
		int max = arr[0];
		int min = arr[0];
		
		for(int i = 0; i < arr.length; i++) {
			
			max = arr[i] > max ? arr[i] : max;
			min = arr[i] < min ? arr[i] : min;
		}
		
		return max - min;
	}
	
	public static void main(String args[]) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the size of the array");
		int n = scanner.nextInt();
		System.out.println("Enter the elments of the array");
		
		int[] arr = new int[n];
		
		for(int i = 0; i < n ; i++) {
			
			arr[i] = scanner.nextInt();
		}
		
		scanner.close();
		
		System.out.println( "span of the given array " + Arrays.toString(arr) +" is " +findArraySpan(arr));
		
	}

}
