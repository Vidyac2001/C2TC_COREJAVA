package com.cg.bankapp.application;

import com.cg.bankapp.framework.BankFactory;
import com.cg.bankapp.framework.CurrentAcc;
import com.cg.bankapp.framework.SavingAcc;

public class MMBankFactory extends BankFactory {

	@Override
	public SavingAcc getNewSavingAccount(int accNo, String accNm, float accBal, boolean isSalary) {
		MMSavingAcc mmsaving= new MMSavingAcc(accNo, accNm, accBal, isSalary);
		return mmsaving;
	}

	@Override
	public CurrentAcc getNewCurrentAccount(int accNo, String accNm, float accBal, float creditLimit) {
		MMCurrentAcc mmcurrent=new MMCurrentAcc(accNo, accNm, accBal, creditLimit);
		return mmcurrent;
	}

	
	
	
	
}
