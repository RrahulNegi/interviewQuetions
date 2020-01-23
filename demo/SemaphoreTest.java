package com.demo;

import java.util.concurrent.Semaphore;

public class SemaphoreTest {

	public static void main(String[] args) {
		Semaphore sem =new Semaphore(3);
		for(int i=0;i<=10;i++){
			Thread td =new Thread(new MyThread(sem));
			td.start();
		}	
	}

}


class MyThread implements Runnable{
	Semaphore sem;
	MyThread(Semaphore sem){
		this.sem=sem;
	}

	@Override
	public void run(){
		try {
            System.out.println(Thread.currentThread().getName() + " is waiting for permit");
            sem.acquire();
            Thread.sleep(5000);
            sem.release();
            System.out.println(Thread.currentThread().getName() + " gets a permit."); 
        } catch (InterruptedException ex) {
       
	}
	
}}