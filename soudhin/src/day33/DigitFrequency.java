package day33;
import java.util.Scanner;;


/**
 * Digit Frequency
1. You are given a number n.
2. You are given a digit d.
3. You are required to calculate the frequency of digit d in number n.
 * @author Durga Prasad
 *
 */
public class DigitFrequency {
	
	public static int getDigitFrequency(int n, int d) {
		int _frequency = 0;
		while(n > 0) {
			int rem = n%10;
			n = n/10;
			if(rem == d) _frequency++;
		}
		
		return _frequency;
    }
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = scanner.nextInt();
		System.out.println("Enter the digit");
		int d = scanner.nextInt();
		scanner.close();
		System.out.println(getDigitFrequency(n,d));
	}

}
