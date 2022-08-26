package framework;

public abstract class CurrentAcc extends BankAcc{
	private float creditLimit;
	
	public CurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		super(accNo, accNm, accBal);
		this.creditLimit = creditLimit ;
	}
	
	public float getcreditLimit() {
		return creditLimit;
	}

	public void setcreditLimit(float creditLimit) {
		this.creditLimit = creditLimit;
	}

	public void bookProduct(float creditLimit) {
		System.out.println("charges are: " +creditLimit);
	}
	@Override
	public String toString() {
		return "CurrentAcc [creditLimit=" + creditLimit + ", toString()=" + super.toString() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
}
