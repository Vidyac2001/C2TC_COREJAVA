package com.cg.bankapp.application;

import com.cg.bankapp.framework.SavingAcc;

public class MMSavingAcc extends SavingAcc { 
	
	private static final float MINBAL=400.0f;
	public MMSavingAcc(int accNo, String accNm, float accBal, boolean isSalary) {
		super(accNo, accNm, accBal, isSalary);
		// TODO Auto-generated constructor stub
	}

	
	public void withdraw(float accBal) {
		System.out.println("your saving account balance is "+accBal);
		System.out.println("dear user, you can withdraw money upto "+(accBal-MINBAL));
		
		
	}

	@Override
	public String toString() {
		return "MMSavingAcc [toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}

	
	
	

}
