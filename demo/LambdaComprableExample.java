package com.demo;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaComprableExample {

	public static void main(String[] args) {
		EmployeeDataOnline em=new EmployeeDataOnline(1, "xxx");
		EmployeeDataOnline em1=new EmployeeDataOnline(90, "ee");
		EmployeeDataOnline em2=new EmployeeDataOnline(14, "ff");
		EmployeeDataOnline em3=new EmployeeDataOnline(78, "gg");
		EmployeeDataOnline em4=new EmployeeDataOnline(55, "aa");
		List<EmployeeDataOnline> list=Arrays.asList(em,em1,em2,em3,em4);
		list.stream().forEach(emp->System.out.println(emp));
		System.out.println("After Sorting");
		/* Using Comprator...
		 * Comparator<EmployeeDataOnline> byName = 
				(EmployeeDataOnline o1, EmployeeDataOnline o2)->o1.getName().compareTo(o2.getName());
		Collections.sort(list, byName);*/
		
		Collections.sort(list);
		list.stream().forEach(emp->System.out.println(emp));
	}

}


class EmployeeDataOnline implements Comparable<EmployeeDataOnline>{
	private int age;
	private String name;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee [age=" + age + ", name=" + name + "]";
	}
	public EmployeeDataOnline(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	@Override
	public int compareTo(EmployeeDataOnline o) {
	//	System.out.println(o.name.compareTo(this.name));
		return o.getName().compareTo(this.name);
	}
	
}