package day38;
import java.util.Scanner;
/**
 * Given a number print the following matrix
 * 
 * example : input 4
 * 
 * 1	2	3	4	
 * 9	10	11	12	
 * 13	14	15	16	
 * 5	6	7	8
 * 
 * 
 * example : input 5
 *  
 *  1	2	3	4	5	
 *  11	12	13	14	15	
 *  21	22	23	24	25	
 *  16	17	18	19	20	
 *  6	7	8	9	10	
 *  
 *  example : input 6
 *  
 *  1	2	3	4	5	6	
 *  13	14	15	16	17	18	
 *  25	26	27	28	29	30	
 *  31	32	33	34	35	36	
 *  19	20	21	22	23	24	
 *  7	8	9	10	11	12	

 *  
 *  
 *  
 * @author Durga Prasad
 *
 */
public class PatternPrinting {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.close();
		int count = 0;
		for(int i = 1; i <=n; i++) {
			for(int j = 1;  j <=n ; j++) {
				if(i==1) {
					System.out.print(j+"\t");
				}else if(i == n/2+1) {
					System.out.print(n*(n-1)+j+"\t");
				}else if(i == n) {
					System.out.print(n+j+"\t");
				}
				else {
					System.out.print(count*n+j+"\t");
				}
				
			}
			if(i <= n/2)
				count += 2;
			else if(n % 2 == 0) //handle even input
				count-= 3; 
			else
				count -= 1;  //for odd input
			System.out.println();
		}
		
	}
}
