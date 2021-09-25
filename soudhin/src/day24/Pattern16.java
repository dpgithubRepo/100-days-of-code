package day24;
import java.util.Scanner;


public class Pattern16 {
	
	public static void main(String[] args) {
		
		System.out.println("Enter a number");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.close();
		int cols = 2*n -1;	
		
		for(int i = 1; i <=n ; i++) {
			int val = 1;
			for(int j = 1; j<=cols/2; j++){
				if(j <= i ){
					System.out.print(val+++"\t");
				}else {
					System.out.print("\t");
				}
			}
			
			if(i==n) {
				val++;
			}
			
			for(int j = cols/2+1; j<=cols; j++){
				
				if(j <= cols-i){
					System.out.print("\t");
				}else {
					System.out.print(--val+"\t");
				}
				
				
			}
			
			
			System.out.println();
		}
	}

}
