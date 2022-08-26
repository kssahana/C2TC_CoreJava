package accountholder;

import application.MMCurrentAcc;
import application.MMSavingAcc;
import application.MMBankFactory;
import framework.CurrentAcc;
import framework.SavingAcc;
import framework.BankFactory;


public class AccountHolder {

	public static void main(String[] args) {
		BankFactory bf = new MMBankFactory();
		SavingAcc sa = new MMSavingAcc(123,"Girish",(float) 10000.0,15000);
		CurrentAcc ca = new MMCurrentAcc(456,"Jayadev",20000,3000);
		sa.withdraw(sa.getaccBal());
		sa.toString();
		ca.withdraw(ca.getcreditLimit());
		ca.toString();

	}

}
