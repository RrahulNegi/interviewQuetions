package com.demo;

public class LambdaInnerClass {

	public static void main(String[] args) {
		Thread t=new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("HIiiii");
				
			}
		});
		 t.start();
		 
		 Thread t1= new Thread(()->System.out.print("Helloooo"));
		 t1.start();
		 int a=10;
		 int b=100;
		 Calc c= (int a1,int b1)->System.out.println(a1+b1);
		 //System.out.println((a,b)->(a+b));
	c.calculate(10,100);
	}

}

@FunctionalInterface
interface Calc {
	public void calculate(int a, int b);
}