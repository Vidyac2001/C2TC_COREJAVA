package com.cg.bankapp.client;

import com.cg.bankapp.application.MMBankFactory;
import com.cg.bankapp.application.MMCurrentAcc;
import com.cg.bankapp.application.MMSavingAcc;
import com.cg.bankapp.framework.BankFactory;
import com.cg.bankapp.framework.CurrentAcc;
import com.cg.bankapp.framework.SavingAcc;

public class Client {

	public static void main(String[] args) {
		BankFactory bf= new MMBankFactory();
		
		SavingAcc sa=new MMSavingAcc(2356, "vidya", 50000, false);
		sa.withdraw(sa.getAccBal());
		sa.toString();
		
		
		CurrentAcc ca= new MMCurrentAcc(123, "balu", 50000, 20000);
		ca.withdraw(ca.getCreditLimit());
		ca.toString();
		

	}

}
