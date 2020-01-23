package com.demo;

import java.io.Serializable;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LambdaExample  extends ClassLoader implements Serializable{
public static void main(String args[]){
	FunctionInt<String, String> adderLambda = (value) -> "Hello: "+value;
	//System.out.println(adderLambda.show("Rahul"));
	Predicate<String> pred =(val) -> "aa" == val;
	/*System.out.println(pred.test("bb"));
	 System.out.println(pred.negate().test("cc"));
	 	Predicate<String> prd = (value) -> value!=null;*/
	List<String> listStr=Arrays.asList("a","b","c");
	/*System.out.println(listStr.size());
	System.out.println(listStr.stream().
			filter(val -> val!="a").
			filter(val -> val=="c").
			count());
	*/
	 Predicate<String> p = (s)->s.startsWith("G");
	 
	 List<String>list=listStr.stream().
	 peek(x->x.toLowerCase()).collect(Collectors.toList());//forEach(System.out.println);
	// listStr.stream().forEach(System.out::println);
	// HashMap
	 List<String> al =new ArrayList<String>();
	 al.add(0,"a");
	 
	 List<Integer> listl =Arrays.asList(1,2,3,4,5);
	 List<String> list2 = Arrays.asList("a","b","c");
	 List<Object> list3 = new ArrayList<Object>();
	 List<Integer> list4 =Arrays.asList(1,2,3,4,5);
	 List<List<Integer>> finalList=Arrays.asList(listl, list4);
	 
//	 finalList.add(listl);
//	 finalList.add(list4);
	 
	 list3.add(listl);
	 list3.add(list2);
	 finalList.stream().peek(list1->System.out.println("list1 size :"+list1.size())).flatMap(x->x.stream()).forEach(System.out::println);
	 
	 List<Integer> listInt= IntStream.of(1,2,3,4,5).boxed()
			    .collect(Collectors.toList());
	 
	 System.out.println("Exception: "+show());
	 
	 
	  ZonedDateTime currentZone = ZonedDateTime.now();  
	    System.out.println("the current zone is "+ 
	                        currentZone.getZone());  

	    LocalDate date = LocalDate.now(); 
        System.out.println("the current date is "+ 
                            date); 
	 // get the next saturday 
        LocalDate nextSaturday =  
                date.with(TemporalAdjusters. 
                          next(DayOfWeek.SATURDAY)); 
          
        System.out.println("next satuday from now is "+ 
                            nextSaturday);
        
        String a="rahul";
        a.concat("singh");
        
        
        //use of intern---
        String s = new String("String"); // "abc" will not be added to String constants pool.
        	    System.out.println(System.identityHashCode(s));
        	    s = s.intern();// add s to String constants pool
        	    System.out.println(System.identityHashCode(s));

        	    String str1 = new String("hello");
        	    String str2 = "hello";
        	    String str3 = str1.intern();
        	    System.out.println(System.identityHashCode(str1));
        	    System.out.println(System.identityHashCode(str2));
        	    System.out.println(System.identityHashCode(str3));
        	    
        	   System.out.println(null);
        	    
        	    
}

public static int show(){
	try{
		return 1;
	}finally{
		return 2;
	}
}
}
