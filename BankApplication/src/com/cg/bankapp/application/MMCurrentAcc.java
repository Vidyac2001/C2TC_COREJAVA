package com.cg.bankapp.application;

import com.cg.bankapp.framework.CurrentAcc;

public class MMCurrentAcc extends CurrentAcc {
	

	public MMCurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		super(accNo, accNm, accBal, creditLimit);
		// TODO Auto-generated constructor stub
	}

	public void withdraw(float creditLimit) {
		
		System.out.println("hey user, your credit limit is:" + creditLimit);
		
	}

	@Override
	public String toString() {
		return "MMCurrentAcc [toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}
	
	

	
	
	
	

}
