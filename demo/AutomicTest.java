package com.demo;

import java.util.concurrent.atomic.AtomicInteger;

public class AutomicTest {

	public static void main(String[] args) {
		Counter counter =new Counter();
		Thread t1=new Thread(counter);
		Thread t2=new Thread(counter);

		/*Thread t3=new Thread(counter);
		Thread t4=new Thread(counter);

		Thread t5=new Thread(counter);
		Thread t6=new Thread(counter);*/
		t1.start();
		t2.start();
	/*	t3.start();
		t4.start();
		t5.start();
		t6.start();*/
		
	}

}

class Counter implements Runnable{
	int a=0;
	//AtomicInteger a = new AtomicInteger();
	@Override
	public void run() {
		System.out.println("Counting start...");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(int i=0;i<=5;i++){
		System.out.println("Thread Name :"+Thread.currentThread().getName()+" ::"+a++);
			//System.out.println("Thread Name :"+Thread.currentThread().getName()+" ::"+a.incrementAndGet());
		}
		
		
	}
	
}