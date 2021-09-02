package day4_threads;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * class to show the race condition while common resource or data is being accessed by multiple threads concurrently resulting in race condition 
 * @author Durga Prasad
 *
 */
public class ThreadUnsafeRaceCondition {

	int input;
    Random random = new Random();
    List<Integer>ouput = new ArrayList<>();
	public void printDivisibleBy5() {
		int count = 100000;

		for (int i = 0; i < count; i++) {
			if((input%5)==0){
				ouput.add(input);
			}
		}
	}

	public void modifyInput() {
		int count = 100000;
		for (int i = 0; i < count; i++) {
			input = random.nextInt(10000);
		}
	}
	
	public static void main(String[] args) {
		
		ThreadUnsafeRaceCondition turc = new ThreadUnsafeRaceCondition();
		Runnable runnable1 = new Runnable() {
			@Override
			public void run() {
				turc.printDivisibleBy5();
				
			}
		};
		
		Runnable runnable2 = new Runnable() {
			@Override
			public void run() {
				turc.modifyInput();
				
			}
		};
		
		Thread t1 = new Thread(runnable1);
		Thread t2 = new Thread(runnable2);
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		int count=0;
		for(int i:turc.ouput) {
			if(i%5!=0) {
				count++;
			}
		}
		
		System.out.println("wrong entries in the list which are not divisible by 5 "+ count );
		//wrong entries in the list which are not divisible by 5 3886

	}

}
