package day3;


/**
 * Small demo to demonstrate performance gain with mutli-thread
 * 
 * As a concrete example, consider the example code below. 
 * The task is to compute the sum of all the integers from 0 to Integer.MAX_VALUE. 
 * In the first scenario, we have a single thread doing the summation while in the second scenario
 * we split the range into two parts and have one thread sum for each range. In the end, we add the two half sums to get the combined sum.
 * We measure the time taken for each scenario and print it.
 *
 */

public class ThreadDemo {

	public static void main(String[] args) throws InterruptedException {
		
		//case 1 - single thread
		SumUp sumup = new SumUp();
		sumup.start = 0;
		sumup.end = Integer.MAX_VALUE;
		long start = System.currentTimeMillis();
		sumup.sum();
		long end = System.currentTimeMillis();
		System.out.println("sum value "+sumup.count);
		System.out.println("Time taken by single thread "+ (end-start));
		
		
		
		//case 2 - two threads
		
		SumUp sumup1 = new SumUp();
		sumup1.start = 0;
		sumup1.end = Integer.MAX_VALUE/2;
		
		SumUp sumup2 = new SumUp();
		sumup2.start = Integer.MAX_VALUE/2;
		sumup2.end = Integer.MAX_VALUE;
		
		
		start = System.currentTimeMillis();
		Thread t1 = new Thread(()-> {
			sumup1.sum();
		});
		
		Thread t2 = new Thread(()-> {
			sumup2.sum();
		});
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		 end = System.currentTimeMillis();
		 
		 
		System.out.println("sum value "+ (sumup1.count+sumup2.count));
		System.out.println("Time taken by two threads "+ (end-start));
		
		/**
		 * sum value 2305843005992468481
			Time taken by single thread 950
			sum value 2305843005992468481
			Time taken by two threads 623

		 */
		
	}
	
}

class SumUp{
	 int start;
	 int end;
	 long count;
	  void  sum() {
		for(int i=start;i<end;i++) {
			count +=i;
		}
		
	}
}
