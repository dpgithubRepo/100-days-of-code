package day9;


/**
 * Given a number, using it print z
 * 
 * 
 * example n= 5 print z as below
		*****
		   *
		  *
		 *
		*****

 * 
 * 
 * 
 * @author Durga Prasad
 *
 */
public class PrintZ {
	
	public static void printZ(int n) {
		for(int i=1;i<=n;i++){
			if(i==1 || i==n) {
				for(int k=1;k<=n;k++)
					System.out.print("*");
			}else {
				for(int k=1;k<=(n-i);k++)
					System.out.print(" ");
				System.out.print("*");
			}
			System.out.println ("");
		}
	}
	
	public static void main(String[] args) {
		System.out.println("===================================");
		printZ(5);
		System.out.println("===================================");
		printZ(10);
		System.out.println("===================================");
	}

}
