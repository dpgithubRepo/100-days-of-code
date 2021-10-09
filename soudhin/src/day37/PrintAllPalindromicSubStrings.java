package day37;

import java.util.Scanner;

/**
 * 1. You are given a string. 
 * 2. You have to print all palindromic substrings of
 * the given string.
 * 
 * @author Durga Prasad
 *
 */
public class PrintAllPalindromicSubStrings {

	/**
	 * Prints the pal sub strings.
	 *
	 * @param str the str
	 */
	public static void printPalSubStrings(String str) {
		int left = 0;
		int right = str.length()-1;
		boolean isPal = true;
		while(left < right) {
			if(str.charAt(right) != str.charAt(left)) {
				isPal = false;
				break;
			}
			left++;
			right--;
		}
		
		if(isPal) System.out.println(str);
	}

	/**
	 * Extract sub strings.
	 *
	 * @param str the str
	 */
	public static void extractSubStrings(String str) {
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j <= str.length(); j++) {
				printPalSubStrings(str.substring(i, j));
			}
		}
	}

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		extractSubStrings(input);
	}
}
