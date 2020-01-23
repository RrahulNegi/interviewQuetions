package com.demo;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierTest {

	public static void main(String[] args) throws InterruptedException {
		final CyclicBarrier cb =new CyclicBarrier(3);
		
		for(int i=0;i<=5;i++){
			Thread t =new Thread(new Task(cb));
			
			t.start();
			 Thread.sleep(5000);
		}
	}

}


 class Task implements Runnable{
	 private CyclicBarrier barrier;

     public Task(CyclicBarrier barrier) {
         this.barrier = barrier;
     }
     @Override
	public void run(){
		try {
            System.out.println(Thread.currentThread().getName() + " is waiting on barrier");
            Thread.sleep(5000);
            barrier.await();
            System.out.println(Thread.currentThread().getName() + " has crossed the barrier");
        } catch (InterruptedException ex) {
        } catch (BrokenBarrierException ex) {

        }
	}
}