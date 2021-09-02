package day5;


/**
 * Given a string reverse it recusively
 * @author Durga Prasad
 *
 */
public class RecursionReverseString {
	
	public static void  reverse(String str) {
		if(str.length()==0) return ;
		System.out.print(str.charAt(str.length()-1));
		reverse(str.substring(0,str.length()-1));
	}
	
	public static void main(String[] args) {
		reverse("java");
		System.out.println();
		reverse("RANDOM");
	}

}
