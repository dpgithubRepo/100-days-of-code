package day11;

import java.util.Arrays;
import java.util.Stack;


/**
**
* The stock span problem is a financial problem where we have a series of n daily price quotes for a stock and we need to calculate 
* the span of stock’s price for all n days. 
* The span Si of the stock’s price on a given day i is defined as the maximum number of consecutive days just before the given day, for which the price of the stock on the current day is less than or equal to its price on the given day.
* 
* For example, if an array of 7 days prices is given as {100, 80, 60, 70, 60, 75, 85}, 
* then the span values for corresponding 7 days are {1, 1, 1, 2, 1, 4, 6}.
* 
* 
* @author Durga Prasad
*
*/
public class StockSpanWithStack {

	
	/**
	 * Derive stock span.
	 *
	 * @param stockPrices the stock prices
	 * @return the int[]
	 */
	public static int[] deriveStockSpan(int[] stockPrices) {
		int[] stockSpan = new int[stockPrices.length];
		stockSpan[0]=1;
		Stack<Integer> stack = new Stack<>();
		stack.push(0);
		
		for(int i=1;i<stockPrices.length;i++) {
			
			while(stack.size()>0 && stockPrices[i]>stockPrices[stack.peek()] ) {
					stack.pop();
			}
			
			if(stack.size()==0) {
				stockSpan[i] = i+1;
			}else {
				stockSpan[i] = i-stack.peek();
			}
			
			stack.push(i);
		}
		
		return stockSpan;
	}
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		System.out.println(Arrays.toString(deriveStockSpan(new int[] {100,80,60,70,60,75,85})));  //[1, 1, 1, 2, 1, 4, 6]

	}
}
