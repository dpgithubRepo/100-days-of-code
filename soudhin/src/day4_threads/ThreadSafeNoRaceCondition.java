package day4_threads;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


/**
 * Avoid race condition by using synchronized method or block 
 * @author Durga Prasad
 *
 */

public class ThreadSafeNoRaceCondition {

	int input;
	Random random = new Random();
	List<Integer> ouput = new ArrayList<>();

	public synchronized void printDivisibleBy5() {
		int count = 100000;

		for (int i = 0; i < count; i++) {
			if ((input % 5) == 0) {
				ouput.add(input);
			}
		}
	}

	public synchronized void modifyInput() {
		int count = 100000;
		for (int i = 0; i < count; i++) {
			input = random.nextInt(10000);
		}
	}

	public void printDivisibleBy5_1() {
		int count = 100000;

		for (int i = 0; i < count; i++) {
			synchronized (this) {
				if ((input % 5) == 0) {
					ouput.add(input);
				}

			}
		}
	}

	public void modifyInput_1() {
		int count = 100000;
		for (int i = 0; i < count; i++) {
			synchronized (this) {
				input = random.nextInt(10000);
			}

		}
	}

	public static void main(String[] args) {

		ThreadSafeNoRaceCondition tsnRC = new ThreadSafeNoRaceCondition();
		Runnable runnable1 = new Runnable() {
			@Override
			public void run() {
				tsnRC.printDivisibleBy5();  // synchronized method call

			}
		};

		Runnable runnable2 = new Runnable() {
			@Override
			public void run() {
				tsnRC.modifyInput();  // synchronized method call

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

		int count = 0;
		for (int i : tsnRC.ouput) {
			if (i % 5 != 0) {
				count++;
			}
		}

		System.out.println("wrong entries in the list which are not divisible by 5 " + count);

		Runnable runnable3 = new Runnable() {
			@Override
			public void run() {
				tsnRC.printDivisibleBy5_1(); //synchronized block

			}
		};

		Runnable runnable4 = new Runnable() {
			@Override
			public void run() {
				tsnRC.modifyInput_1();  //synchronized block

			}
		};

		Thread t3 = new Thread(runnable3);
		Thread t4 = new Thread(runnable4);

		t3.start();
		t4.start();

		try {
			t3.join();
			t4.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		count = 0;
		for (int i : tsnRC.ouput) {
			if (i % 5 != 0) {
				count++;
			}
		}
		System.out.println("wrong entries in the list which are not divisible by 5 " + count);
		
		//output
	//	wrong entries in the list which are not divisible by 5 0
	//	wrong entries in the list which are not divisible by 5 0

	}

}
