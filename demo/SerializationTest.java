package com.demo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

public class SerializationTest {
	final static String deptName ="Rahul";
	
	public String getDeptName() {
		return deptName;
	}
	


	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		FileOutputStream fos=new FileOutputStream("aa.ser");
		ObjectOutputStream out =new ObjectOutputStream(fos);
		Address add =new Address();
		out.writeObject(new Department(1,"aa", 22, add));		
		
		FileInputStream fis =new FileInputStream("aa.ser");
		ObjectInputStream ois =new ObjectInputStream(fis);
		Department dd=(Department) ois.readObject();
		System.out.println(dd.name);
		System.out.println(dd.i);
		SerializationTest tt=new SerializationTest();
		System.out.println(deptName.hashCode());
		System.out.println(deptName+"aa".hashCode());
		int count=0;
		List<String> list =Arrays.asList("a", "b", "c", "d" ,"z");
		list.stream().parallel().forEach(x->System.out.print(x));
	/*	list.stream().forEach(x->{
			System.out.println(x);
			//System.out.println(count++);
		});*/
		
		list.spliterator().
		//count =(int) list.stream().peek(x->System.out.println(x)).count();
		//System.out.println("count"+count);
	}

}


class Department  extends Employeement implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int id=0;
	
	static  String name;
	 int age;
	 Address add;
	 public Department(int id, String name, int age, Address add) {
	//	public Department(int id, String name) {
		super();
		this.id = id;
		this.name = name;
		this.age= age;
		this.add=add;
	}
	
	
}

// we have to implements Serializable other wise it will throw error  java.io.NotSerializableException: com.demo.Address
class Address implements Serializable{
	
}

class Employeement {
	int i =100;
}