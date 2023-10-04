package com.cg.interfacedemo;

public class BankDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

SavingsAccount s1=new SavingsAccount("chetravi", "bellary", 100, 50000);
		
		System.out.println(s1);
		
		s1.deposit(20000);
		System.out.println(s1);
		
		s1.withdraw(40000);
		System.out.println(s1);
	}

}
