package com.demo;
import java.util.Objects;
import java.util.function.DoubleToIntFunction;

@FunctionalInterface
public interface FunctionInt<T,R>{

     //<R> apply(T parameter);
	R show(T t);
	
//	default R calculate(T t, T t1){
//		return appl show(t1);
//		
//	}
	
}
