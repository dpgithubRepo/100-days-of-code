package day22;
import java.util.Scanner;

public class Pattern10 {

	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner scanner = new Scanner(System.in);
				int n = scanner.nextInt();
				scanner.close();
				
				int _innerSpace = n/2+1;
				int _outerSpace = 0;
				
				for(int i = 1; i<=n ; i++) {
					
					for(int j = 1; j <= _innerSpace; j++) {
							System.out.print("\t");
					}
					
					System.out.print("*");
					
					for(int j = 1; j <= _outerSpace; j++) {
						System.out.print("\t");
				}
					
					if(i!=1 && i != n)
						System.out.print("*");
					
					System.out.println();
					
					if(i <= n/2) {
						_innerSpace--;
						_outerSpace += 2;
					}else {
						_innerSpace++;
						_outerSpace -= 2;
					}
					
					
					
				}
	}
}
