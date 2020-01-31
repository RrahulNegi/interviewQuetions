package com.demo;

public class AbstractPoly extends Poly2 {
	public  void show() {
		System.out.println("inside show AbstractPoly");
	}
	public static void main(String[] args) {
		Poly2 p=new AbstractPoly();
		p.show();

	}

}

abstract class Poly2{
	public  void show() {
		System.out.println("inside show Poly2");
	}
	public void display() {
		System.out.println("inside display Poly2");
	}
}