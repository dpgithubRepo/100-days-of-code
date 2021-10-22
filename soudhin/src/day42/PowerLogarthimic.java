package day42;
import java.util.Scanner;

public class PowerLogarthimic {
	
	public static int power(int n, int p) {
		if(p == 0) return 1;
		int val = power(n, p/2);
		
		int result = val * val;
		
		if(p % 2 == 1) return result * n;
		
		return result;
	}
	
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int p = scanner.nextInt();
		scanner.close();
		
		System.out.println(power(n, p));
	}

}
