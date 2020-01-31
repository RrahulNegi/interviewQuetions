package com.demo;

public class Java8Interface {

	public static void main(String[] args) {
		
		TestInterface tf =new TestInterface();
		tf.show();
		TestInt t=new TestInterface();
		t.show();
		TestInt t1;
	}

}

class TestInterface implements TestInt2, TestInt{

	@Override
	public void show() {
		
		TestInt2.super.show();
	}
	
}

interface TestInt {
	default void show(){
		System.out.println("In Interface Test");
	}
	public  static void show1(){
		System.out.println("In static");
	}
}

interface TestInt2 {
	default void show(){
		System.out.println("In Interface Test 2");
	}
}