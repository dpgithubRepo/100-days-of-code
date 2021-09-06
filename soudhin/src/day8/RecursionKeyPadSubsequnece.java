package day8;

import java.util.ArrayList;

/**
 * You are given a string . The string  will contains numbers only, where each number stands for a key pressed on a mobile phone.
 * The following list is the key to characters map
    0 -> .;
   1 -> abc
   2 -> def
   3 -> ghi
   4 -> jkl
   5 -> mno
   6 -> pqrs
   7 -> tu
   8 -> vwx
   9 -> yz
 * 
 * 
 * example: 
 * 
 * input : 123
 * 
 * output : [adg, adh, adi, aeg, aeh, aei, afg, afh, afi, bdg, bdh, bdi, beg, beh, bei, bfg, bfh, bfi, cdg, cdh, cdi, ceg, ceh, cei, cfg, cfh, cfi]

 *
 */
public class RecursionKeyPadSubsequnece {
	static String[] codes = {".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

	public static ArrayList<String> getKeyPadCombinations(String str){
		
		if(str.length()==0) {
			ArrayList<String> baseList = new ArrayList<String>();
			baseList.add("");
			return baseList;
		}
		
		char start = str.charAt(0);
		String rest = str.substring(1);
		ArrayList<String> result = getKeyPadCombinations(rest);
		String s = codes[start-'0'];
		ArrayList<String> finalResult = new ArrayList<>();
		for(char c: s.toCharArray()) {
			for(String st: result) {
				finalResult.add(c+st);
			}
		}
		
		return finalResult;
	}
	
	public static void main(String[] args) {
		System.out.println(getKeyPadCombinations("123"));
		
		System.out.println(getKeyPadCombinations("45"));
	}
}
