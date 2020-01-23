package com.demo;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;

public class FutureTest {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		//FutureService fs= new FutureService(20, 30);
		FutureService  call=new FutureService(20, 30);
		
		ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(2);
		for(int i=0;i<=4;i++){
		System.out.println(executor.submit(call).get());
		}
	}

}

class FutureService implements Callable<Integer> {
	int a;
	int b;

	public FutureService(int a, int b) {
		this.a = a;
		this.b = b;
	}

	@Override
	public Integer call() throws Exception {
		System.out.println(Thread.currentThread().getName()+"Calling");
		Thread.sleep(1000);
		return this.a+this.b;
	}

}