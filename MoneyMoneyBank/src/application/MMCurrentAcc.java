package application;

import framework.CurrentAcc;

public class MMCurrentAcc extends CurrentAcc{
		
		
		public MMCurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
			super(accNo, accNm, accBal, creditLimit);
			
		}

		public void withdraw(float creditLimit) {
			System.out.println("Dear current account user, your balance are: " + getaccBal()+ "along with creditlimit:" + getcreditLimit());
		}
		@Override
		public String toString() {
			return "MMCurrentAcc [toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
					+ hashCode() + "]";
		}
		
		
		
	}