package com.demo;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class BlockingQueueTest {

	public static void main(String[] args) {
		BlockingQueue sharedBlockingQueue =new LinkedBlockingQueue();
		Thread prodThread = new Thread(new Producer(sharedBlockingQueue));
		Thread cosumerThread = new Thread(new Consumer(sharedBlockingQueue));
		prodThread.start();
		cosumerThread.start();
	}

}

class Producer implements Runnable{
	BlockingQueue sharedBlockingQueue;
	Producer(BlockingQueue sharedBlockingQueue){
		this.sharedBlockingQueue=sharedBlockingQueue;
	}
	@Override
	public void run() {
		for(int i=0;i<=10;i++){
			 try {
	                System.out.println("Produced: " + i);
	                sharedBlockingQueue.put(i);
	                Thread.sleep(5000);
	            } catch (InterruptedException ex) {
	            }
		}
		
	}
	
}


class Consumer implements Runnable{
	BlockingQueue sharedBlockingQueue;
	Consumer(BlockingQueue sharedBlockingQueue){
		this.sharedBlockingQueue=sharedBlockingQueue;
	}
	@Override
	public void run() {
		for(int i=0;i<=10;i++){
			 try {
	                System.out.println("Consumer: " + sharedBlockingQueue.take());
	            } catch (InterruptedException ex) {
	            }
		}
		
	}
	
}