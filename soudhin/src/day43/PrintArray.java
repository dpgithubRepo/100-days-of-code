package day43;
import java.util.Scanner;


/**
 * Given an array print the elements using recursion
 * 
 * @author Durga Prasad
 *
 */
public class PrintArray {

public static void displayArray(int[] arr, int index) {
	if(index == arr.length)  return;
	
	System.out.println(arr[index]);
	displayArray(arr, index+1);
}
	
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int len = scanner.nextInt();
	int [] arr = new int[len];
	for(int i = 0; i < len; i++) {
		arr[i] = scanner.nextInt();
	}
	scanner.close();
	displayArray(arr, 0);
}
}
