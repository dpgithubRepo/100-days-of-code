package day3;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProdConsWithBlockingQueue {
	
	public static void main(String[] args) {
		
		//A blocking queue is a queue that blocks when you try to dequeue from it and the queue is empty, 
		//or if you try to enqueue items to it and the queue is already full. A thread trying to dequeue from 
		//an empty queue is blocked until some other thread inserts an item into the queue.
		BlockingQueue<Double> bQueue = new ArrayBlockingQueue<>(10);
		
		
		//Producer
		 Runnable producer = ()->{
			while(true) {
				try {
					double d = Math.random();
					System.out.println("producer producing "+d);
					bQueue.put(d);  // this is blocked if the blocking Queue is already full (10 items in this case)
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		
		new Thread(producer).start();
		new Thread(producer).start();
		
		

		//Consumer
		Runnable consumer = ()->{
			while(true) {
				double d;
				try {
					d = bQueue.take(); //this is blocked until the queue has some items in it
					Thread.sleep(1000);
					System.out.println("consumer consuming " + d);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
			}
	};
	
	new Thread(consumer).start();
	
	}

}
