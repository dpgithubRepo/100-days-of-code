package day14;

// TODO: Auto-generated Javadoc
/**
 * The Class DecimalToBinary.
 */
public class DecimalToBinary {

	/**
	 * Prints the binary.
	 *
	 * @param n the n
	 */
	public static void printBinary(int n) {
		System.out.println(Integer.toBinaryString(n));  //inbuilt Integer java method
	}

	/**
	 * Prints the binary 2.
	 *
	 * @param n the n
	 */
	public static void printBinary2(int n) {
		int[] binary = new int[35];
		int index = 0;
		while (n > 0) {
			binary[index++] = n % 2;
			n = n / 2;
		}

		for (int i = index - 1; i >= 0; i--) {
			System.out.print(binary[i]);
		}
	}

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		printBinary(18);
		printBinary2(18);
	}

}
