package com.cg.finalkeyword;

public class FinalMethod {
	final int a=30;
	
	 public FinalMethod() {
		 System.out.println("Default constructor");
		 
	 }
	 
	 //final method - cannot be overriden in the sub class
	final void show()
	 {
		System.out.println("value of variable a "+a); 
	 }
	
	 public String print()
	 {
		 return "hello";
	 }

}




