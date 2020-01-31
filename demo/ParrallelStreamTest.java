package com.demo;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ParrallelStreamTest {

	public static void main(String[] args) {
		   List<EmployeeData> employees = Arrays.asList(
			         new EmployeeData(1276, "FFF",2000.00),
			         new EmployeeData(7865, "AAA",1200.00),
			         new EmployeeData(4975, "DDD",3000.00),
			         new EmployeeData(4499, "CCC",1500.00),
			         new EmployeeData(9937, "GGG",2800.00),
			         new EmployeeData(5634, "HHH",1100.00),
			         new EmployeeData(9276, "BBB",3200.00),
			         new EmployeeData(6852, "EEE",3400.00));

			      System.out.println("Original List");
			      printList(employees);

			      // Using sequential stream
			      long start = System.currentTimeMillis();
			      List<EmployeeData> sortedItems = employees.stream()
			         .sorted(Comparator
			            .comparing(EmployeeData::getName))
			         .collect(Collectors.toList());
			      long end = System.currentTimeMillis();

			      System.out.println("sorted using sequential stream");
			      printList(sortedItems);
			      System.out.println("Total the time taken process :"
			         + (end - start) + " milisec.");

			      // Using parallel stream
			      start = System.currentTimeMillis();
			      List<EmployeeData> anotherSortedItems = employees
			         .parallelStream().sorted(Comparator
			            .comparing(EmployeeData::getName))
			         .collect(Collectors.toList());
			      end = System.currentTimeMillis();

			      System.out.println("sorted using parallel stream");
			      printList(anotherSortedItems);
			      System.out.println("Total the time taken process :"
			         + (end - start) + " milisec.");


			      double totsal=employees.parallelStream()
			         .map(e->e.getSalary())
			         .reduce(0.00,(a1,a2)->a1+a2);
			      System.out.println("Total Salary expense: "+totsal);
			      Optional<EmployeeData> maxSal=employees.parallelStream()
			         .reduce((EmployeeData e1, EmployeeData e2)->
			         e1.getSalary()<e2.getSalary()?e2:e1);
			      if(maxSal.isPresent())
			         System.out.println(maxSal.get().toString());
			   }

			   public static void printList(List<EmployeeData> list) {
			      for (EmployeeData e : list)
			         System.out.println(e.toString());
			   }
			}

 class EmployeeData {
	   private int empid;
	   private String name;
	   private double salary;

	   public EmployeeData() {
	      super();
	   }

	   public EmployeeData(int empid, String name,
	         double salary) {
	      super();
	      this.empid = empid;
	      this.name = name;
	      this.salary = salary;
	   }

	   public int getEmpid() {
	      return empid;
	   }

	   public void setEmpid(int empid) {
	      this.empid = empid;
	   }

	   public String getName() {
	      return name;
	   }

	   public void setName(String name) {
	      this.name = name;
	   }

	   public double getSalary() {
	      return salary;
	   }

	   public void setSalary(double salary) {
	      this.salary = salary;
	   }

	   @Override
	   public String toString() {
	      return "Employee [empid=" + empid + ", name="
	         + name + ", salary=" + salary + "]";
	   }
	}