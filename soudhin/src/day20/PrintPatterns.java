package day20;



/**
 * Print given patterns 
 * @author Durga Prasad
 *
 */
public class PrintPatterns {

	
	
	/**
	 * 
	 *              *
	 *              *	*
	 *              *	*	*
	 *              *	*	*	*
	 *              *	*	*	*	*
	 *              
	 */
	
	public static void printPattern1(int n) {
		int i = 1;
		while(i<=n) {
			int j=1;
			while(j<=i) {
				System.out.print("*" + "\t");
				j++;
			}
			i++;
			System.out.print("\n");
		}
	}
	
	
	/**
	 * 
	 *				*	*	*	*	*
	 *				*	*	*	*
	 *				*	*	*
	 *				*	*	
	 *				*	
	 *				 
	 * 
	 */
	public static void printPattern2(int n) {
		 int i = 1;
		 while(i <= n ) {
			 int j=1;
			 while(j<=n-i+1) {
				 System.out.print("*" + "\t");
				 j++;
			 }
			 
			 System.out.print("\n");
			 i++;
		 }
		
	}
	
	/**
	 * 
	 *                					*
	 *                				*	*
	 *                			*	*	*
	 *                		*	*	*	*
	 *                *		*	*	*	*
	 *                   
	 * 
	 * 
	 */
	
	public static void printPattern3(int n) {
		 int i = 1;
		 while(i <= n ) {
			 
			 for(int j=i;j<n;j++) {
				 System.out.print("\t");
			 }
			 
			 for(int k=1;k<=i;k++) {
				 System.out.print("*\t");
			 }
			 
			 System.out.print("\n");
			 i++;
		 }
	}
	
	/**
	 * 
	 *             *
	 *           * * *
	 *         * * * * * 
	 *           * * *
	 *             * 
	 * 
	 */
	public static void printPattern4(int n) {
		
		//divide the no of rows in two loops
		//first loop for rows if n==5 we will first print first 3 rows
		
		for(int i=1;i<=(n/2)+1;i++) {
			
			//inside this loop we will again divide one loop for tab
			for(int j=1;j<=(n/2)-i+1;j++) {
				System.out.print("\t");
			}
			
			//following loop is to print the *
			for(int j=1;j<=(2*i)-1;j++) {
				System.out.print("*\t");
			}
			System.out.print("\n");
		}
		
		
		//next outer loop for the pending 2 rows in this case
		for(int i=1;i<=(n/2);i++) {
			for(int j=1;j<=i;j++){
				System.out.print("\t");
			}
			for(int j=1;j<=n-(2*i);j++){
				System.out.print("*\t");
			}
			
			System.out.print("\n");
		}
	}
	
	public static void main(String[] args) {
		
		System.out.println("printing pattern 1  \n");
		printPattern1(5);
		
		System.out.println("\n");
		System.out.println("printing pattern 2  \n");
		printPattern2(5);
		

		System.out.println("\n");
		System.out.println("printing pattern 3  \n");
		printPattern3(5);
		
		
		System.out.println("\n");
		System.out.println("printing pattern 4  \n");
		printPattern4(5);
	}
	
}
