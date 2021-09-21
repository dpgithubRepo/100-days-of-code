package day21;

public class PrintNumbers {

	
	/**
	 * 		 1	
	 *		 2	3	
	 *		 4	5	6	
	 *	     7	8	9	10	
	 *		 11	12	13	14	15	
 
	 */
	
	public static void printNum(int n) {
		
		int count = 1;
		
		for(int i = 1; i<=n; i++ ) {
			
			for(int j = 1; j <= i; j++) {
				
				System.out.print(count++ + "\t");
			}
			 
			System.out.println();
		}
	}
	
	/**
	 *
	 *    0
		  1	 1	
		  2	 3	5	
		  8	13	21	34	
		 55	89	144	233	377	

	 * 
	 */
	
	public static void printNum2(int n) {
		
		int temp1 = 0;
		int temp2 = 1;
		System.out.println(temp1);
		for(int i = 2; i<=n; i++ ) {
			
			for(int j = 1; j <= i; j++) {
				int sum = temp1+temp2;
				System.out.print(sum + "\t");
				temp2 = temp1;
				temp1 = sum;
			}
			 
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		
		printNum(5);
		printNum2(5);
	}
}
