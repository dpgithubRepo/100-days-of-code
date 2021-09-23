package day23;
import java.util.Scanner;


public class Pattern15 {

	public static void main(String[] args) {
		
		System.out.println("Enter a number");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.close();
		
		int space = n/2;
		int star = 1;
		int val = 1;
		for(int i =1; i <= n; i++) {
			for(int j = 1; j <= space; j++) {
				System.out.print("\t");
			}
			int col = val;
			for(int j = 1; j <= star; j++) {
				System.out.print(col+"\t");
				if(j <= star/2) {
					col++;
				}else {
					col--;
				}
			}
			
			if(i <= n/2) {
				star += 2;
				space--;
				val++;
				
			}else {
				star -=2 ;
				space ++;
				val--;
			}
			System.out.println();
		}
	}
}
