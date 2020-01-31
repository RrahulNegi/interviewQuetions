package com.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class TreeSetTest {
	final static List foo;
	final String a="";
	public TreeSetTest(){
	foo =new ArrayList<String>();
	a="Rahul";
		//final static List foo =new ArrayList<String>();
	}
public static void main(String agres[]){
	
	foo.add(1);
	foo.add(2);
	foo.stream().forEach(x->System.out.println(x));
	TreeSet<Employee> tr=new TreeSet<Employee>();
	tr.add(new Employee(1,"Rahul"));
	tr.add(new Employee(2,"Rahul Singh"));
	tr.add(new Employee(5,"Ashish"));
	tr.stream().forEach(x->System.out.println(x));

}
}

class Employee implements Comparable<Employee>{
	private int id;
	private String name;
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public int compareTo(Employee o) {
		System.out.println("comparison :: "+name+" "+o.name.compareTo(name));
		return o.name.compareTo(name);
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	
	
	
}