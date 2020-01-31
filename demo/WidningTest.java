package com.demo;

import java.io.IOException;
class ExtendTest{
	 void show() throws Exception
	 {
			
		}
	}
public class WidningTest extends ExtendTest{

	public void method(Integer a) 
    { 
          
        System.out.println("Primitive type byte formal argument :" + a); 
    } 
	public void method(String a) 
    { 
          
        System.out.println("Primitive type byte formal argument :" + a); 
    } 
	public static void main(String[] args) {
		Byte b=5;
		WidningTest test =new WidningTest();
		test.method("");
		int i= Integer.valueOf(10);
		Integer val = 1000;
		Integer val1 = 1000;
		System.out.println(val==val1);
		
	}
	
	 void show() throws  IOException{
		
	}

}

