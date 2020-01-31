package com.demo;

public class InterfaceTest {

	public static void main(String[] args) {
		I i= new Test();
	}

}

interface I{
	public void m();
	public void m1();
}

class Test implements I{

	@Override
	public void m() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
	}
	public void m2(){
		System.out.println("hii");
	}
}