package application;

import framework.SavingAcc;
import framework.CurrentAcc;
import framework.BankFactory;

public class MMBankFactory extends BankFactory{

	@Override
	public SavingAcc getNewSavingAcc(int accNo, String accNm, float accBal, float isSalaried) {
		// TODO Auto-generated method stub
		SavingAcc mmsaving = new MMSavingAcc(accNo, accNm, accBal, isSalaried); // lazy initialization
		return null;
	}

	@Override 
	public CurrentAcc getNewCurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		// TODO Auto-generated method stub
		MMCurrentAcc mmcurrent = new MMCurrentAcc(accNo, accNm, accBal, creditLimit);
		return null;
	}

	@Override
	public SavingAcc getNewSavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
		// TODO Auto-generated method stub
		return null;
	}
	

}