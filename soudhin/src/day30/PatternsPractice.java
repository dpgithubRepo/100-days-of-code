package day30;

import java.util.Scanner;;

public class PatternsPractice {

	public static void pattern1(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*\t");
			}
			System.out.println();
		}
	}

	public static void pattern2(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i + 1; j++) {
				System.out.print("*\t");
			}

			System.out.println();
		}
	}

	public static void pattern3(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print("\t");
			}

			for (int k = 1; k <= i; k++) {
				System.out.print("*\t");
			}

			System.out.println();
		}
	}

	public static void pattern4(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i - 1; j++) {
				System.out.print("\t");
			}

			for (int j = 1; j <= n - i + 1; j++) {
				System.out.print("*\t");
			}

			System.out.println();
		}
	}

	public static void pattern5(int n) {
		int star = 1;
		int space = n / 2;

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= space; j++) {
				System.out.print("\t");
			}
			for (int j = 1; j <= star; j++) {
				System.out.print("*\t");
			}

			if (i <= n / 2) {
				star += 2;
				space--;
			} else {
				star -= 2;
				space++;
			}

			System.out.println();
		}
	}

	public static void pattern6(int n) {
		int star = n/2+1;
		int space = 1;
		
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j<= star; j++) {
				System.out.print("*\t");
			}
			for(int j = 1; j<= space; j++) {
				System.out.print("\t");
			}
			for(int j = 1; j<= star; j++) {
				System.out.print("*\t");
			}
			
			if(i < n/2+1) {
				star--;
				space +=2;
			}else {
				star++;
				space-=2;
			}
			
			System.out.println();
		}
	}
	
	public static void pattern7(int n) {
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n; j++) {
				if(i==j) {
					System.out.print("*\t");
				}
				else {
					System.out.print("\t");
				}
			}
			System.out.println();
		}
	}
	
	public static void pattern8(int n) {
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n; j++) {
				if(i+j == n+1) {
					System.out.print("*\t");
				}
				else {
					System.out.print("\t");
				}
			}
			System.out.println();
		}
		
	}
	
	public static void  pattern9(int n) {
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n; j++) {
				if(i+j == n+1 || i ==j) {
					System.out.print("*\t");
				}
				else {
					System.out.print("\t");
				}
			}
			System.out.println();
		}	
	}

	public static void pattern10(int n) {
		int _innerspace = n/2;
		int _outerspace = 0;
		for(int i = 1; i <=n; i++) {
			
			for(int j = 1; j <= _innerspace; j++) {
				System.out.print("\t");
			}
			System.out.print("*");
			
			for(int j = 1; j <= _outerspace; j++) {
				System.out.print("\t");
			}
			
			if(i != 1  && i !=n)
				System.out.print("*");
			
			if(i <= n/2) {
				_innerspace--;
				_outerspace+=2;
			}else {
				_innerspace++;
				_outerspace-=2;
			}
			System.out.println();
		}
	}
	
	public static void pattern11(int n) {
		int count = 1;
		for(int i = 1; i <= n ; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print(count++ +"\t");
			}
			System.out.println();
		}
	}
	
	public static void pattern12(int n) {
		int a = 0;
		int b = 1;
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print(a+"\t");
				int c = a+b;
				a = b;
				b = c;
			}
			System.out.println();
		}
		
	}
	
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		scn.close();
		
		
	}

}
