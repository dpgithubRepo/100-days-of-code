package day21;

public class PrintPatterns {
	
/**
 * 	
 *    				*	*	*		*	*	*	
					*	*				*	*	
					*						*	
					*	*				*	*	
					*	*	*		*	*	*	
 * 
 * 
 * 
 */
	
	
	public static void printPattern1(int n) {
		int star = n/2+1;
		int space = 1;
		for(int i = 1; i <= n; i++) {
			
			for(int j = 1; j <= star; j++) {
				System.out.print("*\t");
			}
			
			for(int j = 1; j <= space; j++) {
				System.out.print("\t");
			}
			
			for(int j = 1; j <= star; j++) {
				System.out.print("*\t");
			}
			
			System.out.print("\n");
			
			if(i <= n/2) {
				star--;
				space += 2;
			}else {
				star++;
				space -=2;
			}
		}
	}
	
	/**
	 * 
	 *            *         
	 * 			  	*			  		
	 * 			  		*
	 * 			  			*
	 * 			  				*		
	 * 
	 * 
	 */
	
	public static void printPattern2(int n) {
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				if(i==j) {
					System.out.print("*\t");
				}else {
					System.out.print("\t");
				}
			}
			
			System.out.println();
		}
	}
	
	/**
	 *                *
	 *			    *		 
	 *            *	
	 *        	*
	 *        *
	 * 
	 * 
	 * 
	 */
	
	
	public static void printPattern3(int n) {
		for(int i=1; i<=n; i++) {
			for(int j = 1; j <= n; j++) {
				if(i + j == n+1) {
					System.out.print("*\t");
				}else {
					System.out.print("\t");
				}
			}
			
			System.out.println();
		}
	}
	
	
	
	/***
	 * 
	 *  cross pattern print kind of X
	 *          
	 */
	
	
	public static void printPattern4(int n) {
		for(int i=1; i<=n; i++) {
			for(int j = 1; j <= n; j++) {
				if(i + j == n+1 || i==j) {
					System.out.print("*\t");
				}else {
					System.out.print("\t");
				}
			}
			
			System.out.println();
		}
	}
	
	
	public static void main(String[] args) {
		
		  printPattern1(5);
		  
		  printPattern2(5);
		
		  printPattern3(5);

		  printPattern4(5);
	}

}



