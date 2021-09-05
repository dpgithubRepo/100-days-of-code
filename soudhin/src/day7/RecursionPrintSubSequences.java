package day7;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a string print sub sequences of the string
 * 
 * Total number of subsequences for a string of length n is 2^n which includes one empty sub-sequence
 * 
 * 
 * @author Durga Prasad
 *
 */
public class RecursionPrintSubSequences {

	public static List<String> getSS(String str) {
		if(str.length()==0) {
			List<String> al =  new ArrayList<String>();
			al.add("");
			return al;
		}
		
		char first = str.charAt(0);
		String rest = str.substring(1);
		List<String> rec = getSS(rest);
		List<String> finalRes = new ArrayList<String>();
		for(String s: rec) {
			finalRes.add(""+s);
		}
		for(String s: rec) {
			finalRes.add(first+s);
		}
		
		return finalRes;
	}
	
	public static void main(String[] args) {
		System.out.println(getSS("abc"));
		
	}
}
