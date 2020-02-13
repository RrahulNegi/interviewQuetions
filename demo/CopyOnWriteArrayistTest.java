package com.demo;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayistTest {

	public static void main(String[] args) {
		//List<String> list =Arrays.asList("a","b","c","d");
		CopyOnWriteArrayList<String> list= new CopyOnWriteArrayList<>(Arrays.asList("a","b","c","d"));
				;
		Iterator<String> itr=list.iterator();
		while(itr.hasNext()){
			String value = itr.next();
			System.out.println("List Value:" + value);
			if (value.equals("c"))
				list.remove(value);
		}
		
		System.out.println(list);

	}

}
