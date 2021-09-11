package day13;


/**
 * Find the largest rectangular area possible in a given histogram where the largest rectangle can be made of a number of contiguous bars. 
 * For simplicity, assume that all bars have same width and the width is 1 unit. 
 * For example, consider the following histogram with 7 bars of heights {6, 2, 5, 4, 5, 1, 6}. The largest possible rectangle possible is 12
 * https://www.geeksforgeeks.org/largest-rectangle-under-histogram/
 * @author Durga Prasad
 *
 */
public class HistogramMaxArea {
	
	public static int getHistMaxAreaNaive(int[] arr) {
		int maxArea = 0;
		for(int i=0;i<arr.length;i++) {
			int count=0;
			for(int j=i;j>=0;j--){
				if(arr[j]>=arr[i]) {
					count++;
				}else {
					break;
				}
			}
			
			for(int j=i+1;j<arr.length;j++){
				if(arr[j]>=arr[i]) {
					count++;
				}else {
					break;
				}
			}
			
			int temp = arr[i]*count;
			maxArea = temp>maxArea?temp:maxArea;
			
		}
		
		return maxArea;
	}
	
	public static void main(String[] args) {
		System.out.println(getHistMaxAreaNaive(new int[] {2,2,2}));
		System.out.println(getHistMaxAreaNaive(new int[] {2,2,2,6,6,4,8,8}));
		System.out.println(getHistMaxAreaNaive(new int[] {2,2,2,6,6,4}));
		System.out.println(getHistMaxAreaNaive(new int[] {6,2,5,4,5,1,6}));
		
	}

}
