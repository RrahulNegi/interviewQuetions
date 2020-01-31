package com.demo;

public class AbstractTest {

	public static void main(String[] args) {
		//AbstractC ab =new TestAb();
		I1 ab =new TestAb();
		ab.showAbstract();
				ab.show();
	}

}

interface I1 {
	public void show();
	default public void showAbstract(){
		System.out.println("In show Abstract inside Interface");
	}
}

abstract class AbstractC implements I1 {
	public abstract void show();
	public void showAbstract(){
		System.out.println("In show Abstract");
	}
}

class TestAb extends AbstractC{

	@Override
	public void show() {
		System.out.println("In Test");
		
	}
	
}