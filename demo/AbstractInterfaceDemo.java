package com.demo;

public class AbstractInterfaceDemo extends AbstractClassTest implements NewInterface{

	public static void main(String[] args) {
		NewInterface intf= new AbstractInterfaceDemo();
		System.out.println(intf.sum(10, 100));
		
	}

	@Override
	public void show() {
		System.out.println("Hellooo");		
	}

}
