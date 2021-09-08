package day10;

import java.util.Stack;

/**
 * Given an expression as string, check if the parenthesis are balanced
 * 
 * ex:
 * 
 *  {[(a*b*c)]}  --> balanced
 * 
 *  {[(a*b*c)]]} --> not balanced.
 *
 * @author Durga Prasad
 */
public class ParenthesisBalanceValidator {
	
	
	/**
	 * Validate parenthesis.
	 *
	 * @param expression the expression
	 * @return true, if successful
	 */
	public static boolean validateParenthesis(String expression) {
		
		char[] input = expression.toCharArray();
		Stack<Character> stack = new Stack<>();
		
		for(char ch: input) {
			if(ch=='[' || ch=='{' || ch=='(') {
				stack.push(ch);
			}else if(ch==']') {
				char k = stack.pop();
				if(k!='[') return false;
			}else if(ch=='}') {
				char k = stack.pop();
				if(k!='{') return false;
			}else if(ch==')') {
				char k = stack.pop();
				if(k!='(') return false;
			}
		}
		
		return true;
	}

/**
 * The main method.
 *
 * @param args the arguments
 */
public static void main(String[] args) {
	System.out.println(validateParenthesis("{[(a*b*c)]}"));  // true
	System.out.println(validateParenthesis("{[(a*b*c)]]}"));  // false
	System.out.println(validateParenthesis("(a*b)[c+d]{e/f}")); //true
	System.out.println(validateParenthesis("[({[(9*89*98/7)]})]")); //true
	System.out.println(validateParenthesis("[({[(9*89*98/7)]][})]")); //false
}
}
