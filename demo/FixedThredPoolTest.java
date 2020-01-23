package com.demo;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FixedThredPoolTest {

	public static void main(String[] args) {
		ExecutorService executor= Executors.newFixedThreadPool(5);
		//ExecutorService executor= Executors.newSingleThreadExecutor();
		//ExecutorService executor= Executors.newCachedThreadPool();
		for(int i=0; i<=10;i++){
			Runnable worker=new Worker(""+i);
			executor.execute(worker);
		}
		executor.shutdown();
        while (!executor.isTerminated()) {
        }
        System.out.println("Finished all threads");
    }
	}




class Worker implements Runnable{
private String command;
    
    public Worker(String s){
        this.command=s;
    }
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+" Starting Thread... "+command);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(Thread.currentThread().getName()+" Ending Thread... "+command);
	}
	
}