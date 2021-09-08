package day10;

import java.util.Arrays;


/**
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
public class StockSpanProblem {
	
	
	
	// O(n*n)
	public static int[] deriveStockSpanNaive(int[] stockPrice) {
		int[] spans = new int[stockPrice.length];
		spans[0] = 1;
		for(int i=1;i<stockPrice.length;i++) {
			int currentDayPrice = stockPrice[i];
			int start = 1;
			for(int j=i-1;j>=0;j--) {
				if(currentDayPrice>=stockPrice[j]) {
					start++;
				}else {
					spans[i] = start;
					break;
				}
			}
			
		}
		
		
		return spans;
	}
	
	public static void main(String[] args) {
		System.out.println(Arrays.toString(deriveStockSpanNaive(new int[] {100,80,60,70,60,75,85})));  //[1, 1, 1, 2, 1, 4, 6]

	}

}
