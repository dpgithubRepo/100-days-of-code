package day37;

import java.util.Scanner;

/**
 * 
 * 1. You are given a string.
 * 
 * 2. You have to compress the given string in the following two ways - First
 * compression -> The string should be compressed such that consecutive
 * duplicates of characters are replaced with a single character. For example
 * "aaabbccdee", the compressed string will be "abcde".
 * 
 * Second compression -> The string should be compressed such that consecutive
 * duplicates of characters are replaced with the character and followed by the
 * number of consecutive duplicates. For "aaabbccdee", the compressed string
 * will be "a3b2c2de2".
 * 
 * 
 * Sample Input 
 * wwwwaaadexxxxxx 
 * Sample Output 
 * wadex w4a3dex6
 * 
 * 
 * @author Durga Prasad
 *
 */
public class StringCompression {

	/**
	 * Compression 1.
	 *
	 * @param str the str
	 */
	public static void compression1(String str) {
		String result = "";
		int strLen = str.length();
		for (int i = 0; i < str.length() - 1; i++) {
			if (str.charAt(i) != str.charAt(i + 1)) {
				result += str.charAt(i);
			}
		}

		int len = result.length();
		if (str.charAt(strLen - 1) != result.charAt(len - 1))
			result += str.charAt(strLen - 1);
		System.out.println(result);
	}

	/**
	 * Compression 2.
	 *
	 * @param str the str
	 */
	public static void compression2(String str) {
		String result = "";
		int strLen = str.length();
		int count = 1;
		for (int i = 0; i < str.length() - 1; i++) {
			if (str.charAt(i) != str.charAt(i + 1)) {
				result += str.charAt(i);
				if (count > 1)
					result += count;
				count = 1;
			} else {
				count++;
			}
		}

		if (count > 1) {
			result += str.charAt(strLen - 1);
			result += count;
		}
		else
			result += str.charAt(strLen - 1);
		System.out.println(result);

	}

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		scanner.close();
		compression1(str);
		compression2(str);
	}
}
