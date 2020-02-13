package com.demo;

public class EnumSingeltonTest {

	public static void main(String[] args) {
		Singelton singelton=Singelton.getInstance();
		Singelton singelton1=Singelton.getInstance();
		System.out.println(singelton.hashCode());
		System.out.println(singelton1.hashCode());
		
		LazySingelton lazySingelton =LazySingelton.getLazySingelton();
		LazySingelton lazySingelton1 =LazySingelton.getLazySingelton();
		System.out.println("lazySingelton= "+lazySingelton.hashCode());
		System.out.println("lazySingelton1= "+lazySingelton1.hashCode());

		NormalClass normalClass=new NormalClass();
		NormalClass normalClass1=new NormalClass();
		System.out.println("normalClass= "+normalClass.hashCode());
		System.out.println("normalClass1= "+normalClass1.hashCode());
	}

}
 enum Singelton{
	 INSTANCE;
	 
	 public static Singelton getInstance(){
		 return INSTANCE;
	 }
 }
 
 class LazySingelton {
	private static LazySingelton lazySingelton;
	 private LazySingelton(){
		 
	 }
	 
	 static LazySingelton getLazySingelton(){
		 if(lazySingelton==null){
			 lazySingelton= new LazySingelton();
		 }
		return lazySingelton;
	 }
 }
 
 class NormalClass {
	 public NormalClass(){
		 
	 }
 }