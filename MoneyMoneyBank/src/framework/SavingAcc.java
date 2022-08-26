package framework;

public abstract class SavingAcc extends BankAcc{
	private float isSalaried;
	private static final float MINBAL=0;
	
	public SavingAcc(int accNo, String accNm, float accBal, float isSalaried2) {
		super(accNo, accNm, accBal);
		this.isSalaried = isSalaried2;
	}
	public void withdraw(float accBal) {
		System.out.println("charges are: " +accBal);
	}
	@Override
	public String toString() {
		return "SavingAcc [isSalaried=" + isSalaried + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}
	
	
}