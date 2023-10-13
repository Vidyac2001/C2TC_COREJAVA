package com.cg.bankapp.framework;

public abstract class SavingAcc extends BankAcc {
	
	private boolean isSalary;
	private static final float MINBAL=400.0f;
	
	
	public SavingAcc(int accNo, String accNm, float accBal, boolean isSalary) {
		super(accNo, accNm, accBal);
		// TODO Auto-generated constructor stub
		this.isSalary=isSalary;
	}

	public abstract void withdraw(float accBal);
	
	

	public boolean isSalary() {
		return isSalary;
	}

	public void setSalary(boolean isSalary) {
		this.isSalary = isSalary;
	}

	public static float getMinbal() {
		return MINBAL;
	}

	@Override
	public String toString() {
		return "SavingAcc [isSalary=" + isSalary + "]";
	}
	
	

}
