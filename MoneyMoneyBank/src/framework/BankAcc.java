package framework;

public abstract class BankAcc {
	private int accNo;
	private String accNm;
	private float accBal;
	public BankAcc(int accNo, String accNm, float accBal) {
		super();
		this.accNo = accNo;
		this.accNm = accNm;
		this.accBal = accBal;
	}
	
	
	public int getAccNo() {
		return accNo;
	}


	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}


	public String getAccNm() {
		return accNm;
	}


	public void setAccNm(String accNm) {
		this.accNm = accNm;
	}


	public float getaccBal() {
		return accBal;
	}


	public void setaccBal(float accBal) {
		this.accBal = accBal;
	}


	public void withdraw(float accBal) {
		System.out.println("product booked and the chrges are: " +accBal);
	}
	public void deposite(float accBal) {
		System.out.println("items are delivered with charges: " +accBal );
	}
	@Override
	public String toString() {
		return "ShopAcc [accNo=" + accNo + ", accNm=" + accNm + ", charges=" + accBal + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
}
