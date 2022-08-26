package application;

import framework.SavingAcc;

public class MMSavingAcc extends SavingAcc {
	

	public MMSavingAcc(int accNo, String accNm, float accBal, float isSalaried) {
		super(accNo, accNm, accBal, isSalaried);
		
	}

	private static final float accBal=(float) 30000.0;
	
	public void withdraw(float accBal) {
		System.out.println("Dear saving account user, your balance is: " + getaccBal());
	}

	@Override
	public String toString() {
		return "MMSavingAcc [toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}

	
	
}